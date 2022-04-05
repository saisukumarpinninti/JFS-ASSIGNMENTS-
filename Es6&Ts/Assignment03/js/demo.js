//Assignment03  : 
//Q1 :
var x = new Promise((resolve, reject) => setTimeout(resolve, 100, (Math.random() * 100)));
var y = new Promise((resolve, reject) => setTimeout(resolve, 100, Math.random() * 100));
Promise.all([x, y]).then((values) => {
    const total = values.reduce((p, c) => p + c);
    console.log(total);
});
Promise.resolve(x).then((value) => { console.log(value); });
Promise.resolve(y).then((value) => { console.log(value); });
//Q2 : 
class Account {
    constructor(id, name, balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
}
class SavingAccount extends Account {
    constructor(id, name, balance, interest) {
        super(id, name, balance);
        this.id = id;
        this.name = name;
        this.balance = balance;
        this.interest = interest;
    }
}
class CurrentAccount extends Account {
    constructor(id, name, balance, cashCredit) {
        super(id, name, balance);
        this.id = id;
        this.name = name;
        this.balance = balance;
        this.cashCredit = cashCredit;
    }
}
let totalBankBalance = (...accounts) => {
    let totalBalance = 0;
    accounts.forEach((singleAccount) => {
        if (singleAccount.constructor.name === "SavingAccount") {
            totalBalance =
                totalBalance + singleAccount.balance + singleAccount.interest;
        }
        else {
            totalBalance += singleAccount.balance;
            totalBalance -= singleAccount.cashCredit;
        }
    });
    return totalBalance;
};
const account1 = new SavingAccount(123847334, "Sukumar", 40000, 10000);
const account2 = new CurrentAccount(1518600347, "Bablu", 25000, 10000);
const account3 = new SavingAccount(151860233, "Latha", 90000, 2000);
const account4 = new CurrentAccount(151860323, "Jyanth", 40000, 5000);
console.log("Total Balance in Bank is: " +
    totalBankBalance(account1, account2, account3, account4));
class Circle {
    constructor(radius) {
        this.radius = radius;
    }
    print() {
        return `The radius of Cicle is ${this.radius} Area is  ${(Math.PI * this.radius * this.radius)}`;
    }
}
class Employee {
    constructor(empname, empid, designation) {
        this.empname = empname;
        this.empid = empid;
        this.designation = designation;
    }
    print() {
        return `Employee Details:\n Employee Id:${this.empid}\n Employee Name: ${this.empname}\n Employee Designation: ${this.designation}`;
    }
}
function printAll(obj1, obj2) {
    console.log(obj1.print());
    console.log(obj2.print());
}
let circleObj = new Circle(2);
let employeeObj = new Employee("Sukumar", 1, "jr analyst");
printAll(circleObj, employeeObj);
