import { Component, OnInit } from '@angular/core';
import Map from 'ol/Map';
import View from 'ol/View';
import OSM from 'ol/source/OSM';
import * as olProj from 'ol/proj';
import TileLayer from 'ol/layer/Tile';
// import * as ol from 'openlayers';

declare var ol: any;

@Component({
	selector: 'app-main-map',
	templateUrl: './main-map.component.html',
	styleUrls: ['./main-map.component.scss']
})
export class MainMapComponent implements OnInit {


	map;
	latitude: number = 51.107901;
	longitude: number = 17.030851;
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

	ngOnInit(): void {
		this.map = new Map({
			target: 'places_map',
			layers: [
				new TileLayer({
					source: new OSM()
				})
			],
			view: new View({
				center: olProj.fromLonLat([this.longitude, this.latitude]),
				zoom: 8
			})
		});

		var vectorLayer = new ol.layer.Vector({
			source: new ol.source.Vector({
				features: [new ol.Feature({
					geometry: new ol.geom.Point(ol.proj.fromLonLat([this.latitude, this.longitude])),
					// geometry: new ol.geom.Point(ol.proj.transform([parseFloat(String(this.longitude)), parseFloat(String(this.latitude))], 'EPSG:4326', 'EPSG:3857')),
				})]
			}),
			// style: new ol.style.Style({
			// 	image: new ol.style.Icon({
			// 		anchor: [1, 1],
			// 		anchorXUnits: "fraction",
			// 		anchorYUnits: "fraction",
			// 		src: "https://openlayers.org/en/v4.6.4/examples/data/icon.png"
			// 	})
			// })
		});
		this.map.addLayer(vectorLayer);
	}



}
