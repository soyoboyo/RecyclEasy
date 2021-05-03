import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

import { PendingRequestsComponent } from './features/pending-requests/pending-requests.component';
import { UserPanelComponent } from './features/user-panel/user-panel.component';
import { TopBarComponent } from './views/top-bar/top-bar.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MatIconModule } from '@angular/material/icon';
import { MaterialModule } from './material.module';
import { AdvertisementsComponent } from './features/advertisements/advertisements.component';
import { AdFormComponent } from './features/advertisements/ad-form/ad-form.component';
import { ReactiveFormsModule } from '@angular/forms';
import { RestService } from './services/rest/rest.service';
import { HttpClientModule } from '@angular/common/http';
import { LoginComponent } from './features/auth/login/login.component';
import { RegisterComponent } from './features/auth/register/register.component';
import { MainMapComponent } from './features/places/main-map/main-map.component';
import { PlaceFormComponent } from './features/places/place-form/place-form.component';


@NgModule({
	declarations: [
		AppComponent,
		LoginComponent,
		RegisterComponent,
		PendingRequestsComponent,
		MainMapComponent,
		UserPanelComponent,
		TopBarComponent,
		AdvertisementsComponent,
		AdFormComponent,
		PlaceFormComponent
	],
	imports: [
		BrowserModule,
		AppRoutingModule,
		BrowserAnimationsModule,
		MatIconModule,
		MaterialModule,
		ReactiveFormsModule,
		HttpClientModule
	],
	providers: [RestService],
	bootstrap: [AppComponent]
})
export class AppModule {
}
