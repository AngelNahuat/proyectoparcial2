-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 31-10-2021 a las 20:45:48
-- Versión del servidor: 10.4.16-MariaDB
-- Versión de PHP: 7.4.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `escuela`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `alumnos`
--

CREATE TABLE `alumnos` (
  `NumeroMatricula` int(11) NOT NULL,
  `Nombres` varchar(40) NOT NULL,
  `Apellidos` varchar(40) NOT NULL,
  `Telefono` int(15) NOT NULL,
  `FechaNacimiento` date NOT NULL,
  `Rol` varchar(20) NOT NULL,
  `Fotografia` varchar(50) NOT NULL,
  `IdGrupo` int(11) NOT NULL,
  `CodigoAsignatura` int(11) NOT NULL,
  `IdRol` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `asignatura`
--

CREATE TABLE `asignatura` (
  `CodigoAsignatura` int(11) NOT NULL,
  `Nombre` varchar(50) NOT NULL,
  `NumeroMatricula` int(11) NOT NULL,
  `IdProfesor` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `grupo`
--

CREATE TABLE `grupo` (
  `IdGrupo` int(11) NOT NULL,
  `Grupo` varchar(30) NOT NULL,
  `IdProfesor` int(11) NOT NULL,
  `NumeroMatricula` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `profesor`
--

CREATE TABLE `profesor` (
  `IdProfesor` int(11) NOT NULL,
  `Nombres` varchar(30) NOT NULL,
  `Apellidos` varchar(30) NOT NULL,
  `Especialidad` varchar(30) NOT NULL,
  `Fotografia` varchar(50) NOT NULL,
  `CodigoAsignatura` int(11) NOT NULL,
  `IdGrupo` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `rol`
--

CREATE TABLE `rol` (
  `id_Rol` int(11) NOT NULL,
  `Rol` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `alumnos`
--
ALTER TABLE `alumnos`
  ADD PRIMARY KEY (`NumeroMatricula`),
  ADD KEY `IdGrupo` (`IdGrupo`),
  ADD KEY `CodigoAsignatura` (`CodigoAsignatura`),
  ADD KEY `IdRol` (`IdRol`);

--
-- Indices de la tabla `asignatura`
--
ALTER TABLE `asignatura`
  ADD PRIMARY KEY (`CodigoAsignatura`),
  ADD KEY `NumeroMatricula` (`NumeroMatricula`),
  ADD KEY `IdProfesor` (`IdProfesor`);

--
-- Indices de la tabla `grupo`
--
ALTER TABLE `grupo`
  ADD PRIMARY KEY (`IdGrupo`),
  ADD KEY `IdProfesor` (`IdProfesor`),
  ADD KEY `NumeroMatricula` (`NumeroMatricula`);

--
-- Indices de la tabla `profesor`
--
ALTER TABLE `profesor`
  ADD PRIMARY KEY (`IdProfesor`),
  ADD KEY `CodigoAsignatura` (`CodigoAsignatura`),
  ADD KEY `IdGrupo` (`IdGrupo`);

--
-- Indices de la tabla `rol`
--
ALTER TABLE `rol`
  ADD PRIMARY KEY (`id_Rol`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `alumnos`
--
ALTER TABLE `alumnos`
  MODIFY `NumeroMatricula` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `asignatura`
--
ALTER TABLE `asignatura`
  MODIFY `CodigoAsignatura` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `grupo`
--
ALTER TABLE `grupo`
  MODIFY `IdGrupo` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `profesor`
--
ALTER TABLE `profesor`
  MODIFY `IdProfesor` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `rol`
--
ALTER TABLE `rol`
  MODIFY `id_Rol` int(11) NOT NULL AUTO_INCREMENT;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `alumnos`
--
ALTER TABLE `alumnos`
  ADD CONSTRAINT `alumnos_ibfk_1` FOREIGN KEY (`IdRol`) REFERENCES `rol` (`id_Rol`) ON UPDATE CASCADE,
  ADD CONSTRAINT `alumnos_ibfk_2` FOREIGN KEY (`CodigoAsignatura`) REFERENCES `asignatura` (`CodigoAsignatura`) ON UPDATE CASCADE,
  ADD CONSTRAINT `alumnos_ibfk_3` FOREIGN KEY (`IdGrupo`) REFERENCES `grupo` (`IdGrupo`) ON UPDATE CASCADE;

--
-- Filtros para la tabla `asignatura`
--
ALTER TABLE `asignatura`
  ADD CONSTRAINT `asignatura_ibfk_1` FOREIGN KEY (`NumeroMatricula`) REFERENCES `alumnos` (`NumeroMatricula`) ON UPDATE CASCADE,
  ADD CONSTRAINT `asignatura_ibfk_2` FOREIGN KEY (`IdProfesor`) REFERENCES `profesor` (`IdProfesor`) ON UPDATE CASCADE;

--
-- Filtros para la tabla `grupo`
--
ALTER TABLE `grupo`
  ADD CONSTRAINT `grupo_ibfk_1` FOREIGN KEY (`NumeroMatricula`) REFERENCES `alumnos` (`NumeroMatricula`) ON UPDATE CASCADE,
  ADD CONSTRAINT `grupo_ibfk_2` FOREIGN KEY (`IdProfesor`) REFERENCES `profesor` (`IdProfesor`) ON UPDATE CASCADE;

--
-- Filtros para la tabla `profesor`
--
ALTER TABLE `profesor`
  ADD CONSTRAINT `profesor_ibfk_1` FOREIGN KEY (`IdGrupo`) REFERENCES `grupo` (`IdGrupo`) ON UPDATE CASCADE,
  ADD CONSTRAINT `profesor_ibfk_2` FOREIGN KEY (`CodigoAsignatura`) REFERENCES `asignatura` (`CodigoAsignatura`) ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
