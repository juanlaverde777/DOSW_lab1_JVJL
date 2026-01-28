# \#Laboratorio 1 Maratón Git 2026-1



# Integrantes

# -Juan Manuel Villegas Medina 

# -Juan Jose Laverde Rios 

# Antes de iniciar
<img width="290" height="282" alt="image" src="https://github.com/user-attachments/assets/ec860f59-d99d-4a63-94e8-1a28d24b2469" />
<img width="951" height="422" alt="image" src="https://github.com/user-attachments/assets/feb1da7f-c728-4e6f-8ba9-c1cd68a05802" />

Para dar desarrollo a este Laboratorio antes crearemos un github con el repositorio del laboratorio, en este estaremos como integrantes los dos estudiantes y la profesora encargada. una vez creado el repositorio creamos un main un develop y 2 ramas con la estructura de feature/ApellidoNombre_2026-1, en estas ultimas una sera donde agregaremos este readme que desarrolla el proceso trabajado en el laboratorio y en la otra generaremos una estructura de caroetas de la forma en que existira una carpeta llamada laboratorio la cual contiene sub carpetas con el nombre de cada uno de los retos la cual nos permitira observar y trabajar de manera ordenada este laboratorio 

# Retos completados

# Reto 1 La Bienvenida 
Para este reto vamos a crear una expresion lambda entre los dos miembros del equipo, esta nos permitira imprimir un saludo nde bienbenida con nuestros nombres, edad, semestre, y correo institucional, para esto usaremos las herramientas de stream(), map(), y collect()

<img width="814" height="798" alt="image" src="https://github.com/user-attachments/assets/fcb1a002-8a96-4c40-9365-42dbb9309eee" />


En este programa lo que hicimos fue crear un mensaje de bienvenida usando programación funcional y expresiones como mencionamos arriba una lambda. Primero importamos List y Collectors para poder trabajar con listas y streams. En el método main creamos una lista inmutable de objetos Estudiante, donde cada estudiante tiene nombre, edad, semestre y correo. Esta lista representa la información con la que vamos a trabajar y es la que se le pasa al mensaje de bienvenida para generar el texto final.

Luego definimos una interfaz funcional llamada MensajeBienvenida, que tiene un solo método generar, lo que nos permite implementarla fácilmente con una expresión lambda. En esa lambda usamos stream() sobre la lista de estudiantes para extraer únicamente los nombres (map(e -> e.nombre)) y unirlos en una sola cadena usando Collectors.joining(" y "). Finalmente, imprimimos el resultado en consola llamando al método generar, lo que produce un mensaje personalizado como “Hola, bienvenidos! Juan Manuel Villegas y Juan Jose Laverde”. Con esto demostramos cómo combinar clases, interfaces funcionales y streams para escribir un código más claro y moderno.



