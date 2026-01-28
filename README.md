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

# Reto 2 Carrera en Paralelo 
Para este reto iniciamos como en el anterior creando las nuevas 2 ramas como se pide de feature/ApellidoNombre_2026-1, dentro de cada una de esas seguimos las instrucciones y creamos las subramas con la estructura feature/reto_carril_uno_ApellidoNombre1_2026-1
<img width="896" height="178" alt="image" src="https://github.com/user-attachments/assets/a04d9727-0660-4a63-bf31-f1f0cf4667f3" />
<img width="823" height="66" alt="image" src="https://github.com/user-attachments/assets/5d365d36-5cbd-43ae-abce-50ecc72e5a6e" />
<img width="712" height="52" alt="image" src="https://github.com/user-attachments/assets/a4d18f27-5dad-48a2-9659-f87705b7ee89" />
 Una vez hacemos esto el estudiante A ( juan jose Laverde) arranca cambiando el nombre del archivo de reto 2 a carreraparalela.java asi dejando listo el punto de partida
 <img width="876" height="451" alt="image" src="https://github.com/user-attachments/assets/6e7227b3-6dd4-44f0-a329-e904da2cb18e" />

Despues de esto el estudiante B arranca actualizando su carril rama carril 1 cpm ñps cambios subidos en el feature del reto, despues este crea una expresion lambda que genera una funcion que nos permire genear el calculo del numero mas grande de un listado de numeros ingresados
<img width="737" height="652" alt="image" src="https://github.com/user-attachments/assets/a950333c-9642-48e5-a25c-5b0094e11523" />
despues el estudiante A (juan jose laverde) arranca actualiazado su carril con los cambios subidos por el estudiante b. una vez realizado este el estudiante crea una expresion lambda para generar una funcion que nos permite calcular el numero mas pequeño de un listado de numeros ingresados y obtener una cantidad de datos como un numero 
<img width="682" height="546" alt="image" src="https://github.com/user-attachments/assets/b872f904-042e-4b17-85ea-83078971eaa5" />
<img width="617" height="189" alt="image" src="https://github.com/user-attachments/assets/6986a9f0-a3ff-4c74-9bee-0aab503397a0" />
 En el primer choque se puede observar al ambos tener la funcion procesar datos pero con diferente implemntacion se genera el siguiente cionflicto
 <img width="840" height="855" alt="image" src="https://github.com/user-attachments/assets/1bb8a7ae-102c-4104-8b04-24318fe4cbb6" />
 Al hacer merge de forma correcta el codigo quedaria de la siguiente forma 
 <img width="750" height="751" alt="image" src="https://github.com/user-attachments/assets/b5d7e276-07c8-4638-9918-653e29663286" />
se agrega el codigo para verificacion si es impar en el caso de estudiante a y si es par en caso de estudiante b 
<img width="793" height="845" alt="image" src="https://github.com/user-attachments/assets/ee31d191-d95b-4456-a25e-f5acc047513a" />
<img width="745" height="268" alt="image" src="https://github.com/user-attachments/assets/591bcde2-010c-41b3-a87a-6af98cad0b2e" />
<img width="695" height="150" alt="image" src="https://github.com/user-attachments/assets/93d64233-a31a-4935-a558-38354905da1e" />
<img width="776" height="782" alt="image" src="https://github.com/user-attachments/assets/4cdc085d-2937-46d4-a5fc-57a333fc8063" />
Llegamos a la final del reto 2 y solucionamos todo
<img width="931" height="912" alt="image" src="https://github.com/user-attachments/assets/221d8f5b-94ea-4569-8578-e49bc75c252b" />
<img width="842" height="373" alt="image" src="https://github.com/user-attachments/assets/c713cc7b-8633-4b6d-a1ad-829b74c163a2" />
<img width="739" height="208" alt="image" src="https://github.com/user-attachments/assets/bb016fa0-f635-485f-aac0-32f80e823609" />
Se deja la documentacion de los commits 
<img width="1534" height="627" alt="image" src="https://github.com/user-attachments/assets/1654283a-61ec-4d14-9c03-6301d5b09a2d" />




 




