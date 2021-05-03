import { Component, Input, OnChanges, OnInit, SimpleChanges } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { RestService } from '../../../services/rest/rest.service';

@Component({
	selector: 'app-place-form',
	templateUrl: './place-form.component.html',
	styleUrls: ['./place-form.component.scss']
})
export class PlaceFormComponent implements OnInit, OnChanges {


	placeForm: FormGroup;

	@Input() selectedLatLng;

	constructor(private http: RestService,
				private formBuilder: FormBuilder) {
		this.placeForm = this.formBuilder.group({
			name: ['', [Validators.required]],
			address: ['', [Validators.required]],
			latitude: ['', [Validators.required]],
			longitude: ['', [Validators.required]]
		});
	}

	ngOnInit(): void {

	}


	submit(): void {
		console.log(this.placeForm.value);
		let body = this.placeForm.value;
		this.http.save('/place/create', body).subscribe((response) => {
			console.log(response);
		}, (error) => {

		});

	}

	updateFormWithNewLocation(latLng) {
		if (!!latLng) {
			this.placeForm.controls['latitude'].patchValue(latLng['lat']);
			this.placeForm.controls['longitude'].patchValue(latLng['lng']);

		}
	}

	ngOnChanges(changes: SimpleChanges): void {
		console.log('changes');
		console.log(changes);
		this.updateFormWithNewLocation(changes['selectedLatLng'].currentValue);
	}
}
