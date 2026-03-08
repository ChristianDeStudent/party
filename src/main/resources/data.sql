
INSERT INTO Client (name, nr_Of_Orders, total_amount, discount_taken)
VALUES ('John', 5,23,4.99);

-- noinspection SqlNoDataSourceInspectionForFile

insert into VENUE
(VENUE_NAME, LINK_MORE_INFO,
 CAPACITY, FOOD_PROVIDED, INDOOR, OUTDOOR, FREE_PARKING_AVAILABLE, CITY, DISTANCE_FROM_PUBLIC_TRANSPORT_IN_KM,
 IMAGE_URL)
values ('De Club', 'https://transitm.mechelen.be/de-club',
        150, false, true, false, true, 'Mechelen', 2,
        '/img/venue_club.jpg');

insert into VENUE
(VENUE_NAME, LINK_MORE_INFO,
 CAPACITY, FOOD_PROVIDED, INDOOR, OUTDOOR, FREE_PARKING_AVAILABLE, CITY, DISTANCE_FROM_PUBLIC_TRANSPORT_IN_KM,
 IMAGE_URL)
values ('De Loods', 'https://transitm.mechelen.be/de-loods',
        1000, false, true, false, true, 'Mechelen', 2,
        '/img/venue_deloods.jpg');

insert into VENUE
(VENUE_NAME, LINK_MORE_INFO,
 CAPACITY, FOOD_PROVIDED, INDOOR, OUTDOOR, FREE_PARKING_AVAILABLE, CITY, DISTANCE_FROM_PUBLIC_TRANSPORT_IN_KM,
 IMAGE_URL)
values ('Zapoi', 'https://www.facebook.com/KafeeZapoi/',
        150, true, true, false, false, 'Mechelen', 4,
        '/img/venue_zapoi.jpg');

insert into VENUE
(VENUE_NAME, LINK_MORE_INFO,
 CAPACITY, FOOD_PROVIDED, INDOOR, OUTDOOR, FREE_PARKING_AVAILABLE, CITY, DISTANCE_FROM_PUBLIC_TRANSPORT_IN_KM,
 IMAGE_URL)
values ('De Kuub', 'http://www.dekuub.be',
        150, true, true, true, false, 'Mechelen', 4,
        '/img/venue_dekuub.jpg');

insert into VENUE
(VENUE_NAME, LINK_MORE_INFO,
 CAPACITY, FOOD_PROVIDED, INDOOR, OUTDOOR, FREE_PARKING_AVAILABLE, CITY, DISTANCE_FROM_PUBLIC_TRANSPORT_IN_KM,
 IMAGE_URL)
values ('t''Ile Maline', 'https://www.tilemalines.be',
        400, true, true, true, false, 'Mechelen', 6,
        '/img/venue_tilemalines.jpg');

insert into VENUE
(VENUE_NAME, LINK_MORE_INFO,
 CAPACITY, FOOD_PROVIDED, INDOOR, OUTDOOR, FREE_PARKING_AVAILABLE, CITY, DISTANCE_FROM_PUBLIC_TRANSPORT_IN_KM,
 IMAGE_URL)
values ('Nekkerhal', 'https://www.nekkerhalbrusselsnorth.com/organiseer/hal/',
        8800, false, true, false, true, 'Mechelen', 4,
        '/img/venue_nekkerhal.jpg');

insert into VENUE
(VENUE_NAME, LINK_MORE_INFO,
 CAPACITY, FOOD_PROVIDED, INDOOR, OUTDOOR, FREE_PARKING_AVAILABLE, CITY, DISTANCE_FROM_PUBLIC_TRANSPORT_IN_KM,
 IMAGE_URL)
values ('Nekkerbox', 'https://www.nekkerhalbrusselsnorth.com/organiseer/nekkerbox/',
        2500, false, true, false, true, 'Mechelen', 4,
        '/img/venue_nekkerbox.jpg');

insert into VENUE
(VENUE_NAME, LINK_MORE_INFO,
 CAPACITY, FOOD_PROVIDED, INDOOR, OUTDOOR, FREE_PARKING_AVAILABLE, CITY, DISTANCE_FROM_PUBLIC_TRANSPORT_IN_KM,
 IMAGE_URL)
values ('Lamot', 'http://lamot-mechelen.be/',
        300, true, true, true, false, 'Mechelen', 3,
        '/img/venue_lamot.jpg');

insert into VENUE
(VENUE_NAME, LINK_MORE_INFO,
 CAPACITY, FOOD_PROVIDED, INDOOR, OUTDOOR, FREE_PARKING_AVAILABLE, CITY, DISTANCE_FROM_PUBLIC_TRANSPORT_IN_KM,
 IMAGE_URL)
values ('Passade', 'https://www.passade.be/nl/feestzaal-mechelen',
        150, true, true, true, true, 'Mechelen', 2,
        '/img/venue_passade.jpg');

insert into VENUE
(VENUE_NAME, LINK_MORE_INFO,
 CAPACITY, FOOD_PROVIDED, INDOOR, OUTDOOR, FREE_PARKING_AVAILABLE, CITY, DISTANCE_FROM_PUBLIC_TRANSPORT_IN_KM,
 IMAGE_URL)
values ('Tivoli', 'https://www.kasteeltivoli.be/locatie',
        500, true, true, true, true, 'Mechelen', 8,
        '/img/venue_tivoli.jpg');

insert into VENUE
(VENUE_NAME, LINK_MORE_INFO,
 CAPACITY, FOOD_PROVIDED, INDOOR, OUTDOOR, FREE_PARKING_AVAILABLE, CITY, DISTANCE_FROM_PUBLIC_TRANSPORT_IN_KM,
 IMAGE_URL)
values ('Kruidtuin', 'https://www.mechelen.be/kruidtuin',
        500, false, false, true, false, 'Mechelen', 1,
        '/img/venue_kruidtuin.jpg');

-- noinspection SqlNoDataSourceInspectionForFile

INSERT INTO ARTIST (ARTIST_NAME, BIO, GENRE, LINK_MORE_INFO, PORTFOLIO, IMAGE_URL)
values ('Discobaar a moeder',
        'Discobaar A Moeder, een ondertussen legendarisch Antwerps fenomeen, draait al mee van in 2002. Het begon als een cafégrap van twee bevriende vinylfreaks, de grap houden ze er in, van draaien in een café genieten ze nog steeds, maar van een groots festival op z''n tijd zijn ze niet vies.',
        'Pop, Soul, Disco', 'http://www.discobaaramoeder.be/', 'Lotto Arena 6/03/2020',
        '/img/artist_disobaramoeder.jpg');

INSERT INTO ARTIST (ARTIST_NAME, BIO, GENRE, LINK_MORE_INFO, PORTFOLIO, IMAGE_URL)
values ('Radio Botanique',
        'Radio Botanique: helemaal geen radio. Eigenlijk gewoon een discobaar. Vaste Parkpop (Mechelen) dansers en swingers.',
        'voor de lol', 'https://www.facebook.com/radiobotanique/', 'bekend van Parkpop',
        '/img/artist_radiobotanique.jpg');

INSERT INTO ARTIST (ARTIST_NAME, BIO, GENRE, LINK_MORE_INFO, PORTFOLIO, IMAGE_URL)
values ('DJ Koen',
        'Als allround DJ draai ik o.a. genres als de 90s, top 40, feest- en clubmuziek. Wekelijks draai ik op o.a. studentenfeesten, bruiloften, in kroegen, clubs en meer.',
        '90s, top 40, feest- en clubmuziek', 'https://www.facebook.com/DJKoenMossink/', '',
        '/img/artist_djkoen.jpg');

INSERT INTO ARTIST (ARTIST_NAME, BIO, GENRE, LINK_MORE_INFO, PORTFOLIO, IMAGE_URL)
values ('C-Man',
        '- 2nd place MNM Start To DJ 2016 - - Versuz - - Carré - - Sunrise Festival - - Ikon (Noxx) - - La Rocca - ... His First single ''Nothing is forever'' came out on 2Dutch (A music label from the Netherlands) in the summer of 2018.',
        'deephouse, EDM', 'https://www.facebook.com/cmandj/', 'Q-hotspot 17/07/2020',
        '/img/artist_cman.jpg');

INSERT INTO ARTIST (ARTIST_NAME, BIO, GENRE, LINK_MORE_INFO, PORTFOLIO, IMAGE_URL)
values ('Robbe Roels',
        'Wie Mechelen zegt zegt Robbe Roels, waar de 20-jarige dj 3 jaar geleden begon op kleine privé feestjes en gelegenheden draait hij nu elk weekend op de grootste fuiven in zijn regio. Al blijft het daar echter niet bij, andere studentensteden zoals o.a. Leuven maar evengoed de Normandische kust zijn al getroffen door zijn prestaties.',
        'Allround, Dance, Techno', 'https://vi.be/platform/robberoels', 'Shake That Asspi 2020',
        '/img/artist_robberoels.jpg');

INSERT INTO ARTIST (ARTIST_NAME, BIO, GENRE, LINK_MORE_INFO, PORTFOLIO, IMAGE_URL)
values ('Toloko',
        'My name is Stan, also known as Toloko, the DJ who adds the right amount of loco-ness to your party! I am an upcoming DJ talent in the region of Zemst, Belgium. I started my career behind the turntables at the age of 20 at local parties. Entertaining the crowd and making people dance to my music, makes me happy. Every gig, I bring my party people a new and customized set and I introduce them to the latest tracks.',
        'house, r&b', 'https://www.toloko.be/', '',
        '/img/artist_toloko.jpg');

INSERT INTO ARTIST (ARTIST_NAME, BIO, GENRE, LINK_MORE_INFO, PORTFOLIO, IMAGE_URL)
values ('Tough Titty',
        'A Belgian Tribute to 80''s Glam and Heavy Metal',
        '', 'https://www.facebook.com/Tough-Titty-277601302444865', '',
        '/img/artist_toughtitty.jpg');

INSERT INTO ARTIST (ARTIST_NAME, BIO, GENRE, LINK_MORE_INFO, PORTFOLIO, IMAGE_URL)
values ('Kryptonight',
        'Twee kerels die er al vijf jaar van houden om het publiek uit hun dak te zien gaan! Onze missie: Het leven is een feest en daar moet gedanst worden. Hoe doen we dat? Met onze Latin-, Dancehall- en een vleugje Commercialplaten voor alle leeftijden zorgen we voor ieder wat wils.',
        'Moombahton • Dancehall • Commercial', 'https://vi.be/platform/kryptonight',
        'SOME GIG''s: Tomorrowland''s Dreamville, MnM Start to Dj Finalist Flowtrack Summer Camp Casa Blanca Festival Sunrise Festival Red ''n Blue Café Local Noxx Publik Vice Festival KdG TD ...',
        '/img/artist_kryptonight.jpg');

-- Party

INSERT INTO PARTY
(name, price_presale_in_eur, price_in_eur, extra_info, date, doors, image_url)
VALUES ('Big Spring Party', 6, 10, '1 cocktail included',
        '2025-10-10', '10:00',
        '/img/party_spring.jpg');

INSERT INTO PARTY
(name, price_presale_in_eur, price_in_eur, extra_info, date, doors, image_url)
VALUES ('Liberty 2025', null, 6, 'free vestiaire, viplounge',
        '2025-10-25', '22:00',
        '/img/party_liberty.jpg');

INSERT INTO PARTY
(name, price_presale_in_eur, price_in_eur, extra_info, date, doors, image_url)
VALUES ('Uppercuts', null, null, ' ',
        '2025-11-01', '21:00',
        '/img/party_uppercuts.jpg');

INSERT INTO PARTY
(name, price_presale_in_eur, price_in_eur, extra_info, date, doors, image_url)
VALUES ('Zoetzuur', null, null, 'Zoete house / Zure techno',
        '2025-11-08', '21:00',
        '/img/party_zoetzuur.jpg');

INSERT INTO PARTY
(name, price_presale_in_eur, price_in_eur, extra_info, date, doors, image_url)
VALUES ('Oldies but Goldies', null, null, 'afterparty@home van THE BOX!',
        '2025-10-31', '21:00',
        '/img/party_oldiesbutgoldies.jpg');

INSERT INTO PARTY
(name, price_presale_in_eur, price_in_eur, extra_info, date, doors, image_url)
VALUES ('Sapphire Soiree', 45, null,
        'JCI Mechelen bestaat 45 jaar! En dat saffieren jubileum vieren we graag in stijl met een galabal in Kasteel Tivoli. En jij kan erbij zijn!',
        '2025-11-15', '21:00',
        '/img/party_sapphiresoiree.jpg');


-- the party animal users:
-- -- 1
-- INSERT INTO ANIMAL (NAME, CITY, BIO, USERNAME)
-- VALUES ('Gillende Giraf', 'Mechelen', 'maakt altijd veel lawaai', 'giraf');
--
-- -- 2
-- INSERT INTO ANIMAL (NAME, CITY, BIO, USERNAME)
-- VALUES ('Dorstige Dromedaris', 'Leest', 'drinkt alles op', 'dromedaris');
--
-- -- 3
-- INSERT INTO ANIMAL (NAME, CITY, BIO, USERNAME)
-- VALUES ('Dansende Draak', 'Hombeek', 'de stukken vliegen ervan af', 'draak');
--
-- -- 4
-- INSERT INTO ANIMAL (NAME, CITY, BIO, USERNAME)
-- VALUES ('Zingende Zebra', 'Leest', 'denkt dat hij goed kan zingen', 'zebra');
--
-- -- 5
-- INSERT INTO ANIMAL (NAME, CITY, BIO, USERNAME)
-- VALUES ('Drinkende Das', 'Hombeek', 'stopt niet', 'das');
--
-- -- 6
-- INSERT INTO ANIMAL (NAME, CITY, BIO, USERNAME)
-- VALUES ('Zuipende Zalm', 'Rumst', 'die wil je niet op je feest', 'zalm');
--
-- -- 7
-- INSERT INTO ANIMAL (NAME, CITY, BIO, USERNAME)
-- VALUES ('Feestende Flamingo', 'Mechelen', 'jeeeee', 'flamingo');
--
-- -- 8
-- INSERT INTO ANIMAL (NAME, CITY, BIO, USERNAME)
-- VALUES ('Kotsende Kikker', 'Mechelen', 'aie aie aie', 'kikker');
--
--
-- INSERT INTO ANIMAL_PARTIES(ANIMALS_ID, PARTIES_ID)
-- values (select id from animal where username = 'giraf',
--            select id from party where name = 'Big Spring Party');
--
-- INSERT INTO ANIMAL_PARTIES(ANIMALS_ID, PARTIES_ID)
-- values (select id from animal where username = 'dromedaris',
--            select id from party where name = 'Liberty 2025');
--
-- INSERT INTO ANIMAL_PARTIES(ANIMALS_ID, PARTIES_ID)
-- values (select id from animal where username = 'dromedaris',
--            select id from party where name = 'Uppercuts');
--
-- INSERT INTO ANIMAL_PARTIES(ANIMALS_ID, PARTIES_ID)
-- values (select id from animal where username = 'dromedaris',
--            select id from party where name = 'Zoetzuur');
--
-- INSERT INTO ANIMAL_PARTIES(ANIMALS_ID, PARTIES_ID)
-- values (select id from animal where username = 'dromedaris',
--            select id from party where name = 'Oldies but Goldies');
--
-- INSERT INTO ANIMAL_PARTIES(ANIMALS_ID, PARTIES_ID)
-- values (select id from animal where username = 'draak',
--            select id from party where name = 'Big Spring Party');
--
-- INSERT INTO ANIMAL_PARTIES(ANIMALS_ID, PARTIES_ID)
-- values (select id from animal where username = 'draak',
--            select id from party where name = 'Liberty 2025');
--
-- INSERT INTO ANIMAL_PARTIES(ANIMALS_ID, PARTIES_ID)
-- values (select id from animal where username = 'zebra',
--            select id from party where name = 'Uppercuts');
--
-- INSERT INTO ANIMAL_PARTIES(ANIMALS_ID, PARTIES_ID)
-- values (select id from animal where username = 'das',
--            select id from party where name = 'Zoetzuur');
--
-- INSERT INTO ANIMAL_PARTIES(ANIMALS_ID, PARTIES_ID)
-- values (select id from animal where username = 'das',
--            select id from party where name = 'Oldies but Goldies');
--
-- INSERT INTO ANIMAL_PARTIES(ANIMALS_ID, PARTIES_ID)
-- values (select id from animal where username = 'das',
--            select id from party where name = 'Big Spring Party');
--
-- INSERT INTO ANIMAL_PARTIES(ANIMALS_ID, PARTIES_ID)
-- values (select id from animal where username = 'das',
--            select id from party where name = 'Liberty 2025');
--
-- INSERT INTO ANIMAL_PARTIES(ANIMALS_ID, PARTIES_ID)
-- values (select id from animal where username = 'zalm',
--            select id from party where name = 'Uppercuts');
--
-- INSERT INTO ANIMAL_PARTIES(ANIMALS_ID, PARTIES_ID)
-- values (select id from animal where username = 'flamingo',
--            select id from party where name = 'Zoetzuur');
--
-- INSERT INTO ANIMAL_PARTIES(ANIMALS_ID, PARTIES_ID)
-- values (select id from animal where username = 'kikker',
--            select id from party where name = 'Big Spring Party');
--
-- INSERT INTO ANIMAL_PARTIES(ANIMALS_ID, PARTIES_ID)
-- values (select id from animal where username = 'kikker',
--            select id from party where name = 'Liberty 2025');
--
-- INSERT INTO ANIMAL_PARTIES(ANIMALS_ID, PARTIES_ID)
-- values (select id from animal where username = 'kikker',
--            select id from party where name = 'Uppercuts');
--
-- INSERT INTO PARTY_ARTISTS (PARTIES_ID, ARTISTS_ID)
-- VALUES ((SELECT id FROM party WHERE name = 'Big Spring Party'),
--         (SELECT id FROM artist WHERE artist_name = 'Discobaar a moeder'));
--
-- INSERT INTO PARTY_ARTISTS (PARTIES_ID, ARTISTS_ID)
-- VALUES ((SELECT id FROM party WHERE name = 'Big Spring Party'),
--         (SELECT id FROM artist WHERE artist_name = 'Radio Botanique'));
--
-- INSERT INTO PARTY_ARTISTS (PARTIES_ID, ARTISTS_ID)
-- VALUES ((SELECT id FROM party WHERE name = 'Liberty 2025'),
--         (SELECT id FROM artist WHERE artist_name = 'Radio Botanique'));
--
-- INSERT INTO PARTY_ARTISTS (PARTIES_ID, ARTISTS_ID)
-- VALUES ((SELECT id FROM party WHERE name = 'Uppercuts'),
--         (SELECT id FROM artist WHERE artist_name = 'DJ Koen'));
--
-- INSERT INTO PARTY_ARTISTS (PARTIES_ID, ARTISTS_ID)
-- VALUES ((SELECT id FROM party WHERE name = 'Uppercuts'),
--         (SELECT id FROM artist WHERE artist_name = 'Robbe Roels'));
--
-- INSERT INTO PARTY_ARTISTS (PARTIES_ID, ARTISTS_ID)
-- VALUES ((SELECT id FROM party WHERE name = 'Zoetzuur'),
--         (SELECT id FROM artist WHERE artist_name = 'Robbe Roels'));
