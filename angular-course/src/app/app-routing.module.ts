import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { NotFoundComponent } from "./shared/not-found/not-found.component";

const routes: Routes = [
  {path:'',redirectTo: 'courses',pathMatch:'full'},
  {path:'courses',loadChildren:()=> import('./courses/courses.module').then(c => c.CoursesModule)},
  {path:'**',component:NotFoundComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
