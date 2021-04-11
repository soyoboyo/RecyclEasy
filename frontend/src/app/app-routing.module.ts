import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { MainMapComponent } from './features/main-map/main-map.component';
import { AdvertisementsComponent } from './features/advertisements/advertisements.component';
import { LoginComponent } from './features/login/login.component';
import { RegisterComponent } from './features/register/register.component';
import { PendingRequestsComponent } from './features/pending-requests/pending-requests.component';
import { UserPanelComponent } from './features/user-panel/user-panel.component';
import { AdFormComponent } from './features/advertisements/ad-form/ad-form.component';

const routes: Routes = [
	{ path: '', component: MainMapComponent, pathMatch: 'full' },
	{ path: 'advertisements', component: AdvertisementsComponent, pathMatch: 'full' },
	{ path: 'login', component: LoginComponent, pathMatch: 'full' },
	{ path: 'register', component: RegisterComponent, pathMatch: 'full' },
	{ path: 'pending', component: PendingRequestsComponent, pathMatch: 'full' },
	{ path: 'user', component: UserPanelComponent, pathMatch: 'full' },
	{ path: 'new-ad', component: AdFormComponent, pathMatch: 'full' },

];

@NgModule({
	imports: [RouterModule.forRoot(routes)],
	exports: [RouterModule]
})
export class AppRoutingModule {
}
