import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './features/login/login.component';
import { RegisterComponent } from './features/register/register.component';
import { PendingRequestsComponent } from './features/pending-requests/pending-requests.component';
import { MainMapComponent } from './features/main-map/main-map.component';
import { UserPanelComponent } from './features/user-panel/user-panel.component';
import { TopBarComponent } from './views/top-bar/top-bar.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MatIconModule } from '@angular/material/icon';
import { MaterialModule } from './material.module';
import { AdvertisementsComponent } from './features/advertisements/advertisements.component';
import { AdFormComponent } from './features/advertisements/ad-form/ad-form.component';

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
		AdFormComponent
	],
	imports: [
		BrowserModule,
		AppRoutingModule,
		BrowserAnimationsModule,
		MatIconModule,
		MaterialModule
	],
	providers: [],
	bootstrap: [AppComponent]
})
export class AppModule {
}
