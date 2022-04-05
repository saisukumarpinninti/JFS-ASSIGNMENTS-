//Assignment 02  :
//Q1 :
console.log("Q1");

class Fibonacci{
    previousNo=Symbol();
    currentNo=Symbol();
    constructor(){
        this.previousNo=0;
        this.currentNo=1;
    }
    next(){
        let nxt=Symbol();
        nxt = this.previousNo + this.currentNo;
        this.previousNo=this.currentNo;
        this.currentNo=nxt;
        return nxt;
    }
}

let obj =new Fibonacci();
// console.log(obj);
console.log("Fibonacci series End");
console.log(obj.next()); // 1
console.log(obj.next()); // 2
console.log(obj.next());   // 3
console.log(obj.next());    // 5

console.log("Q2");

//Q2 : 
const  listArmStrong=[0, 1, 153, 370, 371, 407];
let n = 0;
function Q2() {
    return { getNextArmstrong : function() {n += 1; return { value: listArmStrong[n], done: false };}};}
  // Create Iterable
var n1 = Q2();
console.log("Armstrong numbers are : ");
console.log(n1.getNextArmstrong());
console.log(n1.getNextArmstrong());
console.log(n1.getNextArmstrong());
console.log(n1.getNextArmstrong());
console.log(n1.getNextArmstrong());

//Q3 :
console.log("Q3");

//code to check a number is armstrong or not
function isArmstrong(number) {
    let sum = 0;
    let temp = number;
    while (temp > 0) {
        let digit = temp % 10;
        sum += digit ** 3;
        temp = Math.floor(temp / 10);
    }
    return (number == sum);
}
//Generator function tocall isArmstrong and reset the value of n if n is greater than 1000
function *getNextArmstrong1(){
    let i=0;
    while(true){
        if( isArmstrong(i)){
            yield i;
        }
        if(i>1000){
            i=0;
            yield "number is too larger";
        }
        i++;
    }
}
console.log("Armstrong numbers are : ");
console.log("using Generator");
var g = getNextArmstrong1();
console.log(g.next().value);
console.log(g.next().value)
console.log(g.next().value)
console.log(g.next().value)
console.log(g.next().value)
console.log(g.next().value)
console.log(g.next().value) // number is too larger 
console.log(g.next().value)
console.log(g.next().value)
console.log(g.next().value)

//Q4 :

//using set to store users
var croom1 = new Map();
var croom2 = new Map();
// adding users and messages
croom1.set("user1", ["Hello", "How are you?", "I am fine", "Thank you"]);
croom1.set("user2", ["Hi", "How are you?", "I am fine", "Thank you"]);
croom1.set("user3", ["Hello", "How are you?", "I am fine", "Thank you"]);
croom2.set("user4", ["Hello", "How are you?", "I am fine", "Thank you"]);
croom2.set("user5", ["Hello", "How are you?", "I am fine", "Thank you"]);
croom2.set("user6", ["Hello", "How are you?", "I am fine", "Thank you"]);
//printing users and messages
var printusers= (room,name)=>{
    console.log(`Users in room name  ${name} are : `);
    for(let key of room.keys()){console.log(key);}
}
var printmessages= (room,name)=>{
    console.log(`Messages in room name  ${name} are : `);
    for(let value of room.values()){console.log(value);}
}
printusers(croom1,"chatroom1");
printusers(croom2,"chatroom2");
printmessages(croom1,"chatroom1");
printmessages(croom2,"chatroom2");