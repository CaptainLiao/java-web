CREATE TABLE `address` (
    `id` int (11) unsigned not null,
    `address` varchar (20) default null,
    `country` varchar (20) default null,
    primary key (`id`)
) engine = InnoDB default charset=utf8;