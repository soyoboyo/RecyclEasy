import { Component, Input, OnInit, ViewChild } from '@angular/core';
/// <reference types="@types/googlemaps" />
// @ts-ignore
import {} from 'googlemaps';
import { RestService } from '../../../services/rest/rest.service';

@Component({
	selector: 'app-main-map',
	templateUrl: './main-map.component.html',
	styleUrls: ['./main-map.component.scss']
})
export class MainMapComponent implements OnInit {


	@ViewChild('gmap', { static: true }) gmapElement: any;
	map: google.maps.Map;

	latitude: number = 51.107901;
	longitude: number = 17.030851;
	userLat: any;
	userLon: any;

	@Input() selectedLatlng;
	currentMarker = null;

	wasteCategories = ["Batteries", "Electronics", "Glass", "Medical", "Metals", "Plastic", "Other"]
	places = [];

	constructor(private http: RestService) {
		this.getRandomPlaces();
	}


	async getLocationSimple() {
		await navigator.geolocation.getCurrentPosition((position) => {
			console.log("Got position", position.coords);
			this.userLat = position.coords.latitude;
			this.userLon = position.coords.longitude;
			const myLatLng = { lat: position.coords.latitude, lng: position.coords.longitude };
			new google.maps.Marker({
				position: myLatLng,
				map: this.map,
				title: "Hello World!",
				label: "YOU ARE HERE"
			});
			this.map.setCenter(myLatLng)

		}, () => {
			console.error('problem with location')
		}, { timeout: 5000 });
		console.log('process location');
	}

	ngOnInit() {
		this.getPlaces()
		this.getLocationSimple();
		// console.log(this.userLat + ' ' + this.userLon);
		var mapProp = {
			center: new google.maps.LatLng(this.latitude, this.longitude),
			zoom: 15,
			mapTypeId: google.maps.MapTypeId.ROADMAP
		};

		this.map = new google.maps.Map(this.gmapElement.nativeElement, mapProp);

		google.maps.event.addListener(this.map, 'click', (event) => {
			this.selectedLatlng = event.latLng.toJSON();
			// console.log(this.selectedLatLng);

			this.placeMarker(event.latLng);
		});


	}

	placeMarker(location): void {
		if (this.currentMarker && this.currentMarker.setMap) {
			this.currentMarker.setMap(null);
		}

		this.currentMarker = new google.maps.Marker({
			position: location,
			map: this.map
		});

	}

	async getPlaces() {
		this.places = await this.http.getAll('/place/getAll');
		console.log(this.places);
		this.places.forEach((p) => {
			new google.maps.Marker({
				position: { lat: p.latitude, lng: p.longitude },
				map: this.map,
				label: p.name,
				title: p.address
			});
		})
	}

	async getRandomPlaces() {
		const cities = ["Warszawa", "Wroclaw", "Krakow", "Szczecin"];
		const garbageTypes = ["Batteries", "Electronics", "Glass", "Medical", "Metals", "Plastic", "Other"];
		for (let i = 0; i < 1000; i++) {
			let randomCity = cities[Math.floor(Math.random() * cities.length)];
			let randomGarbageTypes = this.getRandomGarbage(garbageTypes, this.getRandomInt(0, garbageTypes.length));
			let body = { "city": randomCity, "garbageTypes": randomGarbageTypes };
			console.log(body);
			this.http.save('/place/filter', body).subscribe((response) => {
				console.log(response);
			}, (error) => {

			});
		}


	}

	getRandomGarbage(arr, n): string[] {
		var result = new Array(n),
			len = arr.length,
			taken = new Array(len);
		if (n > len)
			throw new RangeError("getRandom: more elements taken than available");
		while (n--) {
			var x = Math.floor(Math.random() * len);
			result[n] = arr[x in taken ? taken[x] : x];
			taken[x] = --len in taken ? taken[len] : len;
		}
		return result;
	}

	getRandomInt(min, max) {
		min = Math.ceil(min);
		max = Math.floor(max);
		return Math.floor(Math.random() * (max - min + 1)) + min;
	}

}
