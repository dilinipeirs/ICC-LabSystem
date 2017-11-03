drop database icc_labsystem;
create database icc_labsystem;
use icc_labsystem;

create table user(
userID varchar(10) primary key,
title varchar(10) not null,
epf_num varchar(30) not null,
fname varchar(30) not null,
lname varchar(30),
designation varchar(255) not null,
office_mail varchar(100),
personal_mail varchar(100),
contact_num int not null,
username varchar(10) unique key not null,
password varchar(256)
)engine=innodb;

create table concrete_work(
concrete_grade varchar(30) primary key,
cement decimal (20,10) not null,
water decimal (20,10) not null,
admixture decimal (20,10) not null,
fine_aggregate decimal (20,10) not null,
course_aggregate decimal (20,10) not null,
fly_ash decimal (20,10) not null,
silica_fume decimal (20,10) not null,
waterCement_ratio varchar(10) not null
)engine=innodb;

create table form(
formID int primary key auto_increment,
create_dateTime datetime not null,
userID varchar(10) not null,
concrete_grade varchar(30) not null,
moisture_fine decimal (20,10) not null,
moisture_course decimal (20,10) not null,
adjusted_water decimal (20,10),
adjusted_waterCement_ratio varchar(10),
constraint foreign key (userID) references user(userID),
constraint foreign key (concrete_grade) references concrete_work(concrete_grade)
)engine=innodb;

create table login_history(
logID int primary key auto_increment,
userID varchar(10) not null,
logIn_time datetime not null,
logOut_time datetime not null,
constraint foreign key (userID) references user(userID)
)engine=innodb;