--liquibase formatted sql

--changeset romaud:create_table_user

CREATE TABLE `demo_db`.`users` (
    `id` INT AUTO_INCREMENT PRIMARY KEY,
    `name` VARCHAR(32));


