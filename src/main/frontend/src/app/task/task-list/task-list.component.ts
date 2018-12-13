import { Component, OnInit } from '@angular/core';
import {Task} from "../task.model";
import {TaskService} from "../task.service";
import set = Reflect.set;

@Component({
  selector: 'app-task-list',
  templateUrl: './task-list.component.html',
  styleUrls: ['./task-list.component.css']
})
export class TaskListComponent implements OnInit {
  tasks: Task[] = [];

  constructor(private taskServic: TaskService) { }

  ngOnInit() {
      this.taskServic.getTasks().subscribe(
          (tasks: any[]) => {
              this.tasks = tasks;
              },
          (error) => console.log(error)
          );
  }

    getDueDateLabel(task: Task) {
      return task.isCompleted ? 'label-success' : 'label-primary';
    }

    onTaskChange($event: any, task: Task) {
      set(task, "isCompleted", $event.target.checked);
      this.taskServic.save(task);
    }
}
