export class Task {
    public name: string;
    public dueDate: string;
    public isCompleted: boolean;

    constructor(name: string, dueDate: string, isCompleted: boolean) {
        this.name = name;
        this.dueDate = dueDate;
        this.isCompleted = isCompleted;
    }
}
