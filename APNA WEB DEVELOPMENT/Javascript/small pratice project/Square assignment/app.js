// square of some number in this pratice question ?
let square=(n)=>{
    return n*n;
}
console.log(square(7));
let square2=function sqaure(n){
    return n*n;
}
console.log(square2(8));
// print hello world of interval of 2s
let interval=setInterval(() => {
    console.log("hello pratu");
}, 2000);
console.log(interval)
setTimeout(() => {
    clearInterval(interval)
    console.log("set time out of interval ok ???");
}, 10000);
