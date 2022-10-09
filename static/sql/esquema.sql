-- -----------------------------------------------------
-- Table "EPISODIOS"
-- -----------------------------------------------------
CREATE TABLE EPISODIOS(
	"id_episodio" SERIAL NOT NULL,
	"nombre" VARCHAR(45) NOT NULL,
	"temporada_episodio" VARCHAR(45) NOT NULL,
	"fecha_estreno" VARCHAR(45) NOT NULL,
	PRIMARY KEY ("id_episodio"));

-- -----------------------------------------------------
-- Table "UBICACIONES"
-- -----------------------------------------------------
CREATE TABLE  UBICACIONES (
  "id_ubicacion" SERIAL NOT NULL,
  "nombre" VARCHAR(45) NOT NULL,
  "dimension" VARCHAR(45) NOT NULL,
  "tipo" VARCHAR(45) NOT NULL,
  PRIMARY KEY ("id_ubicacion"));	

-- -----------------------------------------------------
-- Table PERSONAJES
-- -----------------------------------------------------
	
CREATE TABLE PERSONAJES(
	"id_personaje" SERIAL NOT NULL,
	"nombre" VARCHAR(45) NOT NULL,
	"especie" VARCHAR(45) NOT NULL,
	"genero" VARCHAR(45) NOT NULL,
	"id_ubicacion" INT NOT NULL,
	PRIMARY KEY ("id_personaje"),
	CONSTRAINT "fk_personajes_ubicacion"
		FOREIGN KEY ("id_ubicacion")
		REFERENCES UBICACIONES ("id_ubicacion")
		ON DELETE NO ACTION
    	ON UPDATE NO ACTION);

-- -----------------------------------------------------
-- Table EPISODIOS
-- -----------------------------------------------------
	
CREATE TABLE EPISODIOS_PERSONAJES(
	"id_episodio" INT NOT NULL,
  	"id_personaje" INT NOT NULL,
  
  	PRIMARY KEY ("id_episodio", "id_personaje"),
  	CONSTRAINT "fk_EPISODIOS_PERSONAJES_PERSONAJES1"
    	FOREIGN KEY ("id_personaje")
    	REFERENCES PERSONAJES ("id_personaje")
    	ON DELETE NO ACTION
    	ON UPDATE NO ACTION,
  	CONSTRAINT "fk_EPISODIOS_PERSONAJES_EPISODIOS1"
    	FOREIGN KEY ("id_episodio")
    	REFERENCES EPISODIOS ("id_episodio")
    	ON DELETE NO ACTION
    	ON UPDATE NO ACTION); 
