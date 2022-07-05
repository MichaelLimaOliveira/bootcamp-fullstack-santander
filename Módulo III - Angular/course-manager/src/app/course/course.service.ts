import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { firstValueFrom, Observable } from "rxjs";
import { Course } from "./course";

@Injectable({
    providedIn: 'root'
})
export class CourseService {

    private coursesUrl: string = 'http://localhost:3100/api/courses'

    constructor(private httpClient: HttpClient) { }

    async retriveAll(): Promise<Course[]> {

        try {
            let courses = await firstValueFrom(this.httpClient.get<Course[]>(this.coursesUrl));

            if (!courses) {
                throw new Error('Lista nao encontrada')
            };

            return courses;
        } catch (error) {
            throw error;
        }
    }

    async retrieveById(id: number): Promise<Course> {
        try {
            let course = await firstValueFrom(this.httpClient.get<Course>(`${this.coursesUrl}/${id}`));

            if (!course) {
                throw new Error('Curso nao encontrado')
            }
            return course
        } catch (error) {
            throw error
        }
    }

    async update(course: Course): Promise<Course> {

        try {
            let courseId = await firstValueFrom(this.httpClient.put<Course>(`${this.coursesUrl}/${course.id}`, course));

            if (!course.id) {
                throw new Error('Id do curso nao emcontrado');
            }
            return courseId
        } catch (error) {
            throw error
        }
    }

    async deleteById(id: number): Promise<void> {
        try {
            await firstValueFrom(this.httpClient.delete(`${this.coursesUrl}/${id}`))
            if (!id) {
                throw new Error('Curso nao existe');
            }
        } catch (error) {
            throw error
        }
    }

    // return this.httpClient.post<Course>(`${this.coursesUrl}`, course);


}
