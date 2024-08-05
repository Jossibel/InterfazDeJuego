# InterfazDeJuego
# Codigos se encuentran en la carpetan de (src)

![image](https://github.com/user-attachments/assets/24b9fd9a-c36e-43fb-915e-ecf61100544f)
Al ingresar a la pagina se debe seleccionar esta carpeta 

   ![image](https://github.com/user-attachments/assets/4669511e-b465-48c6-b8f4-50d9ea56e05a)
 Al ingresar a la carpeta se veran los archivos de cada codigo utilizado 

 ![image](https://github.com/user-attachments/assets/6e6af9f8-40c6-4d01-b1a8-06ecb86996c2)


# PAC MAN

![image](https://github.com/user-attachments/assets/dd95ecd9-b608-4642-abd7-669345c64dda)

# Descripcion:
El juego que hemos relizado es Pac-Man el cual es un juego de acción de laberintos el mismo que fue desarrollado e implusado por Namco en 1980. El juego trata de que el jugador controla a Pac-Man, el cual que debe comerse todos los puntos dentro de un laberinto cerrado mientras evita a fantasmas de colores. Al comer los puntos grandes llamados "Super Pildoras", los fantasmas se vuelven de otro color, lo que permite a Pac-Man comérselos para conseguir puntos extra.

# Diagrama de Clases
![image](https://github.com/user-attachments/assets/2b76ab59-0c6f-4eaf-bdb5-85efa07bdc5e)

# Clases en el Código
* Clase GuardarCargar
- Se encuentra al inicio del archivo
- Maneja la subsistencia de datos en cuanto a la lectura y escritura de la puntuación en un archivo.
  
![image](https://github.com/user-attachments/assets/f887d6d0-faab-4a35-95e1-30956cc6fce3)


* Clase HiloCuentaAtras
- Se encuentra después de GuardarCargar, el segundo archivo.
- Implementa un temporizador que hace que los fantasmas sean vulnerables después de un determinado de tiempo.

![image](https://github.com/user-attachments/assets/157aac65-5424-4f6e-9ceb-d51e03ffb5da)

* Clase HiloPersonaje
- Se encuentra después de HiloCuentaAtras, es decir el tercer archivo.
- Controla el comportamiento de los personajes en el juego, como es PacMan y los fantasmas.

![image](https://github.com/user-attachments/assets/7a52b0bf-03b0-4438-a9a7-7e8f01f70e0a)

* Clase HiloReset
- Se encuentra como cuarto archivo del paquete pacman.
- Se encarga de reiniciar el juego cuando todos los hilos de los personajes hayan acabado.
  
![image](https://github.com/user-attachments/assets/d5eacb14-34d4-4937-8b28-7977e33cb197)

* Clase Juego
- Se encuentra como penultimo archivo.
- Es la clase principal que maneja la lógica del juego de PacMan, tiene el control de guardado, puntos, estado del juego, velocidad de    los personajes, elementos del tablero, entre mas.

![image](https://github.com/user-attachments/assets/dd906172-8454-4f08-8f40-6afc3d3baf26)

* Clase PantallaBienvenida
  - Es el ultimo archivo dentro del paquete pacman.
  - Muestra la pantalla de bienvenida que se extiende JFrame, por lo que se abre como una ventana de aplicación gráfica y muestra un          panel con un título, una imagen de portada y tres botones: "Jugar", "Integrantes" y "Fin del juego".
    
![image](https://github.com/user-attachments/assets/837d17d5-24d2-4ed2-86fb-b4025571a2e0)

* En el respositorio los archivos se encuentran en la capeta de "src", donde dentro de ella se encuentran dos carpetas mas en las cuales dentro de la primera  se encuentran las clases principales del juego

![image](https://github.com/user-attachments/assets/82400b1f-5037-40a3-9ffe-37d5c82ecc05)

![image](https://github.com/user-attachments/assets/e94069ba-d9fd-4ba8-bd5c-59ed69c6fcf1)

Y en la segunda carpeta (recursos) se encuentra las imagenes que se uso para el desarrollo del juego.

![image](https://github.com/user-attachments/assets/2968d764-9879-4b23-9d0f-2aac41c5f475)
    
# Ejecucion
* Este juego fue desarrollado en el IDE NetBeans
1. Clonamos el repositorio u otra opcion es descargar el archico .zip
https://github.com/Jossibel/InterfazDeJuego.git

![image](https://github.com/user-attachments/assets/c4c9cecf-ad38-4143-8832-8b028d8c862c)

3. Una vez clonado abrimos el IDE de NetBeans, abrimos en la pestama de "File" y selecionamos "Abrir Proyecto"
   
   ![image](https://github.com/user-attachments/assets/f9e1124e-9c0f-4e05-b64f-264a5c5db2e4)

   Y selecionamos el archivo en donde lo hayamos clonado

   ![image](https://github.com/user-attachments/assets/d2b49248-0a2f-4675-b727-452f2704f0b5)

   Una vez abierto damos clic Pacman y se deslizaran dos carpetas, de las cuales seleccionamos la primer carpeta
   
   ![image](https://github.com/user-attachments/assets/7560966f-d7b9-43fa-bfa0-7acef45f7dec)

   En esta carpeta se encuentran dos paquetes en el cual paar la ejecucion abrimos el primer paquete "pacman" y se abriran mas archivos      de los cuales selecionamos "Pantallabienvenida.java".
   
   ![image](https://github.com/user-attachments/assets/257013a6-3814-452d-97f7-bce97c0635b0)
   
4. Ejecutamos el archivo
   
   ![image](https://github.com/user-attachments/assets/e57ad1ec-70cb-46c4-aeb7-791f0af27a29)

   Posteriormente se abrira la siguiente pestaña

   ![image](https://github.com/user-attachments/assets/521f22de-5d65-408a-973c-43430f652e8a)

   Finalmente podemos comenzar a jugar

   ![image](https://github.com/user-attachments/assets/c25c149c-2b97-436c-84f5-1cce4e4cac3b)


  * Iniciar el juego:

   ◆ Al hacer clic en el botón "Jugar", se crea una nueva instancia de la clase Juego y se cierra la pantalla de bienvenida.

   ![image](https://github.com/user-attachments/assets/a9dbbfbd-9ca9-4da5-bf61-44739d36735d)

 * Mostar Informacion
    
   ◆ Al hacer clic en el botón "Integrantes", se muestra un cuadro de diálogo con información sobre los creadores del juego, usando 
     JOptionPane.

   ![image](https://github.com/user-attachments/assets/a9038861-033b-4a7e-822c-ebfbc4cc041c)

   ![image](https://github.com/user-attachments/assets/ed53c6b5-7e5c-47b5-9cd9-611f70f1328b)

 * Salir del juego:
   
   ◆ Al hacer clic en el botón "Fin del juego", la aplicación se cierra mediante System.exit(0).

   ![image](https://github.com/user-attachments/assets/030a049f-0da6-466c-944c-ef16cdb54b31)

La puntuación máxima se muestra en la parte superior y puede restablecerse a -1 cuando se hace clic en ella y se confirma la acción.
   
   


   
