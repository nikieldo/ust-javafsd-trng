create database org;
show databases;
use org;
create table Worker (
 Worker_id int NOT NULL primary key auto_increment,first_name char(25),last_name char(25),salary int(15),joining_date datetime,department char(25)
 );
 insert into Worker
 (Worker_id,first_name,last_name,salary,joining_date,department)VALUES
    (001,"monika","arora",100000,"02/20/14 9:00", "HR"),
     (002, "Niharika", "Verma", 80000, "06/11/14 9:00", "Admin"),
     (003, "Vishal", "Singhal", 300000, "02/20/14 9:00", "HR"),
     (004, "Amitabh", "Signh", 500000, "02/20/14 9:00", "Admin"),
     (005, "Vivek", "Bhati", 500000, "06/11/14 9:00", "Admin"),
     (006 ,"Vipul", "Diwan",200000, "06/11/14 9:00", "Account"),
     (007, "Satish","Kumar",75000, "01/20/14 9:00", "Account"),
     (008,"Geetika", "Chauhan", 90000, "04/11/14 9:00", "Admin");
	create table  Bonus(
        Worker_ref_id int,
        Bonus_amount int(10),
        bonus_date datetime,
        foreign key(Worker_ref_id) references Worker(Worker_id)ON DELETE CASCADE
        );
	insert into Bonus
       (Worker_ref_id,Bonus_amount,Bonus_date)VALUES
          (001,5000,'16-02-20'),
          (002,3000,'16-06-11'),
          (003,4000,'16-02-20'),
          (001,4500,'16-02-20'),
          (002,3500,'16-06-11');
		CREATE TABLE Title(
           Worker_ref_id int,Worker_title char(25),affected_from datetime,foreign key(Worker_ref_id)
              references Worker(Worker_id) ON DELETE CASCADE
              );
              insert into Title
         (Worker_ref_id,Worker_title,affected_from) VALUES
            (001,"manager","2016-02-20 00:00:00"),
            (002,"executive","2016-06-11 00:00:00"),
            (008,"executive","2016-06-11 00:00:00"),
            (005,"manager","2016-06-11 00:00:00"),
            (004,"asst.manager","2016-06-11 00:00:00"),
            (007,"manager","2016-06-11 00:00:00"),
            (006,"executive","2016-06-11 00:00:00"),
            (003,"lead","2016-06-11 00:00:00");
            Select First_name as Worker_name from Worker;
            Select upper(First_name) from Worker;
            Select distinct department from Worker;
            Select substring(First_name,1,3)from Worker;
            Select INSTR(First_name,Binary'a')from Worker where First_name='Amitabh';
            Select  RTRIM(First_name)from Worker;
            Select LTRIM(department)from Worker;
            
        
     