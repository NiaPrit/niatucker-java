

begin transaction;

drop table if exists Employee          cascade;     
drop table if exists Department        cascade;     
drop table if exists Project            cascade;
drop table if exists employee_department cascade;
drop table if exists employee_project   cascade;
create table Employee
(firstName varchar (100) not null,
lastName varchar (100) not null,
DOB date,
hireDate date,
employeeId serial not null,
gender varchar,
constraint pk_employee_employeeId Primary Key (employeeId)
)
;

create table Department
(name varchar (100) not null,
departmentId serial not null,
constraint pk_department_deparmtnetId primary key (departmentId)
)
;

create table Project
(project_name varchar (100) not null,
projectId serial not null,
start_date date,
constraint pk_project_projectId primary key (projectId)
)
;

create table employee_department
(employeeId int,
departmentId int,
constraint pk_employee_department_employeeId_departmentId primary key (employeeId,departmentId)
)
;

alter table employee_department ADD foreign key (employeeId) references employee(employeeId)
;
alter table employee_department ADD foreign key (departmentId) references department(departmentId)
;

create table employee_project
(employeeId int,
projectId int,
constraint pk_employee_project_employeeId_projectId primary key (employeeId,projectId)
)
;
alter table employee_project ADD foreign key (employeeId) references employee(employeeId)
;
alter table employee_project ADD foreign key (projectId) references project (projectId)
;

insert into employee
(firstName, lastName, hireDate)
values('Nia', 'Tucker','6/14/2020')
;
insert into employee
(firstName, lastName, hireDate)
values('Mia', 'Jones','6/14/2020')
;
insert into employee
(firstName, lastName, hireDate)
values('Tia', 'Gill','6/14/2020')
;
insert into employee
(firstName, lastName, hireDate)
values('Ria', 'Pritchett','6/14/2020')
;
insert into employee
(firstName, lastName, hireDate)
values('Lia', 'Konick','6/14/2020')
;
insert into employee
(firstName, lastName, hireDate)
values('Qia', 'French','6/14/2020')
;
insert into employee
(firstName, lastName, hireDate)
values('Zia', 'Stokes','6/14/2020')
;
insert into employee
(firstName, lastName, hireDate)
values('Fia', 'Freeman','6/14/2020')
;

insert into department
(name)
values('Hr')
;
insert into department
(name)
values('Dietary')
;
insert into department
values('NursingStation')
;
insert into project
(project_name, start_date)
values('projectone', '6/15/2021')
;
insert into project
(project_name, start_date)
values('projectotwo', '6/15/2021')
;
insert into project
(project_name, start_date)
values('projectthree', '6/15/2021')
;
insert into project
(project_name, start_date)
values('projectfour', '6/15/2021')
;

insert into employee_department
(employeeId, departmentId)
values ('1','1')
;
insert into employee_department
(employeeId, departmentId)
values ('2','1')
;
insert into employee_department
(employeeId, departmentId)
values ('1','2')
;
insert into employee_department
(employeeId, departmentId)
values ('2','2')
;
insert into employee_department
(employeeId, departmentId)
values ('1','3')
;
insert into employee_department
(employeeId, departmentId)
values ('2','3')
;

insert into employee_project
(employeeId, projectId)
values('8', '1')
; 
insert into employee_project
(employeeId, projectId)
values('7', '2')
; 
insert into employee_project
(employeeId, projectId)
values('6', '3')
; 
insert into employee_project
(employeeId, projectId)
values('5', '4')
;



select *
from employee_project
;
select *
from employee_department
;

select *
from project
;

select *
from Department
;
select * 
from Employee
;

rollback;