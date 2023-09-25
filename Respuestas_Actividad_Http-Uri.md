Netcat# Respuestas de la Actividad HTTP - URI
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

![Captura de pantalla de 2023-09-24 20-01-17](https://github.com/miguelvega/CC3S2/assets/124398378/4fd67f30-6837-4407-bc00-59c90bf09ddc)!

## Netcat

Usamos el comando `nc -l 8081` para escuchar por el puerto 8081 desde nuestro servidor falso.

![Captura de pantalla de 2023-09-24 20-50-01](https://github.com/miguelvega/CC3S2/assets/124398378/29404048-8ae3-46ad-8ada-5abafde49d24)

### Pregunta: Suponiendo que estás ejecutando curl desde otro shell ¿qué URL tendrás que pasarle a curl para intentar acceder a tu servidor falso y por qué?

Debemos usar el siguiente URL: `curl 'http://localhost:8081/'`. <br>
Porque dado que queremos hacer una solicitud http debemos poner http, ponemos localhost, ya que el servidor es nuestra computadora local, y 8081 que hace referencia al puerto en donde se encuentra el servidor falso.

![Captura de pantalla de 2023-09-24 20-51-45](https://github.com/miguelvega/CC3S2/assets/124398378/70ce795a-fdf9-467c-86b1-a894e4202ff6)

Una vez enviada la solicitud a nuestro servidor, podemos apreciar lo diguiente.
![Captura de pantalla de 2023-09-24 20-51-57](https://github.com/miguelvega/CC3S2/assets/124398378/949e3fb3-1cff-4317-a06e-9a20a506147c)

Así es como un servidor web real percibe una conexión desde curl.<br>
En la primera linea podemos ver el método de solicitud HTTP utilizado, en este caso, GET, a continuacion el recurso que se está solicitando, en este caso, la raíz del servidor web. "HTTP/1.1" que indica la versión del protocolo HTTP utilizada. En la segunda linea se aprecia al host que es localhost al que se esta enviando la solicitud en el puerto 8081. En la tercera linea, User-Agent que es curl que es el agente de usuario que está realizando la solicitud. Finalmente, tenemos Accept como un */* que significa que el cliente está dispuesto a aceptar cualquier 
tipo de contenido en respuesta del servidor.

### Pregunta: La primera línea de la solicitud identifica qué URL desea recuperar el cliente. ¿Por qué no ves http://localhost:8081 en ninguna parte de esa línea?
Debido a que servidor falso está aceptando la solicitud desde un puerto LOCAL, por lo tanto no es necesario incluir localhost.

Entonces, hemos visto una solicitud HTTP desde el punto de vista del servidor, ahora veamos cómo se ve la respuesta desde el punto de vista del cliente  luego de presionar enter en la shell del servidor.

![Captura de pantalla de 2023-09-24 21-15-13](https://github.com/miguelvega/CC3S2/assets/124398378/6a7b7127-49d0-4e46-aacb-3ca0199d3d43)
