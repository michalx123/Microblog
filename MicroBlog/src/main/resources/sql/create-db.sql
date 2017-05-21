drop table uzytkownik if exists; 
create table uzytkownik (
imie varchar(45),
nazwisko varchar(45)
);
drop table follower if exists; 
create table follower (
imie varchar(45),
nazwisko varchar(45)
);
drop table wpis if exists;
create table wpis (
tekst varchar(250)
);