import { Component, OnInit } from "@angular/core";
import { Course } from "./course";
import { CourseService } from "./course.service";

@Component({
    templateUrl: './course-list.components.html'
})

export class CourseListComponent implements OnInit {

    filteredCourses: Course[] = [];

    _courses: Course[] = [];

    _filterBy: string = '';

    constructor(private courseService: CourseService) { }
    async ngOnInit(): Promise<void> {
        this._courses = await this.courseService.retriveAll();
        this.filteredCourses = this._courses
    }

   async deleteById(courseId: number): Promise<void> {
       await this.courseService.deleteById(courseId);
       await this.ngOnInit();
    }

    set filter(value: string) {
        this._filterBy = value;

        this.filteredCourses = this._courses.filter((course: Course) => course.name.toLocaleLowerCase().indexOf(this._filterBy.toLocaleLowerCase()) > -1);
    }

    get filter() {
        return this._filterBy;
    }
}