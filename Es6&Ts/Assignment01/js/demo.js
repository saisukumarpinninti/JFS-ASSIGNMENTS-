//Q1 
// Declaring Using const :
const c = "Sai sukumar";
console.log(c + " intial Value"); //Sai sukumar
//c = "sukumar"; // Changing the value of const c :
//will give error as const is immutable 
//Q2 : 
var str = "Sai sukumar";
Q2(str);
function Q2(str) {
    if (str.length > 0) {
        let strres = str.split(" ");
        console.log(strres);
    }
    else {
        console.log("String is less than 0");
    }
    //return strres;  -   //returning the value of strres
    // but it will not be returned as the scope of let is only within the function .
}
//Q3 :
var Order = {
    id: 11,
    title: 'order',
    price: 1000,
    printOrder() {
        return (this.id + " " + this.title + " " + this.price);
    },
    getPrice() {
        return (this.price);
    }
};
var order1 = Object.assign(Order); //creating a new object from the existing object using Object.assign()
console.log(order1.printOrder()); //10 order 100
console.log(order1.getPrice()); //100
order1.id = 20; //changing the value of id
order1.title = 'order1'; //changing the value of title
order1.price = 200; //changing the value of price
console.log(order1.printOrder()); //20 order1 200
console.log(order1.getPrice()); //200
//Q4 :
let names = ['Tom', 'Ivan', 'Jerry'];
var Q4 = (names) => {
    let res = names.map((n) => { let r = { name: n, length: n.length }; return (r); });
    return res;
};
console.log(Q4(names));
//Q5 :
//1.
function add(a, b = 10) {
    return (a + b);
}
//2.
console.log(add(10, 40));
console.log(add(10));
function userFriends(username, ...arg) {
    console.log("Name: " + username);
    console.log("userFriends: ");
    for (var i in arg) {
        console.log(arg[i]);
    }
}
userFriends("Sukumar", "Mohan", "Nilofer", "Abhiram");
let arr = ["Jayanth", "Harsha", "Pavan", "Sukumar", "Usman"];
userFriends("Mohan", ...arr);
//3.
function printCapitalNames(...names) {
    console.log("Names after");
    for (var i in names) {
        console.log(names[i].toUpperCase());
    }
}
printCapitalNames(...arr);
//Q6 :
function laptop(model, deskno, name) {
    console.log(`The  laptop is From :${model}, desk no:${deskno},name:${name}`);
}
laptop("Lenovo", "330", "Sai sukumar");
//Q7 
//1
var [e1, e2, e3, e4] = arr;
console.log(e3);
//2
let organization = {
    Name: "Amazon",
    adress: {
        city: "Vijayawada",
        state: "AP",
        pincode: 534001
    }
};
let { adress: { pincode: p } } = organization;
console.log(p);
