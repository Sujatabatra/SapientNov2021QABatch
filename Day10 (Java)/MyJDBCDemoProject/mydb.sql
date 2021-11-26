create table employee(
id varchar2(10) primary key,
name varchar2(25),
designation varchar2(25),
department varchar2(25),
salary number(10));

insert into employee values(101,'Amit','Executive','Sales',25000);
insert into employee values(102,'Bharat','Associate','Purchase',45000);
insert into employee values(103,'Charu','Sr. Associate','Marketing',65000);
insert into employee values(104,'Deepak','Manager','Marketing',150000);