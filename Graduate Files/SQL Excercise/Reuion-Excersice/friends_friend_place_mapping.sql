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
-- Table structure for table `friend_place_mapping`
--

DROP TABLE IF EXISTS `friend_place_mapping`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `friend_place_mapping` (
  `id` int NOT NULL AUTO_INCREMENT,
  `places_id` int NOT NULL,
  `friends_id` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `places_id_foreign` (`places_id`),
  KEY `friends_id_foreign` (`friends_id`),
  CONSTRAINT `friends_id_foreign` FOREIGN KEY (`friends_id`) REFERENCES `friends` (`id`),
  CONSTRAINT `places_id_foreign` FOREIGN KEY (`places_id`) REFERENCES `places` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=53 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `friend_place_mapping`
--

LOCK TABLES `friend_place_mapping` WRITE;
/*!40000 ALTER TABLE `friend_place_mapping` DISABLE KEYS */;
INSERT INTO `friend_place_mapping` VALUES (1,1,4),(2,1,1),(3,2,2),(4,3,3),(8,1,1),(9,18,1),(10,28,1),(11,42,1),(12,5,1),(13,19,1),(14,32,1),(15,43,1),(16,10,1),(17,21,1),(18,33,1),(19,47,1),(20,15,1),(21,23,1),(22,37,1),(23,50,1),(24,16,1),(25,26,1),(26,38,1),(27,40,1),(28,3,14),(29,23,14),(30,30,14),(31,31,14),(32,39,14),(33,44,14),(34,38,14),(35,1,4),(36,20,4),(37,38,4),(38,41,4),(39,17,2),(40,27,2),(41,41,2),(42,2,2),(43,19,2),(44,30,2),(45,44,2),(46,2,2),(47,24,2),(48,38,2),(49,5,2),(50,40,2),(51,13,2),(52,9,2);
/*!40000 ALTER TABLE `friend_place_mapping` ENABLE KEYS */;
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
