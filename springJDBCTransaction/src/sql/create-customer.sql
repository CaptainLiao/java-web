CREATE TABLE `Customer` (
    `id` int(11) unsigned NOT NULL,
    `addressId` int (11) unsigned NOT NULL,
    `name` varchar(20) DEFAULT NULL,
    PRIMARY KEY (`id`),
    constraint `fk_address_id` foreign key (`addressId`) references `address` (`id`) on update cascade on delete cascade
) ENGINE=InnoDB DEFAULT CHARSET=utf8;