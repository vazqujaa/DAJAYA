-- phpMyAdmin SQL Dump
-- version 3.3.9
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 16-03-2018 a las 02:42:03
-- Versión del servidor: 5.1.53
-- Versión de PHP: 5.3.4

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `dajaya`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `boleto`
--

CREATE TABLE IF NOT EXISTS `boleto` (
  `id_boleto` int(5) NOT NULL AUTO_INCREMENT,
  `id_cliente` int(5) NOT NULL,
  `asiento` varchar(5) NOT NULL,
  PRIMARY KEY (`id_boleto`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Volcar la base de datos para la tabla `boleto`
--


-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `camiones`
--

CREATE TABLE IF NOT EXISTS `camiones` (
  `id_camion` int(11) NOT NULL AUTO_INCREMENT,
  `id_espacio` int(5) NOT NULL,
  `matricula` varchar(8) NOT NULL,
  `chofer1` varchar(25) NOT NULL,
  `chofer2` varchar(25) NOT NULL,
  PRIMARY KEY (`id_camion`,`id_espacio`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Volcar la base de datos para la tabla `camiones`
--


-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes`
--

CREATE TABLE IF NOT EXISTS `clientes` (
  `id_cliente` int(5) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(25) NOT NULL,
  `destino` varchar(25) NOT NULL,
  `telefono` int(11) NOT NULL,
  PRIMARY KEY (`id_cliente`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Volcar la base de datos para la tabla `clientes`
--


-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `destinos`
--

CREATE TABLE IF NOT EXISTS `destinos` (
  `precioviaje` float NOT NULL,
  `destino` varchar(30) NOT NULL,
  `id_camion` int(5) NOT NULL,
  PRIMARY KEY (`destino`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcar la base de datos para la tabla `destinos`
--


-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empleados`
--

CREATE TABLE IF NOT EXISTS `empleados` (
  `id_empleado` int(5) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(25) NOT NULL,
  `direccion` varchar(30) NOT NULL,
  `tipo` varchar(20) NOT NULL,
  PRIMARY KEY (`id_empleado`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Volcar la base de datos para la tabla `empleados`
--


-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `reserva`
--

CREATE TABLE IF NOT EXISTS `reserva` (
  `id_viaje` int(5) NOT NULL AUTO_INCREMENT,
  `fecha` datetime DEFAULT NULL,
  `id_cliente` int(5) NOT NULL,
  `destino` varchar(30) NOT NULL,
  `cantidad` int(5) NOT NULL,
  PRIMARY KEY (`id_viaje`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Volcar la base de datos para la tabla `reserva`
--

