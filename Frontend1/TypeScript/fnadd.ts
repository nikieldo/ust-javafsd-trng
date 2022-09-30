function addNumbers(...nums:number[]) {
    var x;
    var sum:number=0;
    for(x=0;x<nums.length;x++) {
        sum=sum+nums[x];
    }
    console.log("sum of the numbers",sum)
}
addNumbers(1,2,3)
addNumbers(10,10,10,10,10)