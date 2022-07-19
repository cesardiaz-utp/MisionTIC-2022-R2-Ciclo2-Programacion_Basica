# Ejercicio JDBC

Este ejercicio se basa en las tablas para libros, existencias y operaciones de venta. El objetivo es desarrollar un programa de línea de comandos que sea capaz de realizar las siguientes operaciones:
- Imprimir en salida estándar los datos de un libro dado su ISBN.
- Imprimir en salida estándar los datos de todos los libros.
- Consultar el número de unidades en stock de un libro, dado su ISBN.
- Realizar una transacción de venta de un libro, dados su ISBN y el número de unidades a vender.

Se proporciona un [esqueleto de la aplicación](https://github.com/cesardiaz-utp/MisionTIC2022-Ciclo2-Unidad4-bookshop.git), con las siguientes clases
- [DBManager](https://github.com/cesardiaz-utp/MisionTIC2022-Ciclo2-Unidad4-bookshop/blob/main/src/main/java/co/edu/utp/misiontic2022/c2/cdiaz/bookshop/DBManager.java)
- [BookShop](https://github.com/cesardiaz-utp/MisionTIC2022-Ciclo2-Unidad4-bookshop/blob/main/src/main/java/co/edu/utp/misiontic2022/c2/cdiaz/bookshop/BookShop.java)
- [Book](https://github.com/cesardiaz-utp/MisionTIC2022-Ciclo2-Unidad4-bookshop/blob/main/src/main/java/co/edu/utp/misiontic2022/c2/cdiaz/bookshop/Book.java)

La clase **BookShop** está ya programada, y contiene diferentes métodos para la gestión en consola que permite ejecutar las operaciones.

Estos métodos invocan a los métodos de la clase **DBManager** que se deben programar en este ejercicio.  

La clase **Book** también está programada, y se usa para encapsular los datos acerca de un libro.

Necesitarás configurar el driver de JDBC de SQLite para que la máquina virtual sea capaz de encontrar este driver cuando intentes conectarte a la base de datos.

## Instrucciones:

1. Crea una nueva base de datos llamada **BookShop.db**
2. Crea las tablas que necesites para representar los libros en el catálogo de una librería.
3. Para cada libro, almacena el título, ISBN y año de publicación.
4. Crea una tabla aparte que almacene las unidades que tiene la librería en existencias de cada libro
5. Crea otra tabla en que se almacenen las operaciones de venta (fecha y hora, libro vendido, y número de unidades vendidas).
6. Implementa el método connect() de la clase DBManager para que establezca una conexión con la base de datos y guarde dicha conexión en el atributo connection.
7. Implementa el método searchBook de la clase DBManager para que devuelva el libro cuyo ISBN se le indique.
8. Implementa el método listBooks de la clase DBManager para que devuelva un objeto List con los datos de todos los libros de la tabla de libros.
9. Implementa el método getStock(int id) de la clase DBManager para que devuelva las existencias del libro cuyo identificador reciba.
10. Implementa el método sellBook(int id, int units) de la clase DBManager para que ejecute como transacción los pasos necesarios para vender un libro: anotación de la venta, comprobación de existencias y actualización de existencias. Haz lo que sea necesario para que las transacciones funcionen de forma consistente.