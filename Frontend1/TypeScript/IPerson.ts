interface IPerson {
    firstName:string,
    lastName:string,
    sayHi:()=>string
}
var customer:IPerson= {
    firstName:"Tom",
    lastName:"Hanks",
    sayHi:():string=>{return "hi there"}
}
console.log("customer object")
console.log(customer.firstName)
console.log(customer.lastName)
console.log(customer.sayHi())
