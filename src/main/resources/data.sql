-- ----------------------------
-- Table structure for agency
-- ----------------------------
DROP TABLE IF EXISTS `agency`;
CREATE TABLE `agency` (
  `id` bigint(20) NOT NULL,
  `email` varchar(255) NOT NULL,
  `name` varchar(40) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `web_page` varchar(255) DEFAULT NULL,
  `person_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_83gf327dym4y446171hk5q670` (`email`),
  KEY `FKd5ljdwtrxrweiwntseok7y41k` (`person_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of agency
-- ----------------------------

-- ----------------------------
-- Table structure for calificacion
-- ----------------------------
DROP TABLE IF EXISTS `calificacion`;
CREATE TABLE `calificacion` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `comentario` varchar(255) DEFAULT NULL,
  `paquete_turistico_id` bigint(20) NOT NULL,
  `valor` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id` (`id`),
  KEY `FKr7j2bwcqgd9ospvu5od8mexdf` (`paquete_turistico_id`)
) ENGINE=MyISAM AUTO_INCREMENT=59 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of calificacion
-- ----------------------------
INSERT INTO `calificacion` VALUES ('1', 'malo', '1', '1');
INSERT INTO `calificacion` VALUES ('2', 'aceptable', '2', '2');
INSERT INTO `calificacion` VALUES ('3', 'bueno', '4', '13');
INSERT INTO `calificacion` VALUES ('4', 'regular', '3', '3');
INSERT INTO `calificacion` VALUES ('5', 'bueno', '4', '6');
INSERT INTO `calificacion` VALUES ('6', 'aceptable', '2', '11');
INSERT INTO `calificacion` VALUES ('7', 'bueno', '4', '7');
INSERT INTO `calificacion` VALUES ('8', 'bueno', '4', '10');
INSERT INTO `calificacion` VALUES ('9', 'bueno', '4', '12');
INSERT INTO `calificacion` VALUES ('10', 'excelente', '5', '2');
INSERT INTO `calificacion` VALUES ('11', 'malo', '1', '1');
INSERT INTO `calificacion` VALUES ('12', 'regular', '3', '7');
INSERT INTO `calificacion` VALUES ('13', 'pesimo', '0', '10');
INSERT INTO `calificacion` VALUES ('14', 'aceptable', '2', '9');
INSERT INTO `calificacion` VALUES ('15', 'bueno', '4', '5');
INSERT INTO `calificacion` VALUES ('16', 'pesimo', '0', '4');
INSERT INTO `calificacion` VALUES ('17', 'aceptable', '5', '12');
INSERT INTO `calificacion` VALUES ('18', 'aceptable', '2', '6');
INSERT INTO `calificacion` VALUES ('19', 'bueno', '4', '15');
INSERT INTO `calificacion` VALUES ('20', 'malo', '1', '3');
INSERT INTO `calificacion` VALUES ('21', 'regular', '3', '11');
INSERT INTO `calificacion` VALUES ('22', 'aceptable', '5', '8');
INSERT INTO `calificacion` VALUES ('23', 'aceptable', '5', '14');
INSERT INTO `calificacion` VALUES ('24', 'pesimo', '0', '13');
INSERT INTO `calificacion` VALUES ('25', 'regular', '3', '9');
INSERT INTO `calificacion` VALUES ('26', 'aceptable', '5', '15');
INSERT INTO `calificacion` VALUES ('27', 'malo', '1', '4');
INSERT INTO `calificacion` VALUES ('28', 'aceptable', '2', '5');
INSERT INTO `calificacion` VALUES ('29', 'bueno', '4', '8');
INSERT INTO `calificacion` VALUES ('30', 'bueno', '4', '14');
INSERT INTO `calificacion` VALUES ('55', 'gg', '3', '0');
INSERT INTO `calificacion` VALUES ('56', 'excelente', '1', '0');
INSERT INTO `calificacion` VALUES ('57', 'buenisimo', '1', '0');
INSERT INTO `calificacion` VALUES ('58', 'buenisimo', '1', '0');

-- ----------------------------
-- Table structure for circuit
-- ----------------------------
DROP TABLE IF EXISTS `circuit`;
CREATE TABLE `circuit` (
  `id` bigint(20) NOT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of circuit
-- ----------------------------

-- ----------------------------
-- Table structure for circuito
-- ----------------------------
DROP TABLE IF EXISTS `circuito`;
CREATE TABLE `circuito` (
  `id` bigint(20) NOT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `paquete_turistico_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKirlyyy7rqvjtb06yehj1wnx52` (`paquete_turistico_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of circuito
-- ----------------------------
INSERT INTO `circuito` VALUES ('1', 'paseo A', '2');
INSERT INTO `circuito` VALUES ('2', 'rio A', '6');
INSERT INTO `circuito` VALUES ('3', 'rio B', '7');
INSERT INTO `circuito` VALUES ('4', 'paseo B', '12');
INSERT INTO `circuito` VALUES ('5', 'recorrido A', '11');
INSERT INTO `circuito` VALUES ('6', 'paseo C', '3');
INSERT INTO `circuito` VALUES ('7', 'caminata A', '4');
INSERT INTO `circuito` VALUES ('8', 'rio C', '14');
INSERT INTO `circuito` VALUES ('9', 'paseo D', '15');
INSERT INTO `circuito` VALUES ('10', 'lago A', '1');
INSERT INTO `circuito` VALUES ('11', 'caminata B', '5');
INSERT INTO `circuito` VALUES ('12', 'paseo E', '8');
INSERT INTO `circuito` VALUES ('13', 'lago B', '9');
INSERT INTO `circuito` VALUES ('14', 'recorrido B', '10');
INSERT INTO `circuito` VALUES ('15', 'recorrido C', '13');
INSERT INTO `circuito` VALUES ('16', 'rio D', '5');
INSERT INTO `circuito` VALUES ('17', 'paseo F', '7');
INSERT INTO `circuito` VALUES ('18', 'caminata C', '12');
INSERT INTO `circuito` VALUES ('19', 'paseo G', '10');
INSERT INTO `circuito` VALUES ('20', 'pueblo A', '2');
INSERT INTO `circuito` VALUES ('21', 'caminata D', '1');
INSERT INTO `circuito` VALUES ('22', 'rio E', '9');
INSERT INTO `circuito` VALUES ('23', 'pueblo B', '3');
INSERT INTO `circuito` VALUES ('24', 'lago C', '15');
INSERT INTO `circuito` VALUES ('25', 'reserva A', '4');
INSERT INTO `circuito` VALUES ('26', 'recorrido D', '6');
INSERT INTO `circuito` VALUES ('27', 'pueblo C', '8');
INSERT INTO `circuito` VALUES ('28', 'recorrido E', '11');
INSERT INTO `circuito` VALUES ('29', 'reserva B', '14');
INSERT INTO `circuito` VALUES ('30', 'pueblo D', '3');

-- ----------------------------
-- Table structure for circuit_destination
-- ----------------------------
DROP TABLE IF EXISTS `circuit_destination`;
CREATE TABLE `circuit_destination` (
  `circuit_id` bigint(20) NOT NULL,
  `destination_id` bigint(20) NOT NULL,
  PRIMARY KEY (`circuit_id`,`destination_id`),
  KEY `FKaqse063wxf5u61k4j6h8c9x82` (`destination_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of circuit_destination
-- ----------------------------

-- ----------------------------
-- Table structure for destination
-- ----------------------------
DROP TABLE IF EXISTS `destination`;
CREATE TABLE `destination` (
  `destiny_id` bigint(20) NOT NULL,
  `available_service` varchar(40) DEFAULT NULL,
  `country` varchar(50) DEFAULT NULL,
  `department` varchar(50) DEFAULT NULL,
  `description` varchar(40) DEFAULT NULL,
  `locality` varchar(40) DEFAULT NULL,
  `name` varchar(40) NOT NULL,
  `province` varchar(50) DEFAULT NULL,
  `travel_time` varchar(40) DEFAULT NULL,
  `weather` varchar(40) DEFAULT NULL,
  `location_location_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`destiny_id`),
  UNIQUE KEY `UK_kw349sqcyo1k39xa0wn3k3q2r` (`name`),
  KEY `FKqhqqmlo8pnupfsna7drus3tj4` (`location_location_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of destination
-- ----------------------------

-- ----------------------------
-- Table structure for foto
-- ----------------------------
DROP TABLE IF EXISTS `foto`;
CREATE TABLE `foto` (
  `id` bigint(20) NOT NULL,
  `data` longtext,
  `nombre` varchar(255) DEFAULT NULL,
  `tipo` varchar(255) DEFAULT NULL,
  `paquete_turistico_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKbeqfcepl2xige8nt9qy96vry2` (`paquete_turistico_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of foto
-- ----------------------------
INSERT INTO `foto` VALUES ('1', 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS3T1DXSbPtReujI5IwP5X6FSRw1vRnQ9gTPYqPUs6DhaMEPIH_', 'foto1', 'jpg', '9');
INSERT INTO `foto` VALUES ('2', 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQR2KYYdhlGQJ3AGiIwV7UgEZKbAAncIx-zIiL241ZOPg06CsMLOA', 'foto2', 'jpg', '3');
INSERT INTO `foto` VALUES ('3', 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSsVzRVPatQAxRJCj1tzXBCdpveAp61eiV7QG7It7bbkEsTdUd0ZQ', 'foto3', 'jpg', '11');
INSERT INTO `foto` VALUES ('4', 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSsVzRVPatQAxRJCj1tzXBCdpveAp61eiV7QG7It7bbkEsTdUd0ZQ', 'foto4', 'jpg', '2');
INSERT INTO `foto` VALUES ('5', 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSsVzRVPatQAxRJCj1tzXBCdpveAp61eiV7QG7It7bbkEsTdUd0ZQ', 'foto5', 'jpg', '8');
INSERT INTO `foto` VALUES ('6', 'https://enviajes.cl/wp-content/uploads/2014/06/Lugares-turisticos-de-Bolivia-Titicaca.jpg', 'foto6', 'jpg', '12');
INSERT INTO `foto` VALUES ('7', 'data:image/jpeg;base64,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', 'foto7', 'jpg', '5');
INSERT INTO `foto` VALUES ('8', 'data:image/jpeg;base64,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', 'foto8', 'jpg', '13');
INSERT INTO `foto` VALUES ('9', 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ9gfLs85CqDeSkbkzRk4UZ8nk85521Ht1OdYeEx3zi-CkvgBxuGQ', 'foto9', 'jpg', '10');
INSERT INTO `foto` VALUES ('10', 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTSmg6Z94B0Llj09qOsEZD-_CgE99mHLWELe6aQscgkGZoU7DUPsQ', 'foto10', 'jpg', '1');
INSERT INTO `foto` VALUES ('11', 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRHFsgJyvh-DH-E-t6ByXtL5WGBXvQN-8vZdDx4ugnzXi85NNBj', 'foto11', 'jpg', '4');
INSERT INTO `foto` VALUES ('12', 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSTp6dDCtRoqljxkeBS0StXKAmlf5snEkIQm8HwrFTyKnAVq07J', 'foto12', 'jpg', '14');
INSERT INTO `foto` VALUES ('13', 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSDFequcMQgbTFbHdLQvXgG-7XcGEOiz4HQRUyeJD1p_tAsdtxPnw', 'foto13', 'jpg', '15');
INSERT INTO `foto` VALUES ('14', 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSDFequcMQgbTFbHdLQvXgG-7XcGEOiz4HQRUyeJD1p_tAsdtxPnw', 'foto14', 'jpg', '6');
INSERT INTO `foto` VALUES ('15', 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSDFequcMQgbTFbHdLQvXgG-7XcGEOiz4HQRUyeJD1p_tAsdtxPnw', 'foto15', 'jpg', '7');

-- ----------------------------
-- Table structure for itinerario
-- ----------------------------
DROP TABLE IF EXISTS `itinerario`;
CREATE TABLE `itinerario` (
  `id` bigint(20) NOT NULL,
  `fecha_fin` date NOT NULL,
  `fecha_inicio` date NOT NULL,
  `hora_fin` time NOT NULL,
  `hora_inicio` time NOT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of itinerario
-- ----------------------------
INSERT INTO `itinerario` VALUES ('1', '2018-11-09', '2018-11-06', '11:22:20', '08:22:27', 'itin1');
INSERT INTO `itinerario` VALUES ('2', '2018-11-11', '2018-11-09', '12:24:52', '09:24:56', 'itin2');
INSERT INTO `itinerario` VALUES ('3', '2018-11-12', '2018-11-01', '05:00:00', '13:00:00', 'itin3');
INSERT INTO `itinerario` VALUES ('4', '2018-11-19', '2018-11-15', '15:27:00', '22:27:07', 'itin4');
INSERT INTO `itinerario` VALUES ('5', '2018-11-14', '2018-11-12', '11:27:37', '18:27:42', 'itin5');
INSERT INTO `itinerario` VALUES ('6', '2018-11-18', '2018-11-04', '12:28:08', '20:28:13', 'itin6');
INSERT INTO `itinerario` VALUES ('7', '2018-12-10', '2018-12-06', '05:00:00', '16:00:00', 'itin7');
INSERT INTO `itinerario` VALUES ('8', '2018-11-11', '2018-11-13', '09:00:00', '14:29:27', 'itin8');
INSERT INTO `itinerario` VALUES ('9', '2018-11-21', '2018-11-15', '11:29:50', '15:30:00', 'itin9');
INSERT INTO `itinerario` VALUES ('10', '2018-11-25', '2018-11-16', '08:31:13', '21:31:21', 'itin10');
INSERT INTO `itinerario` VALUES ('11', '2018-11-20', '2018-11-09', '11:32:13', '09:00:00', 'itin11');
INSERT INTO `itinerario` VALUES ('12', '2018-11-13', '2018-11-07', '13:32:39', '15:32:45', 'itin12');
INSERT INTO `itinerario` VALUES ('13', '2018-12-07', '2018-12-03', '21:33:05', '17:33:14', 'itin13');
INSERT INTO `itinerario` VALUES ('14', '2018-12-02', '2018-11-22', '14:33:33', '08:33:38', 'itin14');
INSERT INTO `itinerario` VALUES ('15', '2018-12-12', '2018-12-01', '16:34:47', '20:00:00', 'itin15');

-- ----------------------------
-- Table structure for location
-- ----------------------------
DROP TABLE IF EXISTS `location`;
CREATE TABLE `location` (
  `location_id` bigint(20) NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  `latitude` double DEFAULT NULL,
  `longitude` double DEFAULT NULL,
  PRIMARY KEY (`location_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of location
-- ----------------------------

-- ----------------------------
-- Table structure for paquete_turistico
-- ----------------------------
DROP TABLE IF EXISTS `paquete_turistico`;
CREATE TABLE `paquete_turistico` (
  `id` bigint(20) NOT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `precio` decimal(19,2) NOT NULL,
  `itinerario_id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK4s5s46i21sw5eeyq9ixcsleuu` (`itinerario_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of paquete_turistico
-- ----------------------------
INSERT INTO `paquete_turistico` VALUES ('1', 'Pasa unas vacaciones en Yungas para caminar por paisajes increíblemente variados y montañas nevadas, bosques nubosos y la selva densa de esta región remota ubicada entre los Andes y la cuenca del Amazonas.', 'Yungas', '500.00', '3');
INSERT INTO `paquete_turistico` VALUES ('2', 'Gracias a los rituales aimaras, la arquitectura colonial y la moderna vida nocturna, además de los mercados y museos únicos en el mundo, La Paz es la capital cultural de Bolivia.', 'La Paz', '750.00', '9');
INSERT INTO `paquete_turistico` VALUES ('3', 'Esta ciudad californiana tiene una de las culturas del surf más importantes del país y atrae a los turistas que buscan sol y playa.', 'Santa Cruz', '1250.00', '7');
INSERT INTO `paquete_turistico` VALUES ('4', 'Arquitectura románica y vino pueden ser los ingredientes perfectos para una escapada de fin de semana de ensueño; descúbrelo en Toro. ', 'Toro', '1575.00', '1');
INSERT INTO `paquete_turistico` VALUES ('5', 'Región Boliviana de singular belleza y exuberante naturaleza, ubicada al sud-este de Santa Cruz. ', 'Chiquitania', '1400.00', '6');
INSERT INTO `paquete_turistico` VALUES ('6', 'Se encuentra al suroeste de Bolivia, es el salar más grande del mundo, pudiendo ser divisado incluso desde el espacio.', 'Uyuni', '1800.00', '14');
INSERT INTO `paquete_turistico` VALUES ('7', 'Vergel Turístico ubicado a orillas del río Espíritu Santo, donde abunda la fruta y una gran variedad de peces.', 'Villa Tunari', '1150.00', '13');
INSERT INTO `paquete_turistico` VALUES ('8', 'Sólo a 138 kilómetros de la ciudad de Cochabamba se encuentra uno de los sitios turísticos más hermosos de Bolivia.', 'Toro Toro', '2140.00', '5');
INSERT INTO `paquete_turistico` VALUES ('9', 'Tarija se encuentra en un amplio y hermoso valle que cuenta con un clima agradable, abundante fruta y deliciosa comida todo el año.', 'Ruta del Vino', '780.00', '2');
INSERT INTO `paquete_turistico` VALUES ('10', 'Situada en la milenaria tierra de la cultura Urus, la población de Orinoca te espera con toda su natural belleza andina y tradiciones ancestrales.', 'Salinas de Garci Mendoza', '1370.00', '4');
INSERT INTO `paquete_turistico` VALUES ('11', '¡Visita Copacabana! un lugar hermoso e imperdible para conocer atractivos turísticos únicos en el Mundo!', 'Copacabana', '3150.00', '8');
INSERT INTO `paquete_turistico` VALUES ('12', 'BOLTUR te invita a viajar en el buque más grande de Bolivia.', 'Lago Titicaca', '4500.00', '10');
INSERT INTO `paquete_turistico` VALUES ('13', 'Al sur de La Paz se encuentra la localidad de Huajchilla donde se realiza uno de los deportes de adrenalina \"El Parapente\".', 'Parapente', '3700.00', '11');
INSERT INTO `paquete_turistico` VALUES ('14', 'Principal sitio arqueológico de Bolivia, ubicado a 72 km. de la ciudad de La Paz.', 'Tiwanaku', '2500.00', '12');
INSERT INTO `paquete_turistico` VALUES ('15', 'Capital de Bolivia y tierra del vino.', 'Sucre', '1400.00', '15');

-- ----------------------------
-- Table structure for person
-- ----------------------------
DROP TABLE IF EXISTS `person`;
CREATE TABLE `person` (
  `id` bigint(20) NOT NULL,
  `email` varchar(255) NOT NULL,
  `last_name` varchar(40) DEFAULT NULL,
  `name` varchar(40) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_fwmwi44u55bo4rvwsv0cln012` (`email`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of person
-- ----------------------------

-- ----------------------------
-- Table structure for servicio
-- ----------------------------
DROP TABLE IF EXISTS `servicio`;
CREATE TABLE `servicio` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(255) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `paquete_turistico_id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id` (`id`),
  KEY `FK30ywix4i2nxmjl2aslaatmmx4` (`paquete_turistico_id`)
) ENGINE=MyISAM AUTO_INCREMENT=31 DEFAULT CHARSET=latin1;

INSERT INTO `servicio` VALUES ('1', 'Incluye café, te o leche, jugo o frutas, pan o tostadas, mermelada o mantequilla', 'desayuno', '10');
INSERT INTO `servicio` VALUES ('2', 'Ofrecemos platos con un menú variado con un primer plato, un segundo, el postre y la bebida', 'cena', '2');
INSERT INTO `servicio` VALUES ('3', 'Experiencias relacionadas con el wellness, con el objetivo final que los huéspedes disfruten de un buen rato cuidando de su salud y bienestar', 'masajes', '6');
INSERT INTO `servicio` VALUES ('4', 'Optimiza tu tiempo y disfruta conociendo los mejores rincones de la ciudad de la mano de un guía local, y en tu idioma', 'guia incluido', '2');
INSERT INTO `servicio` VALUES ('5', 'Ofrecemos platos con un menú variado con un primer plato, un segundo, el postre y la bebida', 'cena', '5');
INSERT INTO `servicio` VALUES ('6', 'La mejor experiencia culinaria con platos de alta calidad', 'almuerzo', '13');
INSERT INTO `servicio` VALUES ('7', 'Optimiza tu tiempo y disfruta conociendo los mejores rincones de la ciudad de la mano de un guía local, y en tu idioma', 'guia incluido', '6');
INSERT INTO `servicio` VALUES ('8', 'Optimiza tu tiempo y disfruta conociendo los mejores rincones de la ciudad de la mano de un guía local, y en tu idioma', 'guia incluido', '15');
INSERT INTO `servicio` VALUES ('9', 'Incluye café, te o leche, jugo o frutas, pan o tostadas, mermelada o mantequilla', 'desayuno', '7');
INSERT INTO `servicio` VALUES ('10', 'Optimiza tu tiempo y disfruta conociendo los mejores rincones de la ciudad de la mano de un guía local, y en tu idioma', 'guia incluido', '12');
INSERT INTO `servicio` VALUES ('11', 'La mejor experiencia culinaria con platos de alta calidad', 'almuerzo', '14');
INSERT INTO `servicio` VALUES ('12', 'Experiencias relacionadas con el wellness, con el objetivo final que los huéspedes disfruten de un buen rato cuidando de su salud y bienestar', 'masajes', '3');
INSERT INTO `servicio` VALUES ('13', 'Incluye café, te o leche, jugo o frutas, pan o tostadas, mermelada o mantequilla', 'desayuno', '8');
INSERT INTO `servicio` VALUES ('14', 'Optimiza tu tiempo y disfruta conociendo los mejores rincones de la ciudad de la mano de un guía local, y en tu idioma', 'guia incluido', '5');
INSERT INTO `servicio` VALUES ('15', 'Ofrecemos platos con un menú variado con un primer plato, un segundo, el postre y la bebida', 'cena', '2');
INSERT INTO `servicio` VALUES ('16', 'Experiencias relacionadas con el wellness, con el objetivo final que los huéspedes disfruten de un buen rato cuidando de su salud y bienestar', 'masajes', '1');
INSERT INTO `servicio` VALUES ('17', 'Optimiza tu tiempo y disfruta conociendo los mejores rincones de la ciudad de la mano de un guía local, y en tu idioma', 'guia incluido', '11');
INSERT INTO `servicio` VALUES ('18', 'Incluye café, te o leche, jugo o frutas, pan o tostadas, mermelada o mantequilla', 'desayuno', '8');
INSERT INTO `servicio` VALUES ('19', 'Optimiza tu tiempo y disfruta conociendo los mejores rincones de la ciudad de la mano de un guía local, y en tu idioma', 'guia incluido', '15');
INSERT INTO `servicio` VALUES ('20', 'La mejor experiencia culinaria con platos de alta calidad', 'almuerzo', '13');
INSERT INTO `servicio` VALUES ('21', 'Ofrecemos platos con un menú variado con un primer plato, un segundo, el postre y la bebida', 'cena', '3');
INSERT INTO `servicio` VALUES ('22', 'Optimiza tu tiempo y disfruta conociendo los mejores rincones de la ciudad de la mano de un guía local, y en tu idioma', 'guia incluido', '1');
INSERT INTO `servicio` VALUES ('23', 'La mejor experiencia culinaria con platos de alta calidad', 'almuerzo', '4');
INSERT INTO `servicio` VALUES ('24', 'Ofrecemos platos con un menú variado con un primer plato, un segundo, el postre y la bebida', 'cena', '12');
INSERT INTO `servicio` VALUES ('25', 'Incluye café, te o leche, jugo o frutas, pan o tostadas, mermelada o mantequilla', 'desayuno', '9');
INSERT INTO `servicio` VALUES ('26', 'Experiencias relacionadas con el wellness, con el objetivo final que los huéspedes disfruten de un buen rato cuidando de su salud y bienestar', 'masajes', '4');
INSERT INTO `servicio` VALUES ('27', 'Ofrecemos platos con un menú variado con un primer plato, un segundo, el postre y la bebida', 'cena', '14');
INSERT INTO `servicio` VALUES ('28', 'Incluye café, te o leche, jugo o frutas, pan o tostadas, mermelada o mantequilla', 'desayuno', '11');
INSERT INTO `servicio` VALUES ('29', 'Optimiza tu tiempo y disfruta conociendo los mejores rincones de la ciudad de la mano de un guía local, y en tu idioma', 'guia incluido', '9');
INSERT INTO `servicio` VALUES ('30', 'Experiencias relacionadas con el wellness, con el objetivo final que los huéspedes disfruten de un buen rato cuidando de su salud y bienestar', 'masajes', '10');
