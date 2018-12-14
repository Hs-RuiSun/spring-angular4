export class Task {
    public name: string;
    public dueDate: string;
    public completed: boolean;

    constructor(name: string, dueDate: string, completed: boolean) {
        this.name = name;
        this.dueDate = dueDate;
        this.completed = completed;
    }
}
