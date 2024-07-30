

select * from customer;

delete from customer;

create table customer(
	no number(4) primary key,
	name varchar2(20),
	email varchar2(20),
	tel varchar2(2),
	address varchar2
)

select * from tab;

select * from customer;
commit;
insert into customer set (1,'dsf','df','rgrh');

--address, reg_date 컬럼 추가
alter table customer add(address varchar2(50));
alter table customer add(reg_date timestamp);

-- 시퀀스 : 번호(no)를 1부터 1씩 자동으로 증가 시켜서 처리하는 역할
create sequence customer_no_seq
start with 1
increment by 1;

-- 시퀀스 다음값
select customer_no_seq.nextval from dual;

insert into customer(no, name, email, tel, address, reg_date) values(customer_no_seq,'df' ,'dsfds' ,'fdg' ,'hry' ,'2009-01-03 12:33:33');
insert into customer values(customer_no_seq.nextval,'df' ,'dsfds' ,'fdg' ,'hry' ,sysdate);

select * from customer order by no desc


create table board(
	no number primary key,
	writer varchar2(20) not null,
	passwd varchar2(20) not null,
	subject varchar2(20) not null,
	content varchar2(1000) not null,
	reg_date timestamp
);

create sequence board_seq
start with 1
increment by 1;

insert into board values(board_seq.nextval,'writer','passwd','subject','content',sysdate);

select * from tab;	--테이블 목록
select * from seq;	--시퀀스 목록
select * from board;
delete from board


Select * from board order by no desc

