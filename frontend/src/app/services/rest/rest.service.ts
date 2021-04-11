import { Injectable } from '@angular/core';
import { environment } from '../../../environments/environment';
import { HttpClient, HttpErrorResponse } from '@angular/common/http';
import { Observable, throwError } from 'rxjs';
import { catchError } from 'rxjs/operators';

@Injectable({
	providedIn: 'root'
})
export class RestService {

	URL = environment.API;

	constructor(private http: HttpClient) {
	}

	async getAll(url: string) {
		return await this.http.get<any>(this.URL + url, { withCredentials: true })
		.pipe(
			catchError(this.handleError)
		).toPromise();
	}

	save(url: string, body: any): Observable<any> {
		return this.http.post<any>(this.URL + url, body, { withCredentials: true })
		.pipe(
			catchError(this.handleError)
		);
	}

	update(url: string, body: any): Observable<any> {
		return this.http.post<any>(this.URL + url, body, { withCredentials: true })
		.pipe(
			catchError(this.handleError)
		);
	}

	remove(url: string) {
		return this.http.delete<any>(this.URL + url, { withCredentials: true })
		.pipe(
			catchError(this.handleError)
		);
	}


	private handleError(error: HttpErrorResponse) {
		if (error.error instanceof ErrorEvent) {
			console.error('An error occurred:', error.error.message);
		} else {
			console.error(
				`Backend returned code ${error.status}, ` +
				`exception was: ${error.error.message}`);
		}
		return throwError(error);
	}
}
