/*
public class TestDemo {
    create table teacher(
            name VARCHAR(20),
    age INT,
    height INT,
    weight INT,
    sex VARCHAR(10),
    academic VARCHAR(10),
    birthday DATETIME,
    IDnumber VARCHAR(20)
  );

    insert into teacher(name, age, height, weight, sex, academic, birthday, IDnumber)VALUES
  ('李萍', 28, 165, 100, '女', '研究生', '1991-10-12 18:20:00', '612312199110120028'),
          ('张伟', 34, 180, 140, '男', '研究生', '1985-01-19 13:59:00','612312198501192347'),
          ('刘红', 26, 160, 98, '女', '博士', '1993-12-16 23:59:59','612312199312160045');
    select *from teacher;



    create table teachers(
            name varchar(20) unique,
    gander varchar(5) not null default'保密',
    age int default '0',
    height double default '0',
    weight double default '0'
            );


    insert into teachers(name, gander,age,height,weight)values
  ('孙悟空','男','18','160','30'),
          ('唐三藏','保密','12','165','60'),
          ('猪八戒','男','34','185','200'),
          ('沙悟净','男','50','180','70');


    create table teachers(
            name varchar(20) ui,
    gander varchar(5),
    age int,
    height double,
    weight double
  );

    create table users(
            id INT PRIMARY KEY AUTO_INCREMENT,
            name VARCHAR(20) NOT NULL UNIQUE
  );

    create table articles(
            id INT PRIMARY KEY AUTO_INCREMENT,
            user_id INT NOT NULL,
            title VARCHAR(100) NOT NULL,
    content TEXT NOT NULL,
    published_at DATETIME NOT NULL
  );
    create table comments(
            id INT PRIMARY KEY AUTO_INCREMENT,
            user_id INT NOT NULL,
            article_id INT NOT NULL,
            published_at DATETIME NOT NULL
    );

    create table user_article_like_relation(
            user_id INT NOT NULL,
            article_id INT NOT NULL,
            PRIMARY KEY(user_id, article_id)
  );*/
/**//*

}
*/
