create database student;
use student;
create table info(
s_id int(3),
s_name varchar(20),
s_email varchar(50),
s_mark int(100),
s_age int(50),
s_place varchar(50)
);
 create table info1(
s_id int(3),
s_name varchar(20),
s_email varchar(50),
s_mark int(100),
s_age int(50),
s_place varchar(50)
);
 
select * from info;
drop table info;
drop table info1;
insert into info values(101,"Pranita","pranita@gmail.com", 80,22,"pune"),
(102,"Meera","Meera@gmail.com", 90,23,"chennai"),
(103,"Radha","radha@gmail.com",30,24,"Nagpur"),
(104,"Khushi","kushi@gmail.com", 55,22,"pune"),
(105,"Rani","rani@gmail.com", 55,24,"Nashik"),
(106,"Nikita","nikita@gmail.com", 65,21,"Mumbai"),
(107,"Ram","ram@gmail.com", 90,18,"chennai"),
(108,"Pranav","pranav@gmail.com",40,19,"pune");

insert into info1 values(101,"Pranita","pranita@gmail.com", 80,22,"Nanded"),
(102,"Meera","Meera@gmail.com", 90,23,"Pune"),
(103,"Radha","radha@gmail.com",30,24,"Nashik"),
(104,"Khushi","kushi@gmail.com", 55,22,"pune"),
(105,"Rani","rani@gmail.com", 55,24,"Mumbai"),
(106,"Nikita","nikita@gmail.com", 65,21,"pune"),
(107,"Ram","ram@gmail.com", 90,18,"Chennai"),
(108,"Pranav","pranav@gmail.com",40,19,"pune");

select * from info where s_age=22 and s_mark between 70 and 80;

select * from info where s_age<=20 or s_mark<=70;

select * from info where s_id=101 or 105 and s_name='Pranita' or 'rani';
select * from info where `s_id` in(101,105);
select * from info where s_id in(105,108);
select * from info where `s_id` not in(101,105);
select * from info where s_id between 101 and 105;
select * from info where s_mark not between 65 and 75;
select * from info where `s_id` not in(106,104) and s_mark between 40 and 70;
SELECT * FROM info ORDER BY s_id DESC;
SELECT * FROM info ORDER BY s_id ASC;

select min(s_mark) from info;
select max(s_mark) from info;
select count(s_mark) from info;

SELECT AVG(s_mark) FROM info;

SELECT SUM(s_mark) FROM info ;
SELECT s_place FROM info
UNION
SELECT s_place FROM info1;

/*to select all the duplicate elements*/
SELECT s_place FROM info
UNION ALL
SELECT s_place FROM info1;

/* case statement*/
select s_name, s_mark, case 
when s_mark>60 then 'Good Student'
when s_mark<60 then 'Avegarge Student'
end as grade from info;

SELECT 
   s_mark
FROM 
   info
ORDER BY 
  s_mark ASC;
SELECT 
   s_mark
FROM 
   info
ORDER BY 
  s_mark DESC;

select * from info
order by s_mark,s_name ASC;

/*not null contstarint*/
create table persons(
ID int not null,
LastName varchar(255) not null,
FirstName varchar(255) not null,
age int);
select * from persons;
alter table persons modify age int not null;
desc persons;
use persons;
drop table persons;
ALTER TABLE persons DROP age ;
ALTER TABLE Persons
DROP INDEX age;

/*uniue contstarint*/
alter table persons
add unique (id,firstname);

CREATE TABLE Persons (
    ID int NOT NULL,
    LastName varchar(255) NOT NULL,
    FirstName varchar(255),
    Age int,
    CONSTRAINT UC_Person UNIQUE (ID,LastName)
);
alter table persons drop constraint uc_persons ;
ALTER TABLE Persons
DROP INDEX UC_Person;

/*for single primary keys*/
CREATE TABLE stud (
    ID int(5) primary key,
    LastName varchar(255) ,
    FirstName varchar(255),
    Age int(2)
);
desc stud;
drop table stud;
/*for multiple primary keys*/
CREATE TABLE stud (
    ID int(5) not null,
    LastName varchar(255) not null,
    FirstName varchar(255) not null,
    Age int(2),
    constraint tempory primary key(id,lastname,firstname,age)
);

/*add multple primary key in existing table*/
CREATE TABLE stud (
    ID int(5),
    LastName varchar(255) not null ,
    FirstName varchar(255) not null,
    Age int(2)
);
alter table stud 
add constraint temp primary key(firstname, lastname);

insert into stud values
(104,"Khushi","pqr",19),
(105,"Rani","",20),
(106,"Nikita","",19),
(107,"Ram","xyz",19),
(108,"xyz","pqr",20);

CREATE TABLE stud (
    personID int(5) primary key,
    firstName varchar(255) not null,
    lastName varchar(255) not null
);
insert into stud values
(101,"Khushi","pqr"),
(102,"Rani","xyz"),
(103,"Nikita","abc");
desc stud;
CREATE TABLE Orders (
    OrderID int NOT NULL,
    OrderNumber int NOT NULL,
    PersonID int    
);
 alter table orders
 add constraint fk_personorder
 foreign key(personid) references stud(personid);
 alter table orders
 drop foreign key fk_personorder ;
 desc orders;
drop table orders;
insert into orders values
(1,5784,101),
(2,4737,102),
(3,3567,103);
select * from orders;
create table empolyee(
e_id int(5) not null,
e_name varchar(100) not null,
degn varchar(100) not null,
d_id int(5) primary key
);
insert into empolyee values 
(101,"rakhi","developer",1),
(102,"ragini","developer",2),
(103,"pooja","developer",3);
drop table empolyee;

create table depart(
d_id int ,
d_name varchar(100)
);

 insert into depart values 
 (1,"dotnet"),
 (2,"java"),
 (3,"php");
 drop table depart;
/*to limit the column check constraint*/
CREATE TABLE Persons (
    ID int NOT NULL,
    LastName varchar(255) NOT NULL,
    FirstName varchar(255),
    Age int,
    CHECK (Age>=18)
);
insert into persons values(101,"p","rakhi",18);
 select *  from persons;
 drop table persons;
 
 /*default */
 CREATE TABLE Persons (
    ID int NOT NULL,
    LastName varchar(255) NOT NULL,
    FirstName varchar(255),
    Age int,
    City varchar(255) DEFAULT 'Sandnes'
);
insert into persons values(101,"p","rakhi",18,default);
select * from persons;
CREATE TABLE stud (
    personID int(5) primary key,
    firstName varchar(255) not null,
    lastName varchar(255) not null
);
CREATE TABLE Orders (
    OrderID int NOT NULL,
    OrderNumber int NOT NULL,
    PersonID int );   
 alter table orders
 add constraint fk_personorder
 foreign key(personid) references stud(personid);

drop table persons;

create table persons(
e_name varchar(50),
 mobno varchar (100));

insert into persons values
('Amruta','1234567891'),
('Pratiksha','1220067891'),
('Dhanshree','1234567891'),
('Harshada','1204567891'),
('Gunjan','1234567891'),
('Rakhi','1234567891'),
('priya','1230107891');

SELECT * FROM persons WHERE e_name LIKE '%A';
SELECT * FROM persons WHERE e_name LIKE '%i';
SELECT * FROM persons WHERE e_name LIKE '%_da';
SELECT * FROM persons WHERE e_name LIKE 's%';
SELECT * FROM persons WHERE e_name LIKE 'am_a%A';
SELECT * FROM persons WHERE e_name LIKE '%p%';
SELECT * FROM persons WHERE e_name LIKE '%t';
SELECT * FROM persons WHERE e_name LIKE 'm%i';
SELECT * FROM persons WHERE e_name LIKE '%_ak_%';

select * from persons;
 
 CREATE VIEW java AS
SELECT e_name,mobno
FROM persons
WHERE mobno = 'rakhi';

 CREATE VIEW java AS
SELECT e_name,mobno
FROM persons
WHERE mobno = 'rakhi';
select * from java;

drop view java;