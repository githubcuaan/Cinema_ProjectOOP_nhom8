-- MySQL dump 10.13  Distrib 8.0.38, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: cinema
-- ------------------------------------------------------
-- Server version	9.0.1

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
-- Table structure for table `customers`
--

DROP TABLE IF EXISTS `customers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `customers` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(100) DEFAULT NULL,
  `email` varchar(100) NOT NULL,
  `phone` varchar(50) DEFAULT NULL,
  `username` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  `membershiplevel` varchar(45) NOT NULL DEFAULT 'Sắt Vụn',
  PRIMARY KEY (`id`),
  UNIQUE KEY `username_UNIQUE` (`username`),
  UNIQUE KEY `id_UNIQUE` (`id`),
  CONSTRAINT `chk_password` CHECK ((`password` <> _utf8mb4'')),
  CONSTRAINT `chk_username` CHECK ((`username` <> _utf8mb4''))
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customers`
--

LOCK TABLES `customers` WRITE;
/*!40000 ALTER TABLE `customers` DISABLE KEYS */;
INSERT INTO `customers` VALUES (5,'Nguyen Van A','nguyenvana@example.com','0123476789','nguyenvana','password123','Sắt Vụn '),(6,'Tran Thi B','tranthib@example.com','0987654321','tranthib','password456','Vàng'),(7,'Le Van C','levanc@example.com','0112233445','levanc','password789','Bạc'),(8,'Pham Minh D','phamminhd@example.com','0123456780','phamminhd','password000','Vàng'),(9,'Vo Thi E','vothie@example.com','0987654310','vothie','password111','Kim Cương'),(17,'tduong','tduong.2865@gmail.com','0355070882','tduong','Duong.28','Sắt Vụn '),(19,'tester','dangcapvcl13@gmail.com','09987575743','ongtrumvankhoa','moinguoimotphuong','Sắt Vụn '),(29,'andeptrai','dangcapvcl13@gmail.com','09987575743','a','aab','Sắt Vụn'),(30,NULL,'vankhoa',NULL,'vankhoa','vankhoa','Sắt Vụn');
/*!40000 ALTER TABLE `customers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employees`
--

DROP TABLE IF EXISTS `employees`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employees` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(100) DEFAULT NULL,
  `role` varchar(50) DEFAULT NULL,
  `email` varchar(100) NOT NULL,
  `phone` varchar(50) DEFAULT NULL,
  `salary` int DEFAULT NULL,
  `username` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `username_UNIQUE` (`username`),
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employees`
--

LOCK TABLES `employees` WRITE;
/*!40000 ALTER TABLE `employees` DISABLE KEYS */;
INSERT INTO `employees` VALUES (12,'Dinh An','','dinhan.0321@gmail.com','0976681515',1000111,'admin','dinhan.0321@'),(14,'thuyduong','Employee','thuyduong@gmail.com','0322070882',19002,'thuyduong','thuyduong'),(15,'alo alo','Employee','dinhan@gmail.com','0983758268',1000,'a','a');
/*!40000 ALTER TABLE `employees` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `invoices`
--

DROP TABLE IF EXISTS `invoices`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `invoices` (
  `id` int NOT NULL AUTO_INCREMENT,
  `customer_id` int DEFAULT NULL,
  `total_amount` decimal(10,2) DEFAULT NULL,
  `purchase_date` date DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `customer_id` (`customer_id`),
  CONSTRAINT `invoices_ibfk_1` FOREIGN KEY (`customer_id`) REFERENCES `customers` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `invoices`
--

LOCK TABLES `invoices` WRITE;
/*!40000 ALTER TABLE `invoices` DISABLE KEYS */;
INSERT INTO `invoices` VALUES (1,5,22.00,'2024-01-01'),(2,6,10.00,'2024-01-02'),(3,7,15.00,'2024-01-04'),(4,8,8.00,'2024-01-05'),(5,9,9.50,'2024-01-06'),(6,5,165.00,'2024-10-27'),(7,5,235.00,'2024-10-27'),(8,5,145.00,'2024-10-27'),(9,5,145.00,'2024-10-27'),(10,29,265.00,'2024-10-27'),(11,29,270.00,'2024-10-28'),(12,29,255.00,'2024-10-28'),(13,29,250.00,'2024-10-28'),(14,29,275.00,'2024-10-28'),(15,29,265.00,'2024-10-28'),(16,29,340.00,'2024-10-28'),(17,19,230.00,'2024-10-28'),(18,29,120.00,'2024-11-07'),(19,29,370.00,'2024-11-07'),(20,29,240.00,'2024-11-07'),(21,29,360.00,'2024-11-08'),(22,29,120.00,'2024-11-08'),(23,29,265.00,'2024-11-08'),(24,29,440.00,'2024-11-08');
/*!40000 ALTER TABLE `invoices` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `movies`
--

DROP TABLE IF EXISTS `movies`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `movies` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `genre` varchar(100) DEFAULT NULL,
  `release_date` date DEFAULT NULL,
  `director` varchar(255) DEFAULT NULL,
  `duration` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `movies`
--

LOCK TABLES `movies` WRITE;
/*!40000 ALTER TABLE `movies` DISABLE KEYS */;
INSERT INTO `movies` VALUES (1,'Avengers: Endgame','Hành động','2019-04-26','Anthony Russo, Joe Russo',181),(2,'Inception','Khoa học viễn tưởng','2010-07-16','Christopher Nolan',148),(3,'The Dark Knight','Hành động','2008-07-18','Christopher Nolan',152),(4,'Titanic','Tâm lý','1997-12-19','James Cameron',195),(5,'Spider-Man: No Way Home','Hành động','2021-12-17','Jon Watts',148),(6,'I Love Thùy Dương','Tình Cảm','2024-11-07','DinhAn',190),(7,'HelloWorld: Java','Trinh Thám','2024-11-07','dinhan',60);
/*!40000 ALTER TABLE `movies` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `order_items`
--

DROP TABLE IF EXISTS `order_items`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `order_items` (
  `id` int NOT NULL AUTO_INCREMENT,
  `invoice_id` int DEFAULT NULL,
  `product_id` int DEFAULT NULL,
  `quantity` int DEFAULT NULL,
  `price` decimal(10,2) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `invoice_id` (`invoice_id`),
  KEY `product_id` (`product_id`),
  CONSTRAINT `order_items_ibfk_1` FOREIGN KEY (`invoice_id`) REFERENCES `invoices` (`id`),
  CONSTRAINT `order_items_ibfk_2` FOREIGN KEY (`product_id`) REFERENCES `products` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `order_items`
--

LOCK TABLES `order_items` WRITE;
/*!40000 ALTER TABLE `order_items` DISABLE KEYS */;
INSERT INTO `order_items` VALUES (1,14,1,1,35.00),(2,15,1,1,25.00),(3,16,1,1,100.00),(4,17,1,1,100.00),(5,19,2,2,35.00),(6,23,1,1,25.00),(7,24,2,2,35.00),(8,24,2,2,35.00);
/*!40000 ALTER TABLE `order_items` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `products`
--

DROP TABLE IF EXISTS `products`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `products` (
  `id` int NOT NULL AUTO_INCREMENT,
  `ten` varchar(100) NOT NULL,
  `loai_san_pham` varchar(100) DEFAULT NULL,
  `gia_ban` decimal(10,2) NOT NULL,
  `so_luong` int NOT NULL,
  `nha_cung_cap` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `products`
--

LOCK TABLES `products` WRITE;
/*!40000 ALTER TABLE `products` DISABLE KEYS */;
INSERT INTO `products` VALUES (1,'Bắp rang bơ nhỏ','Đồ ăn',30.00,1000,'Công Ti Thùy Dương'),(2,'Bắp rang bơ lớn','Đồ ăn',50.00,80,'Công Ti Thùy Dương'),(3,'Coca-Cola lon','Nước uống',25.00,120,'LaiChauDrinks'),(4,'Pepsi lon','Nước uống',25.00,110,'PepsiCo Việt Nam'),(5,'Nước cam ép','Nước uống',40.00,60,'Công ty CP Nước Ép Trái Cây Fresh'),(6,'Nước khoáng','Nước uống',15.00,150,'La Vie Việt Nam'),(8,'Hotdog','Đồ ăn',35.00,90,'Công ty TNHH Đồ Ăn Nhanh BestFood'),(9,'Hamburger','Đồ ăn',45.00,75,'Công ty TNHH Đồ Ăn Nhanh BestFood'),(10,'Khoai tây chiên','Đồ ăn',30.00,85,'Công ty CP Khoai Tây CrispStar'),(11,'Bánh mì sandwich','Đồ ăn',40.00,60,'Công ty TNHH Bánh Mì VietBread'),(12,'Nước ép táo','Nước uống',40.00,50,'Công ty CP Nước Ép Trái Cây Fresh'),(13,'Sữa chua uống','Nước uống',30.00,70,'Vinamilk'),(14,'Bắp phô mai','Đồ ăn',55.00,80,'Công ty TNHH Thực Phẩm ABC'),(15,'Chocolate thanh','Đồ ăn',25.00,100,'Công ty CP Socola ChocoDelight'),(16,'Nước tăng lực Red Bull','Nước uống',35.00,100,'Red Bull Việt Nam'),(17,'Kẹo cao su','Đồ ăn',10.00,200,'Công ty TNHH Wrigley Việt Nam'),(18,'Trà xanh lon','Nước uống',30.00,110,'Công ty TNHH Trà Xanh 0 Độ'),(19,'Bánh ngọt','Đồ ăn',35.00,75,'Công ty TNHH Bánh Kẹo Kinh Đô'),(21,'Combo người yêu + hôn hít','Combo',100.00,10,'Anh Thành Cám Chim'),(22,'Nước Mía','Nước uống',15.00,100,'Anh Hùng Nước Mía'),(23,'Chanh Tuyết','Nước uống',15.00,120,'Chị Hằng Trà Đá');
/*!40000 ALTER TABLE `products` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `screening_status`
--

DROP TABLE IF EXISTS `screening_status`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `screening_status` (
  `id` int NOT NULL AUTO_INCREMENT,
  `movie_id` int NOT NULL,
  `showtime` time NOT NULL,
  `showdate` date NOT NULL,
  `ticket_price` double NOT NULL,
  `seats_available` int NOT NULL,
  `total_seats` int NOT NULL,
  `theater_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `movie_id` (`movie_id`),
  KEY `fk_screening_theater` (`theater_id`),
  CONSTRAINT `fk_screening_theater` FOREIGN KEY (`theater_id`) REFERENCES `theater` (`id`),
  CONSTRAINT `screening_status_ibfk_1` FOREIGN KEY (`movie_id`) REFERENCES `movies` (`id`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `screening_status`
--

LOCK TABLES `screening_status` WRITE;
/*!40000 ALTER TABLE `screening_status` DISABLE KEYS */;
INSERT INTO `screening_status` VALUES (1,1,'18:30:00','2024-05-01',65,16,20,1),(2,1,'20:00:00','2024-11-15',89,20,20,2),(3,2,'19:00:00','2024-05-02',59,19,20,3),(4,3,'17:00:00','2024-05-03',80,19,20,4),(5,4,'21:00:00','2024-05-04',92,19,20,5),(6,1,'18:00:00','2024-10-16',110,3,20,1),(7,2,'20:30:00','2024-10-16',130,16,20,3),(8,3,'17:00:00','2024-10-15',130,20,20,4),(9,4,'19:00:00','2024-10-15',140,20,20,2),(10,5,'21:00:00','2024-10-17',160,19,20,6),(13,7,'17:23:00','2024-11-15',111,20,20,1),(14,3,'17:42:00','2024-11-15',222,20,20,1),(15,6,'17:54:00','2024-11-15',111,20,20,4);
/*!40000 ALTER TABLE `screening_status` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `theater`
--

DROP TABLE IF EXISTS `theater`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `theater` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  `location` varchar(255) DEFAULT NULL,
  `phone` varchar(100) DEFAULT NULL,
  `description` text,
  PRIMARY KEY (`id`),
  UNIQUE KEY `name` (`name`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `theater`
--

LOCK TABLES `theater` WRITE;
/*!40000 ALTER TABLE `theater` DISABLE KEYS */;
INSERT INTO `theater` VALUES (1,'CGV Vincom','Vincom Center, HCM','0909123456','Rạp hiện đại tại Vincom Center'),(2,'Galaxy Cinema','Nguyễn Du, HCM','0933445566','Rạp có phòng chiếu 3D chất lượng cao'),(3,'Lotte Cinema','Lotte Mart, HCM','0912233445','Rạp nằm trong trung tâm thương mại Lotte'),(4,'BHD Star','Bitexco, HCM','0977558899','Rạp chiếu phim tại Bitexco Tower'),(5,'CGV Crescent Mall','Crescent Mall, Q7, HCM','0966112233','Rạp hiện đại tại Crescent Mall'),(6,'CineStar','Hai Bà Trưng, HCM','0988222333','Rạp chiếu phim tại trung tâm thành phố');
/*!40000 ALTER TABLE `theater` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tickets`
--

DROP TABLE IF EXISTS `tickets`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tickets` (
  `id` int NOT NULL AUTO_INCREMENT,
  `movie_id` int DEFAULT NULL,
  `customer_id` int DEFAULT NULL,
  `price` decimal(10,2) NOT NULL,
  `purchase_date` date DEFAULT NULL,
  `seat_number` varchar(10) DEFAULT NULL,
  `invoice_id` int DEFAULT NULL,
  `screening_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `movie_id` (`movie_id`),
  KEY `customer_id` (`customer_id`),
  KEY `invoice_id` (`invoice_id`),
  KEY `fk_screening` (`screening_id`),
  CONSTRAINT `fk_screening` FOREIGN KEY (`screening_id`) REFERENCES `screening_status` (`id`),
  CONSTRAINT `tickets_ibfk_1` FOREIGN KEY (`movie_id`) REFERENCES `movies` (`id`) ON DELETE CASCADE,
  CONSTRAINT `tickets_ibfk_2` FOREIGN KEY (`customer_id`) REFERENCES `customers` (`id`) ON DELETE CASCADE,
  CONSTRAINT `tickets_ibfk_3` FOREIGN KEY (`invoice_id`) REFERENCES `invoices` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=40 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tickets`
--

LOCK TABLES `tickets` WRITE;
/*!40000 ALTER TABLE `tickets` DISABLE KEYS */;
INSERT INTO `tickets` VALUES (7,1,5,10.00,'2024-01-01','A1',1,1),(8,1,6,10.00,'2024-01-02','A2',2,1),(9,2,5,12.00,'2024-01-03','B1',NULL,3),(10,3,7,15.00,'2024-01-04','C1',3,4),(11,4,8,8.00,'2024-01-05','D1',4,5),(12,5,9,9.50,'2024-01-06','E1',5,10),(16,1,29,120.00,'2024-10-28','B5',NULL,6),(17,1,29,120.00,'2024-10-28','A5',NULL,6),(18,1,29,120.00,'2024-10-28','A4',NULL,6),(19,1,29,120.00,'2024-10-28','B4',NULL,6),(20,1,29,120.00,'2024-10-28','C3',NULL,6),(21,1,29,120.00,'2024-10-28','C4',NULL,6),(22,1,29,120.00,'2024-10-28','A6',NULL,6),(23,1,29,120.00,'2024-10-28','B6',NULL,6),(24,1,19,65.00,'2024-10-28','A5',NULL,1),(25,1,19,65.00,'2024-10-28','B5',NULL,1),(26,1,29,120.00,'2024-11-07','C2',NULL,6),(27,2,29,150.00,'2024-11-07','C4',19,7),(28,2,29,150.00,'2024-11-07','B5',19,7),(29,1,29,120.00,'2024-11-07','B7',20,6),(30,1,29,120.00,'2024-11-07','A7',20,6),(31,1,29,120.00,'2024-11-08','A2',21,6),(32,1,29,120.00,'2024-11-08','A3',21,6),(33,1,29,120.00,'2024-11-08','A1',21,6),(35,1,29,120.00,'2024-11-08','C1',22,6),(36,1,29,120.00,'2024-11-08','B8',23,6),(37,1,29,120.00,'2024-11-08','A8',23,6),(38,2,29,150.00,'2024-11-08','A6',24,7),(39,2,29,150.00,'2024-11-08','B6',24,7);
/*!40000 ALTER TABLE `tickets` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER `update_available_seat` AFTER INSERT ON `tickets` FOR EACH ROW BEGIN
    -- Cập nhật số ghế còn trống trong screening_status sau khi thêm vé mới
    UPDATE screening_status 
    SET seats_available = seats_available - 1
    WHERE id = NEW.screening_id; 
END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Dumping events for database 'cinema'
--

--
-- Dumping routines for database 'cinema'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-11-17  9:53:52
