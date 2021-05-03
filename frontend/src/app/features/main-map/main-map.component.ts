import { Component, OnInit, ViewChild } from '@angular/core';
/// <reference types="@types/googlemaps" />
// @ts-ignore
import {} from 'googlemaps';

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
	wasteCategories = ["Batteries", "Electronics", "Glass", "Medical", "Metals", "Plastic", "Other"]
	places = [
		{
			name: "asdfasd",
			adress: "asdfasd",
			latitude: "asdfasd",
			longitude: "asdfasdfasdf"
		}
	];

	constructor() {

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
				label: "my marker"
			});
			this.map.setCenter(myLatLng)

		}, () => {
			console.error('problem with location')
		}, { timeout: 5000 });
		console.log('process location');
	}

	ngOnInit() {

		this.getLocationSimple();
		console.log(this.userLat + ' ' + this.userLon);
		var mapProp = {
			center: new google.maps.LatLng(this.latitude, this.longitude),
			zoom: 15,
			mapTypeId: google.maps.MapTypeId.ROADMAP
		};

		this.map = new google.maps.Map(this.gmapElement.nativeElement, mapProp);
		const myLatLng = { lat: this.userLat, lng: this.userLon };
		new google.maps.Marker({
			position: myLatLng,
			map: this.map,
			title: "Hello World!",
			label: "YOU ARE HERE"
		});


	}


}
