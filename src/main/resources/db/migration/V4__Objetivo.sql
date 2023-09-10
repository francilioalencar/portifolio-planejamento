CREATE TABLE `objetivo` (
  `id_objetivo` bigint NOT NULL AUTO_INCREMENT,
  `ds_objetivo` varchar(255) DEFAULT NULL,
  `ds_pronto` varchar(255) DEFAULT NULL,
  `id_empresa` bigint DEFAULT NULL,
  `id_planejamento` bigint DEFAULT NULL,
  PRIMARY KEY (`id_objetivo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;