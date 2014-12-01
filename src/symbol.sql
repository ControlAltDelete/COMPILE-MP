create database if not exists symbols;

use symbols;

drop table if exists symbol_table;

create table symbol_table
(
  name varchar(10),
  type1 varchar(20),
  type2 varchar(20),
  scope varchar(20),
  primary key (name)
);