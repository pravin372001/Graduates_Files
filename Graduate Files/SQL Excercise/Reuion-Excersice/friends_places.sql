-- MySQL dump 10.13  Distrib 8.0.36, for Win64 (x86_64)
--
-- Host: localhost    Database: friends
-- ------------------------------------------------------
-- Server version	8.0.36

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `places`
--

DROP TABLE IF EXISTS `places`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `places` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `place_category_id` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `place_category_id_foreign` (`place_category_id`),
  CONSTRAINT `place_category_id_foreign` FOREIGN KEY (`place_category_id`) REFERENCES `place_category` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=52 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `places`
--

LOCK TABLES `places` WRITE;
/*!40000 ALTER TABLE `places` DISABLE KEYS */;
INSERT INTO `places` VALUES (1,'Amma Mess',4),(2,'Anjappar Chettinad Restaurant',4),(3,'Adyar Anand Bhavan',4),(4,'Al Sham',4),(5,'Trichy Sethuram Mess',4),(6,'New Arcot Biriyani Center',4),(7,'KMS Hakkim',4),(8,'Kannappan Restaurant',4),(9,'Aasif Biriyani',4),(10,'KFC',4),(11,'Burger King',4),(12,'Domino\'s',4),(13,'Madurai Vilas',4),(14,'Ratna Café',4),(15,'Junior Kuppan',4),(16,'Zaitoon',4),(17,'Spencer Plaza',3),(18,'Phoenix Market City',3),(19,'Express Avenue',3),(20,'Grand Mall',3),(21,'VR Mall',3),(22,'Chennai Citi Center',3),(23,'Forum Vijaya Mall',3),(24,'Marina Mall',3),(25,'Aero Hub East',3),(26,'BSR Mall',3),(27,'AGS Cinemas',2),(28,'PVR Sathayam Cinemas',2),(29,'Kasi Talkies',2),(30,'Vettri Theatre',2),(31,'Venkateswara Theatre',2),(32,'Cinepolis BSR Mall',2),(33,'Sangam Cinemas',2),(34,'PVR Spectrum Mall',2),(35,'Nexus Vijya Mall',2),(36,'Luxe Cinemas',2),(37,'Mayajaal Multiplex',2),(38,'Rohini Silver Screens',2),(39,'Kamal Cinemas',2),(40,'Inox Phoenix',2),(41,'Marina Beach',1),(42,'Thiruvanmiyur Beach',1),(43,'Besant Beach',1),(44,'Kovalam Beach',1),(45,'Breezy Beach',1),(46,'VGP Golden Beach',1),(47,'Palavakkam Beach',1),(48,'Santhome Beach',1),(49,'Kasimedu Beach',1),(50,'Mahabalipuram Beach',1),(51,'Enfour Beach',1);
/*!40000 ALTER TABLE `places` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-05-02  9:08:24
