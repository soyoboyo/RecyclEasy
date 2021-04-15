import { Component, OnInit } from '@angular/core';
import { RestService } from '../../../services/rest/rest.service';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
	selector: 'app-ad-form',
	templateUrl: './ad-form.component.html',
	styleUrls: ['./ad-form.component.scss']
})
export class AdFormComponent implements OnInit {

	advertForm: FormGroup;

	constructor(private http: RestService,
				private formBuilder: FormBuilder) {
	}

	ngOnInit(): void {
		this.advertForm = this.formBuilder.group({
			type: ['', [Validators.required]],
			title: ['', [Validators.required]],
			description: ['', [Validators.required]],
			email: ['', [Validators.required]],
			phone: ['', [Validators.required]]

		});
	}

	submit(): void {
		console.log(this.advertForm.value);
		let body = this.advertForm.value;
		this.http.save('/create/ad', body).subscribe((response) => {
			console.log(response);
		}, (error) => {

		});

	}

}
