import { Component, OnInit } from '@angular/core';
import {Task} from "../task.model";

@Component({
  selector: 'app-task-list',
  templateUrl: './task-list.component.html',
  styleUrls: ['./task-list.component.css']
})
export class TaskListComponent implements OnInit {
  tasks: Task[] = [];

  constructor() { }

  ngOnInit() {
      this.tasks.push(new Task(1, "task 1", "15/12/2018", false));
      this.tasks.push(new Task(2, "task 2", "25/12/2018", false));
      this.tasks.push(new Task(3, "task 3", "18/12/2018", false));
  }

    getDueDateLabel(task: Task) {
        return task.isCompleted ? 'label-success' : 'label-primary';
    }

    onTaskChange($event: any, task: Task) {

    }
}
