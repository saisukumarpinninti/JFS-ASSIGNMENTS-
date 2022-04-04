// Q1 :

class Rectangle {
    constructor(width, height) {
        this.width = width;
        this.height = height;
    }
    //Q2 : 
    getArea = () => { return this.width * this.height; };
    getPerimeter = () => { return 2 * (this.width + this.height); };
}
r = new Rectangle(2, 3);
console.log(`Rectangle r width is ${r.width}, length is ${r.height} `);
console.log(`rectangle r of length ${r.length} & width  ${r.width} has area ${r.getArea()} and perimeter ${r.getPerimeter()}`);

//Q3 :
s = new Rectangle(4,10);
console.log(`New rectangle s of length ${s.length} & width  ${s.width} has area ${s.getArea()} and perimeter ${s.getPerimeter()}`);
s.width = 5;
console.log(`rectangle s of length ${s.length} & Changed width  ${s.width} has area ${s.getArea()} and perimeter ${s.getPerimeter()}`);

//Q4 : 
var myObject = {firstname: "Sai",lastname: "p",age: "22",city: "Brahampur",state: "Odisha",country: "India"};
console.log(`First-name is ${myObject.firstname} , lastname  is ${myObject.lastname} , age is ${myObject.age} , city is ${myObject.city} , state is ${myObject.state} , country is ${myObject.country}`);
myObject.lastname = "Pinninti";
console.log(`Changed Lastname ${myObject.lastname}`);
//Q5 :
console.log(`since there is no middle name defined The middle name is : ${myObject.MiddleName}`);
myObject.MiddleName = "Sukumar";
console.log(`After defining The middle name is : ${myObject.MiddleName}`);

//Q6 :
var string = "{firstName:'Nikki', age:19, city:'Brahampur', state:'Odisha', country:'India'}";
eval('var obj='+string);
console.log(obj);
myObject.MiddleName = "Nikitha";
console.log(` The middle name is : ${myObject.MiddleName}`);

//Q7 :
var obj = '{ "firstName":"sai", "lastName":"Sukumar" }';
obj = JSON.parse(obj); //converts to a regular object
console.log(obj); //John