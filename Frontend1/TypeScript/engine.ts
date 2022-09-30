class Car {
    engine:string;
    constructor(engine:string) {
        this.engine=engine
    }
    disp():void {
        console.log("function displays engine is:" +this.engine)
    }
}
var obje=new Car("XXSY1")
console.log("READING ATTRIBUTE VALUE ENGINE AS:" +obje.engine)