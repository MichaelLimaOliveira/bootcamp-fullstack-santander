import { Component, OnInit } from "@angular/core";
import { Course } from "./course";

@Component({
    selector: 'app-course-list',
    templateUrl: './course-list.components.html'
})

export class CourseListComponent  implements OnInit {

    courses: Course[] = [];

    ngOnInit(): void {
        this.courses = [
            {
                id: 1,
                name: 'Angular: Forms',
                imageUrl: '',
                price: '99.99',
                code: 'XPS-8796',
                duration: 120,
                rating: 5.4
            }
        ]
    }
}