import { NgModule } from "@angular/core";
import { RouterModule } from "@angular/router";
import { Error404Component } from "./component/error-404/error-404.component";
import { NaveBarComponent } from "./component/nav-bar/nav-bar.component";


@NgModule({
    declarations: [
        NaveBarComponent
    ],
    imports: [
        RouterModule.forChild([
            {
                path: '**', component: Error404Component
            }
        ])
    ],
    exports: [
        NaveBarComponent
    ]
})
export class CoreModule {

}