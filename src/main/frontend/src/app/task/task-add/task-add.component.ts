import { Component, OnInit } from '@angular/core';
import {Task} from "../task.model";
import {TaskService} from "../task.service";

@Component({
  selector: 'app-task-add',
  templateUrl: './task-add.component.html',
  styleUrls: ['./task-add.component.css']
})
export class TaskAddComponent implements OnInit {
  defaultCategory: string = "personal";
  defaultLevel: number = 1;
  constructor(private taskService: TaskService) { }

  ngOnInit() {
  }


  addTask(event){
      console.log(event.target.value + this.getTodayAsString());
      let task: Task = new Task(event.target.value, this.defaultCategory, this.defaultLevel, this.getTodayAsString(), false);
      console.log(task);
      this.taskService.save(task).subscribe(
          (newTask: Task) => {
              console.log(newTask.name);
              this.taskService.onTaskAdded.emit(newTask);
              //this.taskName = '';
          }
      );
  }

    getTodayAsString() {
        let today = new Date();
        let dd: any = today.getDate();
        let mm: any = today.getMonth() + 1;
        let yyyy = today.getFullYear();
        if (dd < 10) {
            dd = '0' + dd;
        }
        if (mm < 10) {
            mm = '0' + mm;
        }
        return yyyy + '-' + mm + '-' + dd;
    }
}
