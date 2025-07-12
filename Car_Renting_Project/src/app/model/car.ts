export class Car {
    carId: number;
    brand: string;
    model: string;
    year: number = 0;
    color: string;
    dailyRate?: number;
    carImage: string;
    regNo: string;

    constructor() {
        this.carId = 0;
        this.brand = "";
        this.model = "";
        this.year = 0;
        this.color = "";
        this.dailyRate = 0;
        this.carImage = "";
        this.regNo = "";
    }
}

export interface IcarList {
    carId: number;
    brand: string;
    model: string;
    year: number;
    color: string;
    dailyRate?: number;
    carImage: string;
    regNo: string;
}

export interface PeriodicElement {
    firstName: string;
    lastName: string;
    age: number;
    gender: string;
    username: string;
}