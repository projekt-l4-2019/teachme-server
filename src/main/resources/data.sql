INSERT INTO notice (id_notice, look_or_offer, note, meeting_place, meeting_date, price, subject_id_subject, active, timestamp, user_id_user, meeting_id_meeting, time_from, time_to, level)
values(1, '0', 'Udzielę korypetycji z fizyki. Zapraszam i polecam.', 'Rzeszów','2019-06-07', '70', 45,  1, '2019-06-05 19:10:25-07', 1, 1, '2019-06-07 12:00:00', '2019-06-07 18:00:00', 1);
INSERT INTO notice (id_notice, look_or_offer, note, meeting_place, meeting_date, price, subject_id_subject, active, timestamp, user_id_user, meeting_id_meeting, time_from, time_to, level)
values(2, '1', 'Szukam korypetycji z informatyki.', 'Rzeszów','2019-06-07', '70', 60,  1, '2019-06-05 19:10:25-07', 2, 2, '2019-06-07 12:00:00', '2019-07-07 18:00:00', 1);


INSERT INTO admin (id_admin, login, password,email)
values(1,’lukasz12’,’qwerty12’,lukasz123@gmail.com’);

INSERT INTO admin (id_admin, login, password,email)
values(1,’pudzian 2’,’sila12’,pudzian3@gmail.com’);


INSERT INTO opinion (id_opinion, rating, comment, user_to, user_from, user_id_user, user_id_user1)
values(1, 4, ‘bardzo fajnie prowadzone korepetycje’, 1, 2, 1, 2);

INSERT INTO opinion (id_opinion, rating, comment, user_to, user_from, user_id_user, user_id_user1)
values(2, 2, ‘korepetytor slabo przygotowany do zajec, 2, 1, 2, 1);






INSERT INTO subject (id_subject, name)
values(2, ‘automatyka’);

INSERT INTO subject (id_subject, name)
values(1, ‘aktorstwo’);



INSERT INTO userr (id_user, login, name, surname, birth_date, avatar, phone, email, timesstamp, password, city_id_city, about, id_city)
values(1, ‘buzio12’, ‘Bartosz’, ‘Kozak’, ‘1995-05-12’, ‘s’, ‘880930111’, ‘buzio12@gmail.com’, '2019-06-05 19:10:25-07', ‘12sf2’, 1, ‘Sympatyczny’, 1);

INSERT INTO userr (id_user, login, name, surname, birth_date, avatar, phone, email, timesstamp, password, city_id_city, about, id_city)
values(2, ‘aga42’, ‘Agnieszka’, ‘Losz’, ‘1993-04-22’, ‘s’, ‘991930411’, ‘pierniczek.aga@gmail.com’, '2019-06-05 19:10:25-07', ‘sdas1f2’, 2, ‘Cierpliwa’, 2);



INSERT INTO city (id_city, name, voivodeship_id_voivodeship)
values(1, ‘Warszawa’, 1);

INSERT INTO city (id_city, name, voivodeship_id_voivodeship)
values(2, ‘Kraków’, 2);


INSERT INTO voivodeship (id_ voivodeship, name_ voivodeship)
values(1, ‘mazowieckie’);
INSERT INTO voivodeship (id_ voivodeship, name_ voivodeship)
values(2, ‘małopolskie’);
