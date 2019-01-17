export class Task {
    public name: string;
    public category: string;
    public level: number;
    public dueDate: string;
    public completed: boolean;

    constructor(name: string, category: string, level: number, dueDate: string, completed: boolean) {
        this.name = name;
        this.category = category;
        this.level = level;
        this.dueDate = dueDate;
        this.completed = completed;
    }
}
