import {Component, OnInit} from "@angular/core";
import {of} from "rxjs";
import {TaskService} from "../task/task.service";

@Component({
    selector: "app-observable",
    template: "",
    providers: [TaskService]
})
export class ObservableComponent implements OnInit{

    constructor(private taskService: TaskService){}

    ngOnInit(): void {
        const observable = of(1, 3, 4);
        const observer = {
            next: x => console.log("get value: " + x),
            error: err => console.error('Observer got an error: ' + err),
            complete: () => console.log('Observer got a complete notification'),
        };
        observable.subscribe(observer);

        of(1, 2, 4).subscribe(
            response => console.log("get value: " + response),
            err => console.log("error: " + err),
            () => console.log("complete")
        );

        this.taskService.getTasks();
    }
}
