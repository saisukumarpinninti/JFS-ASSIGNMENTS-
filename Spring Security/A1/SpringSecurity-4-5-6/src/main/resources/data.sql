INSERT INTO users (username , password , enabled)
values ('user','s',true);

INSERT INTO users (username , password , enabled)
values ('admin','s',true);

INSERT INTO authorities (username ,authority)
values ('user','ROLE_USER');

INSERT INTO authorities (username ,authority)
values ('admin','ROLE_ADMIN');

INSERT INTO `user_attempts` (`uname`, `attempts`, `lastModified`) VALUES
('admin', 1, '2022-03-24 14:05:56'),
('user', 1, '2022-03-24 14:04:15'),
('admin', 1, '2022-03-24 14:05:56'),
('user', 1, '2022-03-24 14:04:15');


ALTER TABLE `user_attempts`
  ADD KEY `fattempts_user` (`uname`);
  
  ALTER TABLE `user_attempts`
  ADD CONSTRAINT `fattempts_user` FOREIGN KEY (`uname`) REFERENCES `users` (`username`);
COMMIT;