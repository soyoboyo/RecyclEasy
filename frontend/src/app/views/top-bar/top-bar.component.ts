import { Component, OnInit } from '@angular/core';
import { Location } from '@angular/common';

@Component({
	selector: 'app-top-bar',
	templateUrl: './top-bar.component.html',
	styleUrls: ['./top-bar.component.scss']
})
export class TopBarComponent implements OnInit {


	activeTab = '';

	constructor(location: Location) {
		this.activeTab = location.path();
	}

	setActiveTab(url: string): void {
		this.activeTab = url;
	}

	ngOnInit(): void {
	}
}
