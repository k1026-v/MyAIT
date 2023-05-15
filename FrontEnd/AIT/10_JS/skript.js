function multiply (a,b) {
    return a*b
}

console.log( multiply (2,5) );

const multiplyArrow = (a, b) => a*b; 
console.log( multiplyArrow (6,5));

const obj ={
    userName: 'John',
    sayHello:function (params) {
        console.log(`Hello ${this.userName}`);
    }
}

obj.sayHello;

