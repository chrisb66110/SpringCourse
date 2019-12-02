-- Create database ExampleSpring;

use ExampleSpring;

CREATE TABLE Equipo (
	id int PRIMARY KEY,
    nombre varchar(15) not null
);

CREATE TABLE Marca (
	id int PRIMARY KEY,
    nombre varchar(15) not null
);

CREATE TABLE Camiseta (
	id int PRIMARY KEY,
    numero int not null,
    marca_id int not null,
    FOREIGN KEY (marca_id) REFERENCES Marca(id) ON DELETE NO ACTION
);

CREATE TABLE Jugador (
	id int PRIMARY KEY,
    nombre varchar(15) not null,
    equipo_id int not null,
    camiseta_id int not null,
    FOREIGN KEY (equipo_id) REFERENCES Equipo(id) ON DELETE NO ACTION,
    FOREIGN KEY (camiseta_id) REFERENCES Camiseta(id) ON DELETE NO ACTION
);

INSERT INTO EQUIPO(id, nombre) VALUES(1, "EQUIPO 1");
INSERT INTO EQUIPO(id, nombre) VALUES(2, "EQUIPO 2");
INSERT INTO EQUIPO(id, nombre) VALUES(3, "EQUIPO 3");

INSERT INTO Marca(id, nombre) VALUES(1, "MARCA 1");
INSERT INTO Marca(id, nombre) VALUES(2, "MARCA 2");
INSERT INTO Marca(id, nombre) VALUES(3, "MARCA 3");

INSERT INTO Camiseta(id, numero, marca_id) VALUES(1, 1, 1);
INSERT INTO Camiseta(id, numero, marca_id) VALUES(2, 2, 2);
INSERT INTO Camiseta(id, numero, marca_id) VALUES(3, 3, 3);

INSERT INTO Jugador(id, nombre, equipo_id, camiseta_id) VALUES(1, "Jugador 1", 1, 1);
INSERT INTO Jugador(id, nombre, equipo_id, camiseta_id) VALUES(2, "Jugador 1", 2, 2);
INSERT INTO Jugador(id, nombre, equipo_id, camiseta_id) VALUES(3, "Jugador 1", 3, 3);

Select * from Equipo;
Select * from Marca;
Select * from Camiseta;
Select * from Jugador;

