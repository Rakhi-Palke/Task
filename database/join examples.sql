create database example1;
use example1;
create table edu(
rollno int(30),
fname varchar(200),
femail varchar(200)
);
drop database example1;
show tables from example1;
INSERT INTO edu values
(101,'rakhi','rakhi@gamil.com'),
(102,'riya','riya@gamil.com'),
(103,'isha','isha@gamil.com');
select * from edu;


create table joinexmpl(
enrollno int(5),
fullname varchar(100));

insert into joinexmpl values
(106,"XYZ"),
(105,"PQR"),
(111,"ABC"),
(101,"MNO"),
(102,"DEF");
drop table join1;
drop table joinexmpl;
create table join1 (
enrollno varchar(5),
email varchar(100));

insert into join1 values
("101","xyz@gmail.com"),
("102","pqr@gmail.com"),
("103","abc@gmail.com"),
("104","mno@gmail.com"),
("105","def@gmail.com");

SELECT * FROM joinexmpl CROSS JOIN join1 ;

select * from joinexmpl inner join join1 where  joinexmpl.enrollno=join1.enrollno;

select * from joinexmpl natural join join1;
select * from joinexmpl left outer join join1 on (joinexmpl.enrollno=join1.enrollno);
select * from joinexmpl right outer join join1 on (joinexmpl.enrollno=join1.enrollno);
select * from joinexmpl full join join1 on (joinexmpl.enrollno=join1.enrollno);




