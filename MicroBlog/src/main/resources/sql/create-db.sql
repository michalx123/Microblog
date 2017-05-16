drop table uzytkownik if exists; 
create table uzytkownik (
id_uzytkownika INT auto_increment primary key,
imie varchar(45),
nazwisko varchar(45),
);
drop table follower if exists; 
create table follower (
id_followera INT auto_increment primary key,
imie varchar(45),
nazwisko varchar(45),
);
drop table wpis if exists;
create table wpis (
id_wpisu INT auto_increment primary key,
tekst varchar(250),
);