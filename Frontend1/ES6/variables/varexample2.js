var $var12=200;
function example() {
    var $var12=300;
    console.log("inside example()function=" +$var12);
}
console.log("outside example()function="+$var12);
example();