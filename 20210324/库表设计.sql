create database if not exists java20_0324 charset utf8mb4;
use java20_0324;

create table users(
  id int primary key auto_increment,
  username varchar(50) not null unique,
  passwoed char(64) not null
);

create table images(
   id int primary key auto_increment,
   image BLOB not null
);
create table articles(
  id int primary key auto_increment,
  author_id int not null,
  image_id int not null,
  title varchar(200) not null,
  body text not null
);