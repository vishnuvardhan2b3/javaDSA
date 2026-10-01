function sum(...nums){
    let sum=0;
    for(let i of nums){
        sum=sum+i;
    }
    return sum;
}
console.log(sum(10,20,30))
