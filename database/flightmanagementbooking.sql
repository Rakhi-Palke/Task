create database flightmanagementbooking;
use flightmanagementbooking;
CREATE TABLE `flight` (
  `flight_id` int(11) NOT NULL,
  `flight_name` varchar(30) NOT NULL,
  `flight_price` float NOT NULL,
  `flight_source` varchar(20) NOT NULL,
  `flight_destination` varchar(20) NOT NULL,
  `flight_date` varchar(10) NOT NULL,
  `flight_time` varchar(20) NOT NULL,
  `flight_duration` varchar(10) NOT NULL,
  `flight_total_seats` int(11) NOT NULL,
  `flight_available_seats` int(11) NOT NULL,
  PRIMARY KEY  (`flight_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*!40000 ALTER TABLE `flight` DISABLE KEYS */;
LOCK TABLES `flight` WRITE;
INSERT INTO `flight` VALUES (1,'Indigo Air Boing 112',234.3,'Rajkot','Surat','2020-02-04','18:30','2 hours',300,25),(2,'AirIndia Boing 29',100,'Rajkot','Surat','2020-02-04','19:15','1.5 hours',200,15),(3,'Jet Airways',130,'Rajkot','Surat','2020-02-04','13:00','1.7 hours',220,10);
UNLOCK TABLES;
/*!40000 ALTER TABLE `flight` ENABLE KEYS */;


CREATE TABLE `passenger` (
  `passenger_id` int(11) NOT NULL auto_increment,
  `flight_id` int(11) NOT NULL,
  `passenger_name` varchar(30) NOT NULL,
  `passenger_age` int(11) NOT NULL,
  `passenger_gender` varchar(1) NOT NULL,
  `passenger_mobile` varchar(13) NOT NULL,
  `passenger_email` varchar(50) NOT NULL,
  `passenger_seat` varchar(5) NOT NULL,
  PRIMARY KEY  (`passenger_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;



/*!40000 ALTER TABLE `passenger` DISABLE KEYS */;
LOCK TABLES `passenger` WRITE;
INSERT INTO `passenger` VALUES (1,2,'Rushit Saliya',19,'m','9327650673','rushit@gmail.com','M3'),(2,2,'Priyank Vekariya',19,'m','8156008166','priyank@gmail.com','C9'),(3,1,'Hardik Khunt',19,'m','1234567890','hardik@gmail.com','Q10'),(4,2,'Jenil Popat',19,'f','1234567890','jenil@gmail.com','A1'),(5,2,'Rushit Saliya',19,'m','9327650673','rushitsaliya99@gmail.com','A3'),(6,3,'Priyank Vekariya',19,'m','8156008166','rushit.saliya9@gmail.com','F6'),(7,3,'Dhaval Sanghani',19,'o','1234567890','rushitsaliya99@gmail.com','D1'),(8,1,'Kishor Kadam',30,'m','7276763516','kadamk33@gmail.com','J8');
UNLOCK TABLES;
CREATE TABLE `user` (
  `user_id` int(11) NOT NULL auto_increment,
  `user_name` varchar(30) NOT NULL,
  `user_bdate` varchar(10) NOT NULL,
  `user_gender` varchar(1) NOT NULL,
  `user_mobile` varchar(13) NOT NULL,
  `user_email` varchar(50) NOT NULL,
  `user_location` varchar(100) NOT NULL,
  `user_password` varchar(30) NOT NULL,
  `user_category` varchar(5) NOT NULL default 'user',
  PRIMARY KEY  (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*!40000 ALTER TABLE `user` DISABLE KEYS */;
LOCK TABLES `user` WRITE;
INSERT INTO `user` VALUES (1,'Rushit Saliya','1999-12-05','m','9327650673','rushit@gmail.com','Surat, Gujarat','pass','admin'),(2,'Priyank Vekariya','1999-10-09','m','8156008166','priyank@gmail.com','Rajkot, Gujarat','test','user'),(3,'Divu','2000-05-01','m','8845568076','divyesh@gmail.com','Surendranagar, Gujarat','test123','user'),(4,'Hardik Khunt','2019-09-07','m','1234567890','hardik@gmail.com','Surat, Gujarat','hardik','user'),(5,'Kishor Kadam','2019-11-27','m','9404308673','kadamk33@gmail.com','Pune','java@1991','user');
UNLOCK TABLES;

