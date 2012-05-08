
# --- !Ups

create table account (
  name                      varchar(255) not null,
  password                  varchar(255),
  constraint pk_account primary key (name)
);

create table connexion (
  name                     varchar(255) not null,
  date    					TIMESTAMP,
  adresseip                 varchar(255),
  adressemac                varchar(255),
  constraint pk_connexion primary key (name, date)
);

# --- !Downs

drop table if exists account;
drop table if exists connexion;