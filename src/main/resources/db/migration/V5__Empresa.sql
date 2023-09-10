CREATE TABLE `empresa` (
  `id_empresa` bigint NOT NULL AUTO_INCREMENT,
  `ds_empresa` varchar(255) DEFAULT NULL,
  `ds_situacao` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_empresa`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;