

select * from tabs;

show databases;
show tables;

select * from member;
select * from boardtest;

create table customer(
	no int(4) auto_increment primary key,
	name varchar(20),
	email varchar(20),
	tel varchar(20),
	address varchar(20),
	reg_date timestamp
);

insert into customer( name, email,tel, address, reg_date ) values('ddolrr','email','1234-3434','address',sysdate());
