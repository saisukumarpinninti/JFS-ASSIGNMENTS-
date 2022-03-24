create table users(
username varchar_ignorecase(50) not null primary key , 
password varchar_ignorecase(50) not null , 
enabled boolean not null 
accountNonExpired TINYINT NOT NULL DEFAULT 1 ,
  accountNonLocked TINYINT NOT NULL DEFAULT 1 ,
  credentialsNonExpired TINYINT NOT NULL DEFAULT 1,);

create table authorities (
username varchar_ignorecase(50) not null primary key , 
authority varchar_ignorecase(50) not null , 
constraint fk_authorities_users foreign key(username) references users(username) );

CREATE TABLE user_attempts (
  username varchar(45) NOT NULL primary key,
  attempts varchar(45) NOT NULL,
  lastModified datetime NOT NULL
  constraint fk_authorities_users foreign key(username) references users(username) 
);

create unique index ix_auth_username on authorities (username,authority);

CREATE TABLE `user_attempts` (
  `uname` varchar(45) NOT NULL,
  `attempts` int(11) NOT NULL,
  `lastModified` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp()
)

