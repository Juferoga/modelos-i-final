---
layout: page
title: Manual-Tecnico
---

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