CREATE DATABASE IF NOT EXISTS futbolistas_db;

INSERT INTO posicion (nombre_posicion) VALUES ("arquero"),("defensa"),("mediocampista"),("delantero"),("lateral"),("volante");

INSERT INTO futbolista (nombres, apellidos, fecha_nacimiento, caracteristicas, posicion_id) VALUES
('Diego', 'González', '1985-04-10', 'Buen control de balón', 1), 
('Laura', 'Rodríguez', '1983-07-15', 'Fuerte en el juego aéreo', 2), 
('Jorge', 'Martínez', '1987-11-20', 'Habilidad en el regate', 3),
('Ana', 'Sánchez', '1982-09-05', 'Preciso en los tiros a puerta', 4),
('Pedro', 'López', '1984-03-25', 'Bueno en los cruces', 5), 
('Sofía', 'Gómez', '1988-06-12', 'Rápida y hábil', 6), 
('Martín', 'Hernández', '1986-01-30', 'Buena visión de juego', 5),
('Valentina', 'Pérez', '1989-08-18', 'Potente disparo de larga distancia', 4), 
('Sebastián', 'Díaz', '1981-12-08', 'Excelente en el juego aéreo', 1), 
('María', 'Martín', '1980-05-14', 'Gran capacidad defensiva', 2), 
('Luis', 'García', '1983-09-22', 'Bueno en recuperación de balones', 3),
('Carolina', 'Torres', '1982-07-03', 'Rápida y habilidosa', 4), 
('Gabriel', 'Suárez', '1986-11-11', 'Bueno en el uno contra uno', 5), 
('Fernanda', 'Rojas', '1987-02-09', 'Precisa en los pases largos', 6), 
('Juan', 'Morales', '1984-04-17', 'Excelente visión periférica', 6), 
('Daniela', 'Ortega', '1988-10-23', 'Potente disparo con ambas piernas', 4), 
('Andrés', 'Romero', '1985-06-29', 'Ágil y buen regateador', 1),
('Camila', 'Gutiérrez', '1983-03-07', 'Sólido en la marca', 2), 
('Gabriel', 'Silva', '1980-09-19', 'Gran visión de juego', 3), 
('Valeria', 'López', '1982-12-12', 'Explosiva en velocidad', 4), 
('Mario', 'Cabrera', '1981-08-28', 'Bueno en los centros', 5), 
('Elena', 'Álvarez', '1989-07-02', 'Habilidad para el dribbling', 6), 
('José', 'Navarro', '1986-04-03', 'Preciso en los tiros libres', 4), 
('Paola', 'Castro', '1984-11-15', 'Resistente físicamente', 2), 
('Roberto', 'Mendoza', '1987-02-20', 'Seguro bajo los palos', 1), 
('Marcela', 'Ríos', '1983-05-11', 'Rápida y con buena técnica', 2), 
('Emilio', 'Vargas', '1980-10-07', 'Pase preciso y visión de juego', 3), 
('Lucía', 'Fernández', '1981-09-28', 'Goleadora nata', 4), 
('Raúl', 'Ortiz', '1984-06-16', 'Explosivo en los contraataques', 5); 

select* from futbolista;
select * from posicion;

/*para ver la lista de futbolistas con sus posiciones*/
select f.nombres, f.apellidos, p.nombre_posicion as posicion from  futbolista f inner join posicion p where f.posicion_id = p.id;
