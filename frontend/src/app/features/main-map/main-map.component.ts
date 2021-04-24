import { Component, OnInit, ViewChild } from '@angular/core';

/// <reference types="@types/googlemaps" />
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
	lat: any;
	lon: any;
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


	ngOnInit() {
		var mapProp = {
			center: new google.maps.LatLng(this.latitude, this.longitude),
			zoom: 15,
			mapTypeId: google.maps.MapTypeId.ROADMAP
		};

		this.map = new google.maps.Map(this.gmapElement.nativeElement, mapProp);
		const myLatLng = { lat: this.latitude, lng: this.longitude };
		new google.maps.Marker({
			position: myLatLng,
			map: this.map,
			title: "Hello World!",
			label: "my marker"
		});
		navigator.geolocation.getCurrentPosition((position) => {
			console.log("Got position", position.coords);
			this.lat = position.coords.latitude;
			this.lon = position.coords.longitude;
		});
		console.log(this.lat + ' ' + this.lon);
	}

}
