CREATE TABLE `swot` (
  `id_swot` bigint NOT NULL AUTO_INCREMENT,
  `ds_swot` varchar(255) DEFAULT NULL,
  `id_empresa` bigint DEFAULT NULL,
  `ie_desempenho` varchar(255) DEFAULT NULL,
  `ie_relevancia` varchar(255) DEFAULT NULL,
  `id_planejamento` bigint DEFAULT NULL,
  `id_objetivo` bigint DEFAULT NULL,
  PRIMARY KEY (`id_swot`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;