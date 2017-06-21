DROP TABLE uzytkownik
IF EXISTS;
CREATE TABLE uzytkownik (
  imie     VARCHAR(45),
  nazwisko VARCHAR(45)
);
DROP TABLE follower
IF EXISTS;
CREATE TABLE follower (
  iduzytkownikasledzonego INT,
  imie     VARCHAR(45),
  nazwisko VARCHAR(45)
);
DROP TABLE wpis
IF EXISTS;
CREATE TABLE wpis (
  iduzytkownika INT,
  tekst VARCHAR(250)
);