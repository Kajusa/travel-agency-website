/** DROP table if exists trip;
DROP table if exists hotel;
DROP table if exists destination;
CREATE TABLE `destination` (
                               `idDestination` int NOT NULL AUTO_INCREMENT,
                               `DestinationName` varchar(45) NOT NULL,
                               PRIMARY KEY (`idDestination`),
                               UNIQUE KEY `idDestination_UNIQUE` (`idDestination`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `hotel` (
                         `idHotel` int NOT NULL AUTO_INCREMENT,
                         `idDestination` int NOT NULL,
                         `hotelName` varchar(45) NOT NULL,
                         `stars` int DEFAULT NULL,
                         `forKids` tinyint DEFAULT NULL,
                         `swimmingPool` tinyint(1) DEFAULT NULL,
                         PRIMARY KEY (`idHotel`),
                         KEY `destination_idx` (`idDestination`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


CREATE TABLE `trip` (
                        `idTrip` int NOT NULL AUTO_INCREMENT,
                        `idHotel` int NOT NULL,
                        `departureDate` date DEFAULT NULL,
                        `arrivalDate` date DEFAULT NULL,
                        `numberOfDays` int DEFAULT NULL,
                        `type` varchar(45) DEFAULT NULL,
                        `priceAdult` decimal(10,0) DEFAULT NULL,
                        `priceChild` decimal(10,0) DEFAULT NULL,
                        `promoted` tinyint(1) DEFAULT NULL,
                        `description` varchar(200) DEFAULT NULL,
                        `freeBeds` int DEFAULT NULL,
                        PRIMARY KEY (`idTrip`),
                        KEY `hotel_idx` (`idHotel`),
                        CONSTRAINT `hotel` FOREIGN KEY (`idHotel`) REFERENCES `hotel` (`idHotel`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
