# java-proyecto-final-julian-alegre-26223
Proyecto Final - Backend Java - Comision 26223
Video Link: https://youtu.be/gYPQt8au82M
Alumno: Alegre Rojas, Julian Juan Ignacio

Tecnologias utilizadas:
-------------------------
- Java 17: Lenguaje utilizado
- Spring Boot: Framework para desarrollo
- Maven: Gestion de Dependencias
- Spring Web: Desarrollo de APis REST
- Spring Data JPA: Acceso y persistencia de datos
- Hibernate: Mapeo objeto-relacional (ORM)
- MySQL: Base de Datos Relacional
- Postman: Pruebas de la API
- Visual Studio Code: IDE de desarrollo

Requisitos para ejecutar la aplicacion:
----------------------------------------
- Tener MySQL instalado, y tener creada la base articulos_db vacia

Instruccion de configuracion de MySQL:
---------------------------------------
- Se instala con el paquete Xampp, con los valores por defecto de usuario y contraseña
- En pom.xml debemos tener las dependencias de MySQL y JPA
- En application.properties debemos tener los parametros de datasource para que pueda buscar la base de datos MySQL y configurar el username y password de la base. Se podria poner esos datos en unas variables de entorno, para que no queden expuestas en el repositorio

Instrucciones de ejecucion
---------------------------
- Cuando se quiere ejecutar el proyecto debera estar levantado el servicio de MySQL, que con el panel de Xampp lo podemos iniciar.

Listado de endpoints disponibles
---------------------------------
- URL Principal: http://localhost:8080
- Listar articulos: GET /api/articulos
- Obtener articulo por ID: GET /api/articulos/{ID}
- Crear Articulo: POST /api/articulos
- Actualizar Articulo: PUT /api/articulos/{ID}
- Eliminar Articulo: DELETE /api/articulos/{ID}

Video Link: https://youtu.be/gYPQt8au82M


Aclaraciones:
En el archivo application.properties, el parametro spring.jpa.properties.hibernate.dialect, lo suprimi porque si no, no me corria el proyecto, porque generaba un conflicto de versiones