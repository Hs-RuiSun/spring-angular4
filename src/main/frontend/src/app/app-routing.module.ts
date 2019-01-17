import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {TaskEditComponent} from "./task/task-edit/task-edit.component";
import {TaskListComponent} from "./task/task-list/task-list.component";

const routes: Routes = [
    { path:"edit/:id", component: TaskEditComponent },
    { path: 'tasks', component: TaskListComponent },
    { path: '', redirectTo: '/tasks', pathMatch: 'full' }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
