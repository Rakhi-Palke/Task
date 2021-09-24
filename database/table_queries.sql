create database KJCOEMR;
drop database kjcoemr;
use KJCOEMR;

create table ECE(
s_name varchar(50),
s_rollnumber int(3),
s_email varchar(50),
s_adhar int(12)
);
create table CSE(
s_name varchar(50),
s_rollnumber int(3),
s_email varchar(50),
s_adhar int(12)
);
create table MECH(
s_name varchar(50),
s_rollnumber int(3),
s_email varchar(50)
);
desc ece;

show databases;
show tables from kjcoemr;
show tables from test;
INSERT INTO ece values 
('rakhi' , 101 , 'rakhi123@gmail.com', 54679834),
('pooja' , 102 , 'pooja123@gmail.com', 54679834),
('sanika' , 103 , 'sanika123@gmail.com', 54679834),
('riya' , 104 , 'riya123@gmail.com', 54679834),
('priya' , 105 , 'priya123@gmail.com', 54679834);


INSERT INTO cse values 
('rakhi' , 101 , 'rakhi123@gmail.com', 54679834),
('rakhi' , 102 , 'rakhi123@gmail.com', 54679834),
('rakhi' , 103 , 'rakhi123@gmail.com', 54679834),
('rakhi' , 104 , 'rakhi123@gmail.com', 54679834),
('rakhi' , 105 , 'rakhi123@gmail.com', 54679834),
('rakhi' , 106 , 'rakhi123@gmail.com', 54679834),
('rakhi' , 107 , 'rakhi123@gmail.com', 54679834),
('rakhi' , 108 , 'rakhi123@gmail.com', 54679834),
('rakhi' , 109 , 'rakhi123@gmail.com', 54679834),
('rakhi' , 110 , 'rakhi123@gmail.com', 54679834);

INSERT INTO mech values 
('rakhi' , 101 , 'rakhi123@gmail.com', 54679834),
('pooja' , 102 , 'rakhi123@gmail.com', 54679834),
('rakhi' , 103 , 'rakhi123@gmail.com', 54679834),
('rakhi' , 104 , 'rakhi123@gmail.com', 54679834),
('rakhi' , 105 , 'rakhi123@gmail.com', 54679834),
('rakhi' , 106 , 'rakhi123@gmail.com', 54679834),
('rakhi' , 107 , 'rakhi123@gmail.com', 54679834),
('rakhi' , 108 , 'rakhi123@gmail.com', 54679834),
('rakhi' , 109 , 'rakhi123@gmail.com', 54679834),
('rakhi' , 110 , 'rakhi123@gmail.com', 54679834);

select * from ece;

select * from cse;

select * from mech;

select s_name from mech;

select * from ece;

drop table ece;
#to add multiple  column after creating table
alter table ece add (s_section varchar(12) default 'India');
desc ece;
alter table ece rename column s_name to s_num;
alter table ece modify column s_name varchar(100);

delete from ece where s_rollnumber = 110;
delete from ece where s_name = 'riya';

update ece set s_name= 'sanika' where s_name='rakhi';
#to update multiple columns in single shot
update ece set s_name='pooja',s_email='pooja@gamil.com' where s_name = 'rpooja';

alter table ece add(age int(5) default 5);
update ece set age=18 where s_name ='sanika''pooja';
update ece set age = age+1;

truncate table ece;

create table edubridge(
s_name varchar(50),
s_rollnumber int(3),
s_email varchar(50),
s_adhar int(12)
);

insert into edubridge values('rakhi',123,'rakhi123@gamilcom',78343487);
savepoint a;
insert into edubridge values('priya',124,'priya123@gamilcom',78343487);
savepoint b;
insert into edubridge values('riya',133,'riya123@gamilcom',78343487);
savepoint c;

select * from edubridge;
delete from edubridge where s_rollnumber= 124;
rollback to a;