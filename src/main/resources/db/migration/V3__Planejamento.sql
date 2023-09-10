CREATE TABLE `planejamento` (
  `id_plano` bigint NOT NULL AUTO_INCREMENT,
  `ds_ano_inicio` varchar(255) DEFAULT NULL,
  `ds_plano` varchar(255) DEFAULT NULL,
  `ds_tipo_periodo` varchar(255) DEFAULT NULL,
  `id_empresa` bigint DEFAULT NULL,
  `nr_perido` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_plano`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;