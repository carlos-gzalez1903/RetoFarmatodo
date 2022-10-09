-- EPISODIOS
INSERT INTO episodios VALUES (1, 'Pilot', 'S01E01', 'December 2, 2013');
INSERT INTO episodios VALUES (2, 'Lawnmower Dog', 'S01E02', 'December 9, 2013');
INSERT INTO episodios VALUES (3, 'Anatomy Park', 'S01E03', 'December 16, 2013');
INSERT INTO episodios VALUES (4, 'M. Night Shaym-Aliens!', 'S01E04', 'January 13, 2014');
INSERT INTO episodios VALUES (5, 'Meeseeks and Destroy', 'S01E05', 'January 20, 2014');

-- UBICACIONES
INSERT INTO ubicaciones VALUES (1, 'Earth (C-137)', 'Dimension C-137', 'Planet');
INSERT INTO ubicaciones VALUES (2, 'Abadango', 'unknown', 'Cluster');
INSERT INTO ubicaciones VALUES (3, 'Citadel of Ricks', 'unknown', 'Space station');
INSERT INTO ubicaciones VALUES (4, 'Earth (Replacement Dimension)', 'Replacement Dimension', 'Planet');

-- PERSONAJES
INSERT INTO personajes VALUES (1, 'Rick Sanchez', 'Human', 'Male', 1);
INSERT INTO personajes VALUES (2, 'Morty Smith', 'Human', 'Male', 3);
INSERT INTO personajes VALUES (3, 'Summer Smith', 'Human', 'Female', 4);
INSERT INTO personajes VALUES (4, 'Beth Smith', 'Human', 'Female', 4);

-- EPISODIOS_PERSONAJES
INSERT INTO episodios_personajes VALUES (1,1);
INSERT INTO episodios_personajes VALUES (1,2);
INSERT INTO episodios_personajes VALUES (2,1);
INSERT INTO episodios_personajes VALUES (2,2);
