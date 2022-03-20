create table customer (
id integer auto_increment , 
name varchar(255) not null,
email char(255),
primary key(id)
);

INSERT INTO customer (id,name,email)
VALUES(1001,'sai','s@123');
INSERT INTO customer (id,name,email)
VALUES(1002,'a','a@123');
INSERT INTO customer  (id,name,email)
VALUES(1003,'i','sai@123');

select * from customer