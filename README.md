# JAVA
CREATE TABLE `users_tbl` (
	`user_id` int NOT NULL AUTO_INCREMENT,
	`user_firtsname` varchar(40) NOT NULL,
	`user_lastname` varchar(40) NOT NULL,
	`user_addres` varchar(40) NOT NULL,
	`user_email` varchar(40) NOT NULL,
	`user_password` varchar(256) NOT NULL,
	PRIMARY KEY (`user_id`)
) ENGINE InnoDB,
  CHARSET utf8mb4,
  COLLATE utf8mb4_0900_ai_ci;




En este trabajo se encuentra un formulario de registro con unos campos que se tienen que llenar de manera obligatoria, se utilizó una conexión a bases de datos con los campos que se piden en el formulario. 
