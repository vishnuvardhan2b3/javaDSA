function add(...rest){
    let sum=0;
    for(let i of rest){
        sum=sum+i;
    }
    return sum;
}
console.log(add(10,20,30,40,50,60))