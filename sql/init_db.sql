-- Creazione del database
CREATE DATABASE jdbcexampledb;

-- Uso del database
USE jdbcexampledb;

-- Creazione della tabella users
CREATE TABLE users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    age INT NOT NULL,
    gender BOOLEAN NOT NULL -- 1 per Female, 0 per Male
);

-- Inserimento di dati di esempio
INSERT INTO users (name, age, gender) VALUES ('Alice', 25, 1), ('Bob', 30, 0), ('Charlie', 22, 0), ('Diana', 28, 1);