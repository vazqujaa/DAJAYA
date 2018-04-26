-- phpMyAdmin SQL Dump
-- version 4.1.12
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 26-04-2018 a las 11:21:00
-- Versión del servidor: 5.6.16
-- Versión de PHP: 5.5.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `dajaya`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `asiento`
--

CREATE TABLE IF NOT EXISTS `asiento` (
  `Id_Asiento` varchar(10) NOT NULL,
  `Id_Camion` int(11) NOT NULL,
  PRIMARY KEY (`Id_Asiento`),
  KEY `Id_Camion` (`Id_Camion`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `asiento`
--

INSERT INTO `asiento` (`Id_Asiento`, `Id_Camion`) VALUES
('1A', 1),
('1B', 1),
('1C', 1),
('1D', 1),
('1E', 1),
('1F', 1),
('1G', 1),
('2A', 1),
('2B', 1),
('2C', 1),
('2D', 1),
('2E', 1),
('2F', 1),
('2G', 1),
('3A', 1),
('3B', 1),
('3C', 1),
('3D', 1),
('3E', 1),
('3F', 1),
('3G', 1),
('4A', 1),
('4B', 1),
('4C', 1),
('4D', 1),
('4E', 1),
('4F', 1),
('4G', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `boletos`
--

CREATE TABLE IF NOT EXISTS `boletos` (
  `Id_Boleto` int(11) NOT NULL AUTO_INCREMENT,
  `Precio` int(11) NOT NULL,
  `Id_Destino` int(11) NOT NULL,
  `Id_Viaje` int(11) NOT NULL,
  PRIMARY KEY (`Id_Boleto`),
  KEY `Id_viaje` (`Id_Viaje`),
  KEY `Id_Destino` (`Id_Destino`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=29 ;

--
-- Volcado de datos para la tabla `boletos`
--

INSERT INTO `boletos` (`Id_Boleto`, `Precio`, `Id_Destino`, `Id_Viaje`) VALUES
(1, 450, 1, 1),
(2, 450, 1, 1),
(3, 450, 1, 1),
(4, 450, 1, 1),
(5, 450, 1, 1),
(6, 450, 1, 1),
(7, 450, 1, 1),
(8, 450, 1, 1),
(9, 450, 1, 1),
(10, 450, 1, 1),
(11, 450, 1, 1),
(12, 450, 1, 1),
(13, 450, 1, 1),
(14, 450, 1, 1),
(15, 450, 1, 1),
(16, 450, 1, 1),
(17, 450, 1, 1),
(18, 450, 1, 1),
(19, 450, 1, 1),
(20, 450, 1, 1),
(21, 450, 1, 1),
(22, 450, 1, 1),
(23, 450, 1, 1),
(24, 450, 1, 1),
(25, 450, 1, 1),
(26, 450, 1, 1),
(27, 450, 1, 1),
(28, 450, 1, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `camiones`
--

CREATE TABLE IF NOT EXISTS `camiones` (
  `Id_Camion` int(11) NOT NULL,
  `Matricula` varchar(25) NOT NULL,
  `Id_Empleado` int(11) NOT NULL,
  PRIMARY KEY (`Id_Camion`),
  KEY `Chofer` (`Id_Empleado`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `camiones`
--

INSERT INTO `camiones` (`Id_Camion`, `Matricula`, `Id_Empleado`) VALUES
(1, '4676NAH', 1),
(2, '6347GCP', 2),
(3, '3567OZG', 3),
(4, '7236HBQ', 4);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes`
--

CREATE TABLE IF NOT EXISTS `clientes` (
  `Id_Cliente` int(11) NOT NULL AUTO_INCREMENT,
  `Nombre` varchar(25) NOT NULL,
  `Apellido` varchar(50) NOT NULL,
  `Destino` varchar(50) NOT NULL,
  `Telefono` varchar(15) NOT NULL,
  `Id_Asiento` varchar(10) NOT NULL,
  PRIMARY KEY (`Id_Cliente`),
  KEY `Id_Destino` (`Destino`),
  KEY `Id_Venta` (`Id_Asiento`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=6 ;

--
-- Volcado de datos para la tabla `clientes`
--

INSERT INTO `clientes` (`Id_Cliente`, `Nombre`, `Apellido`, `Destino`, `Telefono`, `Id_Asiento`) VALUES
(1, 'omar', 'mora', '1', '6561231', '1A'),
(2, 'gabriela', 'salazar', '1-Delicias', '6562963222', '2A'),
(3, 'Karla', 'Molina', '1-Delicias', '6561925332', '3A'),
(5, 'Elisa', 'Padilla', '1-Delicias', '6562589565', '4A');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `destinos`
--

CREATE TABLE IF NOT EXISTS `destinos` (
  `Id_Destino` int(11) NOT NULL,
  `Precio_Destino` int(11) NOT NULL,
  `Destino` varchar(100) NOT NULL,
  PRIMARY KEY (`Id_Destino`),
  UNIQUE KEY `Destino` (`Destino`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `destinos`
--

INSERT INTO `destinos` (`Id_Destino`, `Precio_Destino`, `Destino`) VALUES
(1, 450, 'Delicias'),
(2, 500, 'Cuauhtemoc'),
(3, 650, 'Chihuahua'),
(4, 1150, 'Creel');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empleados`
--

CREATE TABLE IF NOT EXISTS `empleados` (
  `Id_Empleado` int(11) NOT NULL AUTO_INCREMENT,
  `Nombre` varchar(25) NOT NULL,
  `Apellido` varchar(40) NOT NULL,
  `Direccion` varchar(30) NOT NULL,
  PRIMARY KEY (`Id_Empleado`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Volcado de datos para la tabla `empleados`
--

INSERT INTO `empleados` (`Id_Empleado`, `Nombre`, `Apellido`, `Direccion`) VALUES
(1, 'Carlos', 'Caballero', 'Villa de Alcala 3205'),
(2, 'Rodolfo', 'Roman', 'Granjas 1524'),
(3, 'Cristian', 'Saldaña', 'Clavel 5212'),
(4, 'Ernesto', 'Ruiz', 'Claustro 751');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE IF NOT EXISTS `usuarios` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `Usuario` varchar(200) NOT NULL,
  `Nombre` varchar(200) NOT NULL,
  `Clave` varchar(200) NOT NULL,
  `Tipo` varchar(200) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`ID`, `Usuario`, `Nombre`, `Clave`, `Tipo`) VALUES
(1, 'Admin', 'Gabriela', 'GabrielaDajaya', 'Admin'),
(2, 'User', 'Emmanuel', 'EmmanuelDajaya', 'Usuario');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ventaboletos`
--

CREATE TABLE IF NOT EXISTS `ventaboletos` (
  `Id_Venta` int(11) NOT NULL AUTO_INCREMENT,
  `Id_Boleto` int(11) NOT NULL,
  `Id_Cliente` int(11) NOT NULL,
  `Abono` int(11) NOT NULL,
  `Fecha_Venta` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`Id_Venta`),
  KEY `id_cliente` (`Id_Cliente`),
  KEY `IdBoleto` (`Id_Boleto`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Volcado de datos para la tabla `ventaboletos`
--

INSERT INTO `ventaboletos` (`Id_Venta`, `Id_Boleto`, `Id_Cliente`, `Abono`, `Fecha_Venta`) VALUES
(1, 1, 1, 250, '2018-04-26 07:33:12'),
(2, 2, 2, 300, '2018-04-26 08:43:43');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `viaje`
--

CREATE TABLE IF NOT EXISTS `viaje` (
  `Id_Viaje` int(11) NOT NULL AUTO_INCREMENT,
  `Id_Camion` int(11) NOT NULL,
  `Fecha_Viaje` datetime NOT NULL,
  PRIMARY KEY (`Id_Viaje`),
  KEY `Id_Camion` (`Id_Camion`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Volcado de datos para la tabla `viaje`
--

INSERT INTO `viaje` (`Id_Viaje`, `Id_Camion`, `Fecha_Viaje`) VALUES
(1, 1, '2018-04-30 08:15:00');

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `asiento`
--
ALTER TABLE `asiento`
  ADD CONSTRAINT `asiento_ibfk_1` FOREIGN KEY (`Id_Camion`) REFERENCES `camiones` (`Id_Camion`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `boletos`
--
ALTER TABLE `boletos`
  ADD CONSTRAINT `boletos_ibfk_5` FOREIGN KEY (`Id_Viaje`) REFERENCES `viaje` (`Id_Viaje`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `boletos_ibfk_6` FOREIGN KEY (`Id_Destino`) REFERENCES `destinos` (`Id_Destino`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `camiones`
--
ALTER TABLE `camiones`
  ADD CONSTRAINT `camiones_ibfk_1` FOREIGN KEY (`Id_Empleado`) REFERENCES `empleados` (`Id_Empleado`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `clientes`
--
ALTER TABLE `clientes`
  ADD CONSTRAINT `clientes_ibfk_3` FOREIGN KEY (`Id_Asiento`) REFERENCES `asiento` (`Id_Asiento`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `ventaboletos`
--
ALTER TABLE `ventaboletos`
  ADD CONSTRAINT `ventaboletos_ibfk_1` FOREIGN KEY (`Id_Cliente`) REFERENCES `clientes` (`Id_Cliente`),
  ADD CONSTRAINT `ventaboletos_ibfk_2` FOREIGN KEY (`Id_Boleto`) REFERENCES `boletos` (`Id_Boleto`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `viaje`
--
ALTER TABLE `viaje`
  ADD CONSTRAINT `viaje_ibfk_1` FOREIGN KEY (`Id_Camion`) REFERENCES `camiones` (`Id_Camion`) ON DELETE CASCADE ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
