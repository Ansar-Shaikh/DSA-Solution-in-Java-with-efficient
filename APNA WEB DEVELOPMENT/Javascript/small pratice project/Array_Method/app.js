// foreach loop 
let num=[1,2,3,4,5,6,7,9,7,10]
num.forEach((el)=>{
    console.log(el*el);
})
// map 
let double=num.map((el)=>{
    console.log(el*el);
})
let number=[1,2,3,4]
 let result=number.reduce((acc,el)=>{
    console.log(acc,el)
    return acc+el;
})
console.log(" number of sum like using reduce function :",result)
console.log("max number is ");
let max=[1,2,3,4,5,6,7,8,9];
let res=max.reduce((a,e)=>{
    if(e> a){
        return e;
    }
    else {
        return a;
    }
})
console.log("max number is:::",res);
let str="pratu"
console.log(...str)
console.log(...num,`spread method is used in array ${max } \n`,...max)
