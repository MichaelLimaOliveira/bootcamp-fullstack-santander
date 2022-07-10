import { Injectable } from '@angular/core';
import { Observable, of } from 'rxjs';


@Injectable({
  providedIn: 'root'
})
export class PeopleService {

  constructor() { }

  getPeople(): Observable<any> {
    let peopleArray = [
      {
        firstName: 'Michael',
        lastName: 'Oliveira',
        age: 28
      },
      {
        firstName: 'Estevão',
        lastName: 'Alves',
        age: 22
      },
      {
        firstName: 'Augusto',
        lastName: 'Kaic',
        age: 22
      }
    ];

    return of(peopleArray);
  }
}
