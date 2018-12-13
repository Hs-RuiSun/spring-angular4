export class Task {
    private _id: number;
    private _name: string;
    private _dueDate: string;

    set id(value: number) {
        this._id = value;
    }

    set name(value: string) {
        this._name = value;
    }

    set dueDate(value: string) {
        this._dueDate = value;
    }

    set isCompleted(value: boolean) {
        this._isCompleted = value;
    }

    private _isCompleted: boolean;

    constructor(id: number, name: string, dueDate: string, isCompleted: boolean) {
        this._id = id;
        this._name = name;
        this._dueDate = dueDate;
        this._isCompleted = isCompleted;
    }


}
