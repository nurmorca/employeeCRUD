use `employee_tracker`;
drop table if exists `employee`;

create table `employee` (
`id` int not null auto_increment, 
`first_name` varchar(50) not null,
`last_name` varchar(50) not null,
`email` varchar(50) not null,
primary key (`id`)
) engine=InnoDB default charset=latin1;

insert into `employee` (`first_name`, `last_name`, `email`)
values
('nur', 'morca', 'nur@morca.com'),
('bruce', 'wayne', 'bruce@wayne.com'),
('clark', 'kent', 'clark@kent.com'),
('selina', 'kyle', 'selina@kyle.com');
