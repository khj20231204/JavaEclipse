create table customer (
	no number(4) primary key,
	name varchar2(20),
	email varchar2(20),
	tel varchar2(20)
);

delete from customer;

select * from customer;

update customer set name='111', email='2222', tel='3333' where no=1;

commit;

select * from member01;

select * from dept;
select * from emp;


insert into customer values (1,'dsf','sdf@df','324');


commit;

