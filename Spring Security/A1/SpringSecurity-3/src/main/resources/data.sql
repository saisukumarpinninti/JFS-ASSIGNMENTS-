INSERT INTO users (username , password , enabled)
values ('user','s',true);

INSERT INTO users (username , password , enabled)
values ('admin','s',true);

INSERT INTO authorities (username ,authority)
values ('user','ROLE_USER');

INSERT INTO authorities (username ,authority)
values ('admin','ROLE_ADMIN');