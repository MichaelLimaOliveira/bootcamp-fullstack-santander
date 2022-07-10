import { Injectable } from '@angular/core';
import { Observable, of } from 'rxjs';

@Injectable({
	providedIn: 'root',
})
export class AnimalService {
	constructor() {}

	getAnimal(): Observable<any> {
		let animalArray = [
			{
				race: 'Baleia',
				name: 'pinpom',
			},
			{
				race: 'dog',
				name: 'tito',
			},
			{
				race: 'cat',
				name: 'gatineo',
			},
			{
				race: 'chinchila',
				name: 'chinchi',
			},
		];

    return of(animalArray)
	}
}
