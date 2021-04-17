import { Component, OnInit } from '@angular/core';
import { RestService } from '../../services/rest/rest.service';

@Component({
	selector: 'app-advertisements',
	templateUrl: './advertisements.component.html',
	styleUrls: ['./advertisements.component.scss']
})
export class AdvertisementsComponent implements OnInit {

	advertisements = [
		{
			"title": "APEXTRI",
			"about": "Eiusmod aliqua ipsum sint anim do incididunt pariatur duis reprehenderit adipisicing est ipsum adipisicing ullamco. Amet minim sint sunt eiusmod mollit laboris id non voluptate ad. Veniam sit non est anim excepteur cillum dolore irure. Labore ut labore elit officia. Esse quis labore aute exercitation nulla laboris magna commodo eiusmod pariatur. Cupidatat id dolore proident in aliquip. Nulla duis nulla dolor qui sit officia culpa aute.\r\n",
			"email": "morrisonhurley@apextri.com",
			"phone": "+1 (915) 515-2530",
			"address": "976 Cleveland Street, Ezel, Kentucky, 1851"
		},
		{
			"title": "BLUPLANET",
			"about": "Eu deserunt pariatur ex nisi ullamco officia in enim sunt labore est. Fugiat adipisicing ipsum mollit sit excepteur incididunt quis. Enim pariatur cupidatat occaecat cillum irure eu eiusmod consequat id veniam adipisicing aute nisi nulla. Consectetur nostrud labore nisi adipisicing adipisicing excepteur velit aliquip incididunt ipsum exercitation. Consequat incididunt occaecat culpa esse dolore elit. Amet enim culpa proident sint reprehenderit nostrud voluptate magna ad dolore veniam consectetur adipisicing. Labore cupidatat non enim sint esse labore nisi occaecat Lorem ullamco.\r\n",
			"email": "morrisonhurley@bluplanet.com",
			"phone": "+1 (842) 439-2604",
			"address": "736 Porter Avenue, Aberdeen, Nebraska, 1139"
		},
		{
			"title": "CALLFLEX",
			"about": "Quis sit ad deserunt aute. Ad velit nulla officia dolore ad nisi proident labore duis. Cupidatat cupidatat non qui commodo sint duis esse reprehenderit qui duis in nisi cupidatat consequat. Anim dolor commodo nisi duis Lorem laboris. Laboris nulla non officia excepteur enim magna Lorem culpa minim velit laborum.\r\n",
			"email": "morrisonhurley@callflex.com",
			"phone": "+1 (918) 545-2838",
			"address": "323 Bedell Lane, Allentown, Guam, 2255"
		},
		{
			"title": "DIGIFAD",
			"about": "Laboris ipsum qui nulla aliqua cupidatat ullamco tempor exercitation. Eiusmod elit eiusmod ex nulla ad nisi Lorem incididunt cupidatat pariatur ullamco id duis Lorem. Sunt voluptate voluptate aliquip minim ut sint magna laborum cillum ut et. Esse mollit sunt sunt mollit duis officia dolor nulla ut occaecat voluptate.\r\n",
			"email": "morrisonhurley@digifad.com",
			"phone": "+1 (919) 600-2122",
			"address": "171 Varet Street, Hollins, North Carolina, 615"
		},
		{
			"title": "KONGLE",
			"about": "Velit nostrud proident pariatur veniam consequat do eiusmod officia est nisi non reprehenderit. Labore pariatur excepteur commodo anim consectetur eiusmod voluptate dolor consequat est et dolor officia. Laborum culpa dolor proident irure reprehenderit qui quis minim exercitation anim nostrud proident commodo laborum. Do tempor est nisi non.\r\n",
			"email": "morrisonhurley@kongle.com",
			"phone": "+1 (814) 525-2387",
			"address": "474 Prospect Place, Hoehne, Ohio, 162"
		}
	];


	constructor(private http: RestService) {
	}

	ngOnInit(): void {
		this.getAds();
		console.log(this.advertisements);
	}

	async getAds() {
		const response = await this.http.getAll('/advertisement/getAll');

		this.advertisements = this.advertisements.concat(response);
	}

}
