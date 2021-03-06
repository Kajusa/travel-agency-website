CREATE TABLE trip (
                      idTrip int NOT NULL AUTO_INCREMENT,
                      idHotel int NOT NULL,
                      departureDate date DEFAULT NULL,
                      arrivalDate date DEFAULT NULL,
                      numberOfDays int DEFAULT NULL,
                      type varchar(45) DEFAULT NULL,
                      priceAdult decimal(10,0) DEFAULT NULL,
                      priceChild decimal(10,0) DEFAULT NULL,
                      promoted tinyint(1) DEFAULT NULL,
                      description varchar(200) DEFAULT NULL,
                      freeBeds int DEFAULT NULL,
                      PRIMARY KEY (idTrip)
) ;

CREATE TABLE destination (
                               idDestination int NOT NULL AUTO_INCREMENT,
                               DestinationName varchar(45) NOT NULL,
                               PRIMARY KEY (idDestination)
) ;

CREATE TABLE hotel (
                         idHotel int NOT NULL AUTO_INCREMENT,
                         idDestination int NOT NULL,
                         hotelName varchar(45) NOT NULL,
                         stars int DEFAULT NULL,
                         forKids tinyint(1) DEFAULT NULL,
                         swimmingPool tinyint(1) DEFAULT NULL,
                         PRIMARY KEY (idHotel)
) ;


