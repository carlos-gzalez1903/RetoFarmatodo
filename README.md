# RetoFarmatodo
Reto Técnico - Backend Farmatodo

Software Para La Ejecución:
-PostgreSQL
-Postman
-Java JDK 11
- (Opcional PG Admin)

Paso 1 Crear Base de Datos:
-En PostgreSQL bien sea desde PG Admin o desde consola crear una base de datos con el nombre rick_and_morty
-Editar credenciales de acceso en el archivo /src/main/resources/application.properties
-Cargar el esquema de la base de datos con el archivo  /static/sql/esquema.sql
-Ingresar datos para las pruebas ejecutando el archivo /static/sql/esquema.sql

Paso 2 Ejecutar el Proyecto:
-El proyecto se puede ejecutar desde el editor Intelli Jidea o Visual Studio Code si se va a realizar desde 
Intelli recuerde seleccionar el archivo build.gradle como proyecto.
-Ejecutar el proyecto desde el editor seleccionado

Paso 3 Consumo de APIs: 
El consumo de las APIs se hará desde Postman, 

URL: http://localhost:8080

-El primer ejercicio se consume desde la http://localhost:8080/rinckandmortyOne/
y espera un parámetro con el número del episodio.
    
    Método: GET
    EJEMPLO http://localhost:8080/rinckandmortyOne/28

-El Segundo ejercicio se ejecuta con la url base http://localhost:8080/[entidad]/[funcion]/
    Para la función “save” se debe emplear el Método POST

    Entidad: Las entidades hacen referencia a las tablas de la DB
        episodio
        personaje
        ubicación

    Función: Funciones que realizan buscar o ingresar información
        all: Muestra el contenido de la tabla para cada entidad correspondiente n
            Método: GET
            EJEMPLO: http://localhost:8080/personaje/all

        id/: Realiza una consulta a la DB por el id de la entidad
            Método: GET
            EJEMPLO: http://localhost:8080/personaje/id/9

        save: Realiza inserción de datos a su respectiva tabla, para realizar esta función se debe seleccionar body
            para configurar que los datos se enviaran en el cuerpo y no en la cabecera, se selecciona Raw y se cambia
            de Text a JSON 
            Método: POST

            Ejemplo: http://localhost:8080/personaje/save
            Agregar un Personaje en JSON
            {
            "nombre": "Jerry Smith",
            "especie": "Human",
            "genero": "Male",
            "idUbicacion": 1
            }

            Agregar un Episodio en JSON
            {
            "nombre": "Rick Potion #9",
            "temporadaEpisodio": "S01E06",
            "fechaEstreno": "January 27, 2014"
            }

            Agregar una Ubicación en JSON
            {
            "nombre": "Anatomy Park",
            "dimension": "Dimension C-137",
            "tipo": "Microverse"
            }

-Tercer Ejercicio: Este se consume ingresando de la siguiente manera:

    Método: GET
    EJEMPLO: http://localhost:8080/numHappy/7,13,10,20

    Donde los números separados por "," son los que se evaluaran si son o no números felices

-Cuarto Ejercicio: Esta API regresa el valor de todos los números continuos anteriores al número ingresado

    Método: GET
    EJEMPLO: http://localhost:8080/SumNum/20
