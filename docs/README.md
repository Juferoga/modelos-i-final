# Monopoly

## Juego de monopolio

Para iniciar el juego de monopolio, se tienen que instalar previamente java. Ya que por motivos prácticos para ser multiplataforma aplicamos el el paradigma de mantener el mismo con el codigo fuente, para respaldar las libertades del software libre con las cuales desarrollamos el proyecto. 

### instalando java

#### Windows

Para instalar java dentro del sistema operativo windows te recomendamos utilizar l siguiente [guia](https://github.com/islaterm/software-design-book-es/wiki/JDK-en-Windows)

#### Linux - debian y derivadas

Para instalar en debian utilizar el comando

``
$ sudo apt-get install openjdk16-jdk openjdk16-jre
``

## Primeros pasos 

Para descargar y utilizar el juego hacemos uso de [github](https://github.com/Juferoga/modelos-i-final) para alojar el código 

![github](https://raw.githubusercontent.com/Juferoga/modelos-i-final/main/docs/images/github.png?token=AKG44KMJUBNUFOBJSSGG7ADBNB5Z6)

## Corriendo el programa

Para correr el programa utilizamos la plataforma de desarrollo netbeans aunque también utilizamos Visual Studio code, para esto lo que tenemos que realizar es abrir el proyecto desde una de estas dos plataformas y correr el programa.

![VS code](https://raw.githubusercontent.com/Juferoga/modelos-i-final/main/docs/images/visual-studio-code.svg)
![Netbeans](https://raw.githubusercontent.com/Juferoga/modelos-i-final/main/docs/images/netbeans.svg)


# Manual de Usuario

## Iniciando el programa

Cuando el programa inicia podemos ver el una pantalla de bienvenida por parte del mismo, el cual nos indicará que todos los componentes dentro del aplicativo estan siendo cargados por el sistema.

![Splash Screen Image](https://raw.githubusercontent.com/Juferoga/modelos-i-final/main/docs/images/splash.jpg)

## En el Juego

![Tablero y partes](https://raw.githubusercontent.com/Juferoga/modelos-i-final/main/docs/images/tablero_1.png)

En está sección podemos ver el funcionamiento o las propiedades intrinsecas dentro del tablero, de las cuales podemos destacar las que se encuentran numeradas dentro del mismo, en este caso:

1. El botón lanzar el cual permite realizar el lanzamiento de los dados para realizar el movimiento de la ficha.

2. La sección de jugadores nos permite reconocer cuales son los jugadores actuales y su saldo 

3. Sección turnos, es aquella que nos permite identificar de quien es el turno actual y los dados lanzados, también determinar si el jugador obtuvo dentro del lanzamiento numeros iguales para repetir su turno.

4. Tablero global dentro del tablero podemos ver las diferentes propiedades con una vista general, algunas posiciones y aspectos del tablero, como lo son las fichas dentro del tablero.

![Tablero y partes](https://raw.githubusercontent.com/Juferoga/modelos-i-final/main/docs/images/tablero_3.png)

Dentro de esta interfaz podemos conocer si nuestro lanzamiento fue par y repetir el mismo, con la finalidad de manejar o controlar esta caracteristica del juego.

![Tablero y partes](https://raw.githubusercontent.com/Juferoga/modelos-i-final/main/docs/images/carcel.jpg)

En esta última interfaz el juego nos dice que debemos ir a la carcel despues de cierto acto.

## Descripción de la propiedad

![Vista propiedad](https://raw.githubusercontent.com/Juferoga/modelos-i-final/main/docs/images/tablero_2.png)

Dentro de la vista propiedad se encontrarán algunas de las caracteristicas fundamentales que posee la misma, como lo son por ejemplo:

- Nombre: El cual es el identificador de la propiedad y permite al usuario conocer que propiedad está comprando.  

- Precio: El cual es el precio que se le va a cobrar al jugador por a propiedad, permite tambien presupuestar si la compra es adecuada.

# Manual Técnico

## Diagrama de clases general

En este apartado se destacará el porque se utilizaron los diferentes patrones de programación necesarios para la construcción de la aplicación en general la aplicación es constituida por las siguientes clases:

![Diagrama de Clases general](https://raw.githubusercontent.com/Juferoga/modelos-i-final/main/diagramas/Diagrama_de_clases_general.png)

Podemos ver dentro del diagrama la utilización de algunos de los patrones de diseño tanto de comportamiento, estructura y creacionales durante el desarrollo del proyecto, los cuales serán definidos a continuación, teniendo en cuenta una pequeña descripción del patron y el porque fue utilizado dentro del programa realizado.

## Patron command

Command es un patrón de diseño de comportamiento que convierte solicitudes u operaciones simples en objetos.

![Diagrama de Clases Patron Command](https://raw.githubusercontent.com/Juferoga/modelos-i-final/main/diagramas/Diagrama_de_clases_command.png)

En el programa Monopoly lo utilizamos para convertir las solicitudes de comprar y embargar propiedades, aplicamos la utilización de este ya que cumplia con el requerimiento de realizar cierta operación, unicamente llamando a la orden para realizar la petición mandada la cual en este caso fue la realización de comprar un de las propiedades que tiene el usuario y embargar la propiedad permitiendo al usuario conseguir dinero por la propiedad. 

## Patron Factory Method (Propiedades)

Factory Method es un patrón de diseño creacional que proporciona una interfaz para crear objetos en una superclase, mientras permite a las subclases alterar el tipo de objetos que se crearán.

![Diagrama de Clases Patron Factory Method](https://raw.githubusercontent.com/Juferoga/modelos-i-final/main/diagramas/Diagrama_de_clases_FactoryPropiedades.png)

En el programa Monopoly la utilizamos para crear una fabrica de propiedades, propiedades las cuales son todas y cada una de las tarjetas adquiribles por el usuario final, en donde lo que las diferenciaba era el color de la propiedad, se decidio agruparlo por conjuntos de color ya que nos permitia como programadores verificar el uso de una forma intuitiva del patron utilizado y apropiarnos del uso del mismo.
 
## Patron Factory Method (Servicios)

Un patrón de fábrica o un patrón de método de fábrica dice que simplemente defina una interfaz o clase abstracta para crear un objeto, pero permita que las subclases decidan qué clase ejemplificar. En otras palabras, las subclases son responsables de crear la ejemplificación de la clase.

El patrón de método de fábrica también se conoce como constructor virtual, que permite crear objetos tal cual como una fabrica lo realizaria dentro del mundo real.

![Diagrama de Clases Patron Factory Method](https://raw.githubusercontent.com/Juferoga/modelos-i-final/main/diagramas/Diagrama_de_clases_FactoryServicios.png)

Lo utilizamos  en el juego Monopoly para crear una fabrica de servicios como lo serias el agua y la luz , esto compone la creacion del tablero del juego monopoly

## Patron Flyweight

Flyweight es un patrón de diseño estructural que te permite mantener más objetos dentro de la cantidad disponible de RAM compartiendo las partes comunes del estado entre varios objetos en lugar de mantener toda la información en cada objeto, una de las ventajas principales para hacer uso de este patron era la posibilidad de crear una inmensa cantidad de objetos en la cual solo variaran su estado de forma controlada.

![Diagrama de Clases Patron Flyweight](https://raw.githubusercontent.com/Juferoga/modelos-i-final/main/diagramas/Diagrama_de_clases_flyweight.png)

En el programa Monopoly lo utilizamos para la creacion de las "cartas de la suerte", en la cual se repite cuatro veces dentro del tablero siendo exactamente el mismo objeto con su mismo comportamiento, por esta razón utilizamos este patron porque al crear solo  un objeto de esta clase  se puede hacer referencia al objeto generando un menor uso de recursos por parte del programa y logrando optimizar el mismo.     
## Patron Prototype

Prototype es un patrón de diseño creacional que nos permite copiar objetos existentes sin que el código dependa de sus clases, uno de los patrones en cuales vimos bastante aplicabilidad a través del desarrollo del juego, observamos también que por su facilidad es uno de los patrones más simples y por los cuales dentro de nuestro desarrollo decidimos adoptar.

![Diagrama de Clases Patron Prototype](https://raw.githubusercontent.com/Juferoga/modelos-i-final/main/diagramas/Diagrama_de_clases_prototype.png)

En el programa Monopoly utilizamos este patron para la creacion de los "transmilenios", su principal caracteristica es que al crear un objeto de este tipo podemos clonar este objeto usando un copia profunda, en el que el clon es un objeto individual evitando utilizar el constructor de la clase inicial optimizando el uso y recursos utilizados por el programa.
