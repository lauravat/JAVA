create database Activity;
use Activity;

create table users_tbl(
user_id int primary key auto_increment not null,
user_firstname varchar(50) not null,
user_lastname varchar(50) not null,
user_email varchar(80) not null,
user_password varbinary(255) not null
);

insert into users_tbl(user_firstname, user_lastname, user_email, user_password) values (upper('Laura Valentina'), upper('Aguilar Talero'), 'lau3232435124@gmail.com', aes_encrypt('Laura_Vat-302_4','$2a$12$CQCmQjJfHaAMKeFhg/Kipus9cUm6cjcX2AfOmlQleeu0cuMXOqn0G'));
select *, cast(aes_decrypt(user_password,'$2a$12$CQCmQjJfHaAMKeFhg/Kipus9cUm6cjcX2AfOmlQleeu0cuMXOqn0G') as char (50))end_data from users_tbl where user_id=1; 
select * from users_tbl;
