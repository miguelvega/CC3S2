# Respuestas de la Actividad HTTP - URI
Del sitio web generador de palabras aleatorias, podemos ver una imagen que se mantiene estática, mientras que la palabra ubicada debajo de la imagen se renueva tras cargar la página.

<p align="center">
  <img src="https://github.com/miguelvega/CC3S2/assets/124398378/a355cc08-a88b-4480-b420-5256ae1b6da5" alt="Imagen 1" width="50%" />
</p>

<p align="center">
  <img src="https://github.com/miguelvega/CC3S2/assets/124398378/dfaba003-c277-4b32-8065-12204c9361e7" alt="Imagen 2" width="50%" />
</p>

## Curl
Instalamos curl con el comando `sudo apt install curl` 

![Captura de pantalla de 2023-09-24 19-23-09](https://github.com/miguelvega/CC3S2/assets/124398378/6a89fca4-5bd1-41ec-afb5-42a05c976432)

Usamos el comando curl  `curl 'http://randomword.saasbook.info'`  en la terminal y nos muestra el 
siguiente codigo html.

![Captura de pantalla de 2023-09-24 19-25-04](https://github.com/miguelvega/CC3S2/assets/124398378/814ecf89-91f3-4753-8cf4-b16f6499451a)

Luego, guardamos la salida del comando anterior en  `first_test_curl.html` 


![Captura de pantalla de 2023-09-24 19-31-19](https://github.com/miguelvega/CC3S2/assets/124398378/13828e81-608e-4e0a-9dd1-4dbfa26e9244)

![Captura de pantalla de 2023-09-24 19-31-33](https://github.com/miguelvega/CC3S2/assets/124398378/2d22fd0c-c4d4-42d4-af63-7063ae9f0b6d)


### Pregunta:¿Cuáles son las dos diferencias principales que has visto anteriormente y lo que ves en un navegador web 'normal'? ¿Qué explica estas diferencias?
La primera diferencia  es que al abrir el archivo html no se puede ver la imagen, esto es porque la solicitud curl solo devuelve el contenido html como respuesta mas no devuelve otros elementos como los css o imagenes, por eso no se reconce la imagen.<br>
Otra diferencia es que al cargarlo nuevamente, la palabra no experimenta cambios.

![Captura de pantalla de 2023-09-24 20-01-17](https://github.com/miguelvega/CC3S2/assets/124398378/4fd67f30-6837-4407-bc00-59c90bf09ddc)![Captura de pantalla de 2023-09-24 20-01-17](https://github.com/miguelvega/CC3S2/assets/124398378/4fd67f30-6837-4407-bc00-59c90bf09ddc)
