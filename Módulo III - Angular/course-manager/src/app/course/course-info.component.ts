import { Component, OnInit } from "@angular/core";
import { ActivatedRoute, Router } from "@angular/router";
import { Course } from "./course";
import { CourseService } from "./course.service";

@Component({
    templateUrl: './course-info.component.html'
})
export class CourseInfoComponent implements OnInit {

    course: Course;

    constructor(private activatedRoute: ActivatedRoute, private courseService: CourseService, private router: Router) {
        this.course = {
            id: 0,
            name: "",
            releaseDate: "",
            description: "",
            duration: 0,
            code: "",
            rating: 0,
            price: 0,
            imageUrl: ""
        }
    }

    async ngOnInit(): Promise<void> {
        let id = this.activatedRoute.snapshot.paramMap.get('id');

        if(id){
            this.course = await this.courseService.retrieveById(+id);
        }
    }

    async update(): Promise<Course> {
       let saveId =  this.courseService.update(this.course)
       return saveId
    }
}