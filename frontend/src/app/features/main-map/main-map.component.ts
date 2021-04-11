import { Component, OnInit } from '@angular/core';
import Map from 'ol/Map';
import View from 'ol/View';
import OSM from 'ol/source/OSM';
import * as olProj from 'ol/proj';
import TileLayer from 'ol/layer/Tile';


declare var ol: any;

@Component({
	selector: 'app-main-map',
	templateUrl: './main-map.component.html',
	styleUrls: ['./main-map.component.scss']
})
export class MainMapComponent implements OnInit {


	map;
	latitude: number = 51.1079;
	longitude: number = 17.03085;
	wasteCategories = ["Batteries", "Electronics", "Glass", "Medical", "Metals", "Plastic", "Other"]

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
				zoom: 12
			})
		});

		var vectorLayer = new ol.layer.Vector({
			source:new ol.source.Vector({
				features: [new ol.Feature({
					geometry: new ol.geom.Point(ol.proj.transform([parseFloat(String(this.longitude)), parseFloat(String(this.latitude))], 'EPSG:4326', 'EPSG:3857')),
				})]
			}),
			style: new ol.style.Style({
				image: new ol.style.Icon({
					anchor: [0.5, 0.5],
					anchorXUnits: "fraction",
					anchorYUnits: "fraction",
					src: "https://upload.wikimedia.org/wikipedia/commons/e/ec/RedDot.svg"
				})
			})
		});
		this.map.addLayer(vectorLayer);
	}



}
