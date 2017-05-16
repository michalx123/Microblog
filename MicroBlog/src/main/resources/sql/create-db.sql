drop table uzytkownik if exists; 
create table uzytkownik (
id_uzytkownika int GENERATED ALWAYS AS IDENTITY (START WITH 1 INCREMENT BY 1),
imie varchar(45),
nazwisko varchar(45),
PRIMARY KEY (id_uzytkownika)
);
drop table follower if exists; 
create table follower (
id_followera INT GENERATED ALWAYS AS IDENTITY (START WITH 1 INCREMENT BY 1),
imie varchar(45),
nazwisko varchar(45),
PRIMARY KEY (id_followera)
);
drop table wpis if exists;
create table wpis (
id_wpisu INT GENERATED ALWAYS AS IDENTITY (START WITH 1 INCREMENT BY 1),
tekst varchar(250),
PRIMARY KEY (id_wpisu)
);