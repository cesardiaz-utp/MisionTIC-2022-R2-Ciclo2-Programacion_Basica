# Ejercicios de Modelado de Clases UML
En este ejercicio la idea es que intenten realizar el modelo de clases para cada uno de los ejercicios planteados

## Herramienta para crear diagramas de clases
- [PlantUML](https://plantuml.com/es/)
  - Sintaxis - [Diagrama de Clases](https://plantuml.com/es/class-diagram)
  - [Video explicativo](https://www.youtube.com/watch?v=qxVKpKYPKUk)
- [Diagram.Net](https://app.diagrams.net/)
  - [Video explicativo](https://www.youtube.com/watch?v=g_blFs7qLtM)
- [LucidChart](https://www.lucidchart.com/pages/es/landing)
  - [Video explicativo](https://www.youtube.com/watch?v=Z0yLerU0g-Q) 

## Ejercicio 1: Matrimonio civil
- De cada matrimonio se almacena la fecha, el lugar de la celebración y los datos personales (nombre, apellidos, edad, sexo y domicilio) de los contrayentes.
- Igualmente se guardan los datos personales de los dos testigos y de la autoridad civil (juez o autoridad municipal) que formaliza el acto.

### Soluciones propuestas
- [Propuesta 1](https://www.plantuml.com/plantuml/umla/TOozIaH134RxF4NOSk4kQccrbXQ2u1DaPy8Qd4cM90F-uBjx6LYyXNPdvZivnqZo7Br1l8bUoAbZQHJnaEbo6icFnVH5FXbl0EQ2JxHEtLJi-lFC7gQ4Nu2ue5e_EK-a2xScrMA-k5AT4Fnk4weLwTB4u1lWjulxnUNycWlkRdVN-ZtII7DP8t-hTnkrcARJ1sjo_1C-7FQRWzLBELi075dhwEq7)
- [Propuesta 2](https://www.plantuml.com/plantuml/umla/TOz1ImCn48Nl-HN37Wkxg3z0kXGFArOAjXTlqyrG1vEP9Pb0LVpljWlhAjPJNl9U7jzRPiDa9GQNNra6J1YX3vXpQvPuNuowNkM9tmckd1iTMEF9YYgiqyk6KbP1-700DOZ6VQ9Hua0XiDSytiYZ7qMceux2Qy-H0wlxdBgsb8qF2dGq4l_TFTah5KluHcBqNwGjfeaz-hy1aX9XouFEcJFp_Uxk-NIiTu_Tgjkq3sUQUIKiwZBKK5rNS_K5-wRw2NVfVzCigccVcmcQn8SNQsv_WxabYIynV040)

## Ejercicio 2: Viajes
- La compañía oferta una serie de vuelos para unas fechas concretas y con un número de plazas.
- La compañía dispone de una flota de aviones con una capacidad queda soporte a los vuelos ofertados.
- Las personas compran billetes para los vuelos que le interesan. Para emitir el billete es necesario conocer el nombre, apellidos y edad del pasajero.
- Los billetes identifican el número de asiento que ocupan.
- Todo vuelo tiene una ciudad y aeropuerto de origen y de destino.
- Los pasajeros también pueden facturar bultos. El precio varía según su peso.
- Los aviones tienen una capacidad de almacenamiento (peso) máxima permitida.

## Ejercicio 3: Hipoteca
- Las personas compran casas y se convierten en propietarios.
- Para pagarlas es habitual que el propietario formalice un préstamo hipotecario con una entidad bancaria. El banco toma la casa en forma de aval en caso de impago de las mensualidades. En el caso de que el capital fiado supera el valor de tasación de la casa y el sueldo del propietario no es suficiente, el banco suele exigir la presencia de un avalista.
- Para formalizar la hipoteca se necesitan los datos personales del propietario, además de su dni y número de la seguridad social, y de la casa, su dirección.
- El capital de la hipoteca se ajusta teniendo en cuenta el valor de tasación de la casa.
- Toda hipoteca se formaliza detallando el capital, el interés (%) y la duración (fecha de inicio y fecha de fin).
- A partir de estos datos se calcula el importe de cada mensualidad.

## Ejercicio 4: Asociación
Diseñe un diagrama de clases que modele el proceso de **dar de alta a cada una de las personas que se apuntan a una asociación**.
- De cada persona interesa saber sus datos básicos: NIF, nombre completo y fecha de nacimiento. 
- Cuando cada nuevo socio se da de alta, se le asigna un código de asociado alfanumérico y se anota la fecha de alta.
- Las fechas están compuestas de tres campos (día, mes y año) de tipo entero. 
- El Nif se compone de un campo de tipo entero llamado dni y un campo de tipo carácter llamado letra.

## Ejercicio 5: Torneo
Diseñe un diagrama de clases que modele la estructura necesaria para manejar los datos de los encuentros de un torneo de tenis de mesa en la modalidad de sorteo y eliminatoria.
- Del torneo interesa conocer la fecha del torneo, los encuentros celebrados y el ganador.
- De cada jugador, que debe de conocer perfectamente las reglas, interesa saber el número de federado de la federación de la que es miembro.
- De cada persona interesa saber sus datos básicos: NIF, nombre completo y fecha de nacimiento. 
- Las fechas están compuestas de tres campos (día, mes y año) de tipo entero. 
- El Nif se compone de un campo de tipo entero llamado dni y un campo de tipo carácter llamado letra.
- De cada encuentro interesa conocer los oponentes, el ganador y el resultado final del marcador de cada una de las tres partidas que se juegan a 21 puntos.

## Ejercicio 6: Alquiler de automóviles
Se desea diseñar un diagrama de clases sobre la información de las reservas de una empresa dedicada al alquiler de automóviles, teniendo en cuenta que: 
- Un determinado cliente puede tener en un momento dado hechas varias reservas.
- De cada cliente se desean almacenar su DNI, nombre, dirección y teléfono. Además dos clientes se diferencian por un código único. 
- Cada cliente puede ser avalado por otro cliente de la empresa. 
- Una reserva la realiza un único cliente pero puede involucrar varios coches. 
- Es importante registrar la fecha de inicio y final de la reserva, el precio del alquiler de cada uno de los coches, los litros de gasolina en el depósito en el momento de realizar la reserva, el precio total de la reserva y un indicador de si el coche o los coches han sido entregados. 
- Todo coche tiene siempre asignado un determinado garaje que no puede cambiar. De cada coche se requiere la matricula, el modelo el color y la marca. 
- Cada reserva se realiza en una determinada agencia.

## Ejercicio 7: Zoológico
Un zoológico necesita una aplicación informática para llevar su organización respecto a las especies que posee, los empleados (cuidadores y guías), y los distintos itinerarios de visita que ofrece. La información está estructurada de la siguiente manera:
- **Especies**: de las especies interesa saber el nombre en español, el nombre científico y una descripción general. Hay que tener en cuenta que una especie puede vivir en diferentes hábitats naturales y que un hábitat puede ser ocupado por diferentes especies. Las especies se encuentran en distintas zonas del parque de manera que cada especie está en una zona y en una zona hay varias especies. 
- **Hábitats**: los diferentes hábitats naturales vienen definidos por el nombre, el clima y el tipo de vegetación predominantes, así como el continente o continentes en los que se encuentran. 
- **Zonas**: las zonas del parque en las que se encuentran las distintas especies vienen definidas por el nombre y la extensión que ocupan. 
- **Itinerarios**: los itinerarios discurren por distintas zonas del parque. La información de interés para los itinerarios es: código de itinerario, la duración del recorrido, la longitud del itinerario, el máximo número de visitantes autorizado y el número de distintas especies que visita. Hay que tener en cuenta que un itinerario recorre distintas zonas del parque y que una zona puede ser recorrida por diferentes itinerarios. 
- **Guías**: los guías del parque vienen definidos por el nombre, dirección, teléfono y fecha en la que comenzaron a trabajar en el zoo. Interesa saber qué guías llevan qué itinerarios, teniendo en cuenta que un guía puede llevar varios itinerarios y que un itinerario puede ser asignado a diferentes guías en diferentes horas, siendo éstas un dato de interés. 
- **Cuidadores**: los cuidadores vienen definidos por el nombre, dirección, teléfono y fecha de ingreso en el parque. Hay que tener en cuenta que un cuidador puede estar a cargo de varias especies y que una especie puede ser atendida por varios cuidadores, siendo de interés la fecha en la que un cuidador se hace cargo de una especie.

## Ejercicio 8: Agencia de Viajes
Una cadena de agencias de viajes desea disponer de una Base de Datos que contemple información relativa al hospedaje y vuelos de los turistas que la contratan. Los datos a tener en cuenta son: 
- La cadena de agencias está compuesta por un conjunto de sucursales. Cada sucursal viene definida por el código de sucursal, dirección y teléfono. 
- La cadena tiene contratados una serie de hoteles de forma exclusiva. Cada hotel estará definido por el código de hotel, nombre, dirección, ciudad, teléfono y número de plazas disponibles. 
- De igual forma, la cadena tiene contratados una serie de vuelos regulares de forma exclusiva. Cada vuelo viene definido por el número de vuelo, fecha y hora, origen y destino, plazas totales y plazas de clase turista de las que dispone. 
- La información que se desea almacenar por cada turista es el código de turista, nombre y apellidos, dirección y teléfono. Por otra parte, hay que tener en cuenta la siguiente información: 
- A la cadena de agencias le interesa conocer que sucursal ha contratado el turista. 
- A la hora de viajar el turista puede elegir cualquiera de los vuelos que ofrece la cadena, y en que clase (turista o primera) desea viajar. 
- De igual manera, el turista se puede hospedar en cualquiera de los hoteles que ofrece la cadena, y elegir el régimen de hospedaje (media pensión o pensión completa). Siendo significativa la fecha de llegada y de partida. 

## Ejercicio 9: Servicio Militar
El Ministerio de Defensa desea diseñar una Base de Datos para llevar un cierto control de los soldados que realizan el servicio militar. Los datos significativos a tener en cuenta son: 
- Un soldado se define por su código de soldado (único), su nombre y apellidos, y su graduación. 
- Existen varios cuarteles, cada uno se define por su código de cuartel, nombre y ubicación. 
- Hay que tener en cuenta que existen diferentes Cuerpos del Ejército (Infantería, Artillería, Armada, ...), y cada uno se define por un código de Cuerpo y denominación. 
- Los soldados están agrupados en compañías, siendo significativa para cada una de éstas, el número de compañía y la actividad principal que realiza. 
- Se desea controlar los servicios que realizan los soldados (guardias, imaginarias, cuarteleros, ...), y se definen por el código de servicio y descripción. 
Consideraciones de diseño: 
 - Un soldado pertenece a un único cuerpo y a una única compañía, durante todo el servicio militar. A una compañía pueden pertenecer soldados de diferentes cuerpos, no habiendo relación directa entre compañías y cuerpos. 
 - Los soldados de una misma compañía pueden estar destinados en diferentes cuarteles, es decir, una compañía puede estar ubicada en varios cuarteles, y en un cuartel puede haber varias compañías. Eso si, un soldado sólo esta en un cuartel. 
 - Un soldado realiza varios servicios a lo largo de la milicia. Un mismo servicio puede ser realizado por más de un soldado (con independencia de la compañía), siendo significativa la fecha de realización. 

## Ejercicio 10: Seguridad bancaria
La Policía quiere crear una base de datos sobre la seguridad en algunas entidades bancarias. Para ello tiene en cuenta: 
- Que cada entidad bancaria se caracteriza por un código y por el domicilio de su Central. 
- Que cada entidad bancaria tiene más de una sucursal que también se caracteriza por un código y por el domicilio, así como por el número de empleados de dicha sucursal. 
- Que cada sucursal contrata, según el día, algunos vigilantes jurados, que se caracterizan por un código y su edad. Un vigilante puede ser contratado por diferentes sucursales (incluso de diferentes entidades), en distintas fechas y es un dato de interés dicha fecha, así como si se ha contratado con arma o no. 
- Por otra parte, se quiere controlar a las personas que han sido detenidas por atracar las sucursales de dichas entidades. Estas personas se definen por una clave (código) y su nombre completo. 
- Alguna de estas personas están integradas en algunas bandas organizadas y por ello se desea saber a qué banda pertenecen, sin ser de interés si la banda ha participado en el delito o no Dichas bandas se definen por un número de banda y por el número de miembros. 
- Así mismo, es interesante saber en qué fecha ha atracado cada persona una sucursal. Evidentemente, una persona puede atracar varias sucursales en diferentes fechas, así como que una sucursal puede ser atracada por varias personas. 
- Igualmente, se quiere saber qué Juez ha estado encargado del caso, sabiendo que un individuo, por diferentes delitos, puede ser juzgado por diferentes jueces. Es de interés saber, en cada delito, si la persona detenida ha sido condenada o no y de haberlo sido, cuánto tiempo pasará en la cárcel. Un Juez se caracteriza por una clave interna del juzgado, su nombre y los años de servicio. 

NOTA: En ningún caso interesa saber si un vigilante ha participado en la detención de un atracador.

## Ejercicio 11: Vendedores Holding
Un holding de empresas desea tener una base de datos referente a las empresas que posee, sus vendedores, así como los asesores que trabajan en el holding. La información está organizada de la siguiente forma: 
- Los vendedores se organizan en una jerarquía de pirámide, es decir, cada vendedor puede captar otros vendedores para el holding, de manera que un vendedor tendrá a su cargo varios vendedores. Hay que tener en cuenta que un vendedor sólo podrá trabajar en una empresa y sólo podrá captar vendedores para la empresa en que trabaja; siendo importante almacenar la fecha en que se realiza la captación. Los datos de interés para los vendedores serán el código de vendedor, nombre y la dirección. 
- Las empresas cubrirán diferentes áreas del mercado y una misma área puede ser cubierta por varias empresas. Es interesante conocer el nombre del área y una descripción de ésta. Las empresas pueden estar actuando en varios países y en un país pueden estar desarrollando actividades varias empresas. Sin embargo, cada empresa tendrá su sede en un único país, siendo importante la ciudad donde se localiza la sede. Por cuestiones fiscales, una empresa puede tener su sede en un país en el que no esté desarrollando actividad alguna. Los datos de interés para las empresas son el nombre, la fecha de entrada en el holding, la facturación anual y el número de vendedores que posee.
- Los datos de interés de los países son: el nombre, el PIB, el número de habitantes y la capital. 
- Los asesores entran en el holding para dar soporte en cada una de las áreas en las que actúa el holding. Un asesor puede cubrir varias áreas y un área puede ser cubierta por varios asesores. Un asesor puede asesorar a varias empresas y una empresa tener varios asesores. Es importante saber en qué fecha un asesor comienza a trabajar para una empresa en un área determinada. Los datos de interés de los asesores son el código de asesor, nombre, dirección y la titulación.

## Ejercicio 12: Club náutico
Un club náutico desea tener informatizados los datos correspondientes a sus instalaciones, empleados, socios y embarcaciones que se encuentran en dicho club. El club está organizado de la siguiente forma: 
- Los socios pertenecientes al club vienen definidos por su nombre, dirección, DNI, teléfono y fecha de ingreso en el club. 
- Las embarcaciones vienen definidas por: matricula, nombre, tipo y dimensiones. 
- Los amarres tienen como datos de interés el número de amarre, la lectura del contador de agua y luz, y si tienen o no servicios de mantenimiento contratados. 
- Por otro lado, hay que tener en cuenta que una embarcación pertenece a un socio aunque un socio puede tener varias embarcaciones. Una embarcación ocupará un amarre y un amarre está ocupado por una sola embarcación. Es importante la fecha en la que una embarcación en asignada a un amarre. 
- Los socios pueden ser propietarios de amarres, siendo importante la fecha de compra del amarre. Hay que tener en cuenta que un amarre pertenece a un solo socio y que NO HAY ninguna relación directa entre la fecha en la que se compra un amarre y en la que una embarcación se asigna a un amarre. 
- El club náutico está dividido en varias zonas definidas por una letra, el tipo de barcos que tiene, el número de barcos que contiene, la profundidad y el ancho de los amarres. Una zona tendrá varios amarres y un amarre pertenece a una sola zona. 
- En cuanto a los empleados, estos vienen definidos por su código, nombre, dirección, teléfono y especialidad. Un empleado está asignado a varias zonas y en una zona puede haber más de un empleado, siendo de interés el número de barcos de los que se encarga en cada zona. Hay que tener en cuenta que un empleado puede no encargarse de todos los barcos de una zona.

## Ejercicio 13: Tienda Fotografía
La tienda alquila cámaras fotográficas analógicas.
- Las cámaras se caracterizan por su marca, modelo y soporte flash (si, no).
- Cada cámara es compatible con uno o más tipos de películas.
- Las películas se caracterizan por su marca, nombre, sensibilidad ISO (50, 100,200, 400, 800, 1600) y formato (35mm, 110mm, 120mm).
- Para cada marca con la que trabaja la tienda se conoce la dirección del servicio de reparación más cercano.
- La tienda dispone de varios ítems de cada modelo de cámara.
- Cada ítem tiene una pegatina con una referencia, y puede estar en la tienda,alquilado, con retraso o en reparación.
- Los clientes pueden tener un máximo de 1 cámara en alquiler.
- Cada cámara se alquila un máximo de 7 días, por cada día de retraso, se impone una "multa" de un mes sin posibilidad de coger una nueva cámara.
- El sistema debe gestionar el histórico de alquileres así como el histórico de multas que el cliente ha tenido a lo largo del tiempo.

## Ejercicio 14: Películas
- De cada película se almacena el título, la sinopsis, el año, el género al que pertenece (drama, comedia, acción, terror, romance, aventura, sci-fi) y el país.
- Sobre las personas que participan en la película es necesario conocer el nombre, los apellidos, la fecha de nacimiento y la nacionalidad.
- Una persona puede participar en una película como actor, director,productor o guionista.
- Una película tiene al menos un director y un guionista.
- Una persona se considera actor si ha actuado al menos en una película.
- Una película puede tener asociados varios trailers que son editados por una o más personas. No puede existir el trailer de una película hasta que existe la película.
- Una persona en una película puede desempeñar un único rol, es actor, director, productor o guionista pero nunca puede darse, por ejemplo, que un actor es director.
- Es necesario conocer el personaje que un actor desempeña en una película.

## Ejercicio 15: Series
- Las series se caracterizan por su título, año de inicio, sinopsis, género al que pertenece (acción, aventura, animación, comedia, documental, drama, horror,musical, romance, ciencia ficción), personajes que intervienen, idioma original y puntuación media.
- Las series se organizan en temporadas ordenadas que tienen una fecha de producción y una fecha de estreno de televisión a nivel mundial.
- Cada temporada está a su vez formada por capítulos ordenados que tienen un título, una duración y una sinopsis.
- Los capítulos pueden tener subtítulos asociados.
- Un subtítulo se caracteriza por el idioma utilizado y el autor que los ha traducido.
- Un personaje en una serie concreta es interpretado por un único actor pero un actor puede interpretar varios personajes en una misma serie.
- Un personaje interpretado por un actor puede aparecer en más de una serie.
- Un personaje puede no aparecer en todos los capítulos de la serie por lo que el sistema debe conocer en qué capítulos aparece un personaje.
- Las series se caracterizan por su título, año de inicio, sinopsis y género al que pertenece (acción, aventura, animación, comedia, documental, drama, horror,musical, romance, ciencia ficción)
- Las series se organizan en temporadas ordenadas que tienen una fecha de producción y una fecha de estreno de televisión a nivel mundial.
- Cada temporada está a su vez formada por capítulos ordenados que tienen un título, una duración y una sinopsis.
- Los usuarios se caracterizan por su nombre y apellidos, dirección de correo electrónico y fecha de nacimiento.
- El usuario puede marcar las series como favoritas.
- Si un usuario ha visto algún capítulo de una temporada el sistema la marca como empezada, si ha visto todos los capítulos de la temporada la marca como vista y un usuario en cualquier momento puede dar una temporada como cancelada, es decir, indicar que la deja de seguir.
- Los usuarios pueden escribir críticas acerca de una serie o de un capítulo concreto.
- Las críticas tienen una fecha y el comentario realizado.
- El sistema registra qué capítulos ha visto el usuario.
- Los usuarios pueden puntuar una serie del 1 al 10.

## Ejercicio 16: Redes de computadores
- Los elementos que se pueden incluir en la red son: servidores, ordenadores personales (PC), impresoras y conmutadores.
- Los PCs se conectan a un único conmutador pero los servidores pueden hacerlo a uno o varios.
- Los servidores y PCs pueden generar mensajes de un cierto tamaño.
- Los conmutadores tienen un número de puertos, algunos de los cuales puede usarse para conectar con otros conmutadores. Tienen cierta probabilidad de "perder" mensajes.
- Las impresoras pueden averiarse, con cierta probabilidad, durante cierto tiempo.

## Ejercicio 17: Proyectos
- Un proyecto requiere de una serie de ciclos de desarrollo.
- Todo ciclo de desarrollo concluye con una versión ejecutable y son necesarias cuatro fases para completarlo: inicio, elaboración,construcción y transición.
- A su vez las fases requieren varias iteraciones.
- Las iteraciones son una secuencia de actividades, las cuales tienen una duración y necesitan unos recursos (materiales y humanos).
- Las iteraciones pueden producir artefactos de muy distinto tipo (documentación, resultados de pruebas, software).
- Es importante medir el estado de avance del proyecto.

## Ejercicio 18: Conferencias
- El sistema puede gestionar varias conferencias a la vez.
- Cada conferencia tiene uno o dos chairmen.
- Los autores envían artículos, dentro de un plazo. Uno de los autores es el autor "de correspondencia".
- Los artículos son revisados por 3 revisores, dentro de un plazo.
- En base a las revisiones, los chairmen deciden aceptar o rechazar los artículos. Para ello, envían una notificación a los autores de correspondencia de cada artículo.
- El autor de correspondencia de los artículos aceptados envía una versión final, dentro de un plazo.
- Los artículos están descritos por un título, autores (ordenado), resumen y cuerpo del artículo.
- Autores, revisores y chairmen están descritos por un nombre, afiliación y correo.
- Las revisiones están compuestas por una nota (del 0 al 5) y una sección de comentarios.

## Ejercicio 19: Hospital
- Un paciente es atendido por uno o mas médicos y es asistido por un grupo de enfermeras
- Cada paciente se describe por su numero de historia clínica, nombre y dirección.
- En la base de datos se mantiene información del personal sanitario referente a su número de empleado, nombre y tipo. Para los médicos hay que indicar además su especialidad.
- Para cada paciente se mantienen registro de los análisis realizados identificados por un número de referencia, además, se indica el tipo de análisis, el o los enfermeros que realizaron la prueba y los resultados que se obtuvieron en la misma.

## Ejercicio 20: Clínica veterinaria
- Un veterinario tiene como pacientes animales y como clientes familias.
- Un cliente es un conjunto de personas que suelen corresponderse con una familia. Cada cliente tiene in código, el primer apellido del cabeza de familia, in numero de cuenta bancaria, una dirección, un teléfono y los nombres y DNI de las personas correspondientes. No existe límite en el número de personas asociadas a una entidad cliente. Además, una persona puede estar dada de alta en varios clientes (ej: un hombre que vive con su esposa tiene in gato u como tal pertenece al cliente, pero también está dado de alta en el cliente asociado el perro de sus padres).
- Los clientes pueden tener varias mascotas, cada mascota tiene un código, un alias, una especie, una raza, color de pelo, fecha de nacimiento aproximada, peso medio del animal en las ultimas 10 visitas y el peso actual del animal.
- Se guardará un historial médico de cada mascota con:
  - Cada enfermedad que tuvo y la fecha en la que enfermó.
  - Calendario de vacunación, en el que se registrará la fecha de cada vacuna, la enfermedad de la que se vacuna.

## Ejercicio 21: Parque de atracciones
- El parque de atracciones se divide en zonas temáticas cada una de las cuáles incluye un hotel.
- Cada hotel tiene un conjunto de habitaciones que pueden tener precios diferentes.
- Cada zona temática se caracteriza por tener un nombre, una descripción, un color asociado y un conjunto de atracciones, restaurantes, tiendas y espectáculos.
- De cada restaurante se indica su nombre, el horario y el precio medio por persona.
- De cada tienda se conoce su nombre y el horario en el que está abierto.
- De cada atracción se conoce su nombre, la estatura mínima para poder montar, la capacidad que tiene y la duración del recorrido.
- Los espectáculos pueden ser de diferentes tipos (musical, magia, danza, teatro, etc.) y tienen un nombre, una duración y un aforo máximo.
- Para acceder al parque es necesario disponer de una entrada.
- El sistema permite a los clientes realizar compras en las que incluir una o más entradas para una fecha concreta y opcionalmente incluir alguna reserva para unas fechas concretas en alguno de los hoteles del parque.
- Una reserva en un hotel viene determinada por los datos del cliente (nombre,apellidos, NIF y contacto), los datos de la habitación, la fecha de entrada y la fecha de salida.
- Cada espectáculo puede tener varios pases. Un pase tiene una fecha, una hora, un aforo permitido y un conjunto de butacas a la venta para que los visitantes del parque puedan acceder al espectáculo.
- Para acceder al parque es necesario disponer de una entrada.
- La entrada es nominativa, es decir, se conoce el nombre y apellidos del cliente, es para una fecha concreta y puede incluir acceso a alguno de los espectáculos mediante la compra de entradas para los mismos.

## Ejercicio 22: Gestión de Pedidos
- Debe guardar la información de los pedidos que realizan sus clientes y la fecha en que se formalizan.
- Los pedidos constan habitualmente de varios productos.
- El coste total del pedido se calcula a partir de los precios individuales de cada producto, as’ como de la cantidad e impuestos asociados a cada uno.
- Es importante mantener información sobre las existencias de cada producto con el fin de poder informar al cliente si habrá retrasos en la entrega del pedido.
- El pedido podrá pagarse de una vez o en varios pagos.
- Las formas de pago posible son
  - Tarjeta de crédito (fecha de caducidad, número, VISA o MASTERCARD)
  - Efectivo (moneda)
  - Cheque (nombre, entidad bancaria)
- El pedido podrá estar en uno de los siguientes estados: pendiente, pagado, procesando, enviado y entregado

# Ejercicios Resueltos

## Ejercicio 1: Coleccionista de juegos 
[Video de solución](https://www.youtube.com/watch?v=M6NIjv0s2h4)

Un coleccionista de juegos de mesa, cansado de no encontrar gente con quien jugar, decide crear una aplicación para buscar contrincantes. Para ello parte e los siguientes requisitos:
- De cada juego se desea saber el nombre, el número de jugadores, las copias de las que se dispone del mismo y si tenemos las reglas. Estas reglas se pueden tener en las de un idioma. También serpa necesario saber quien es el propietario del juego, y el tipo de juego (clásico, wargame, rol).
- De los jugadores se necesita saber su nombre y apellidos, teléfono y dirección de correo electrónico. Cada jugador podrá indicar en que juegos estaría interesado en participar.
- Las "quedadas" son organizadas por algún jugador, siempre y cuando sea propietario de algún juego, indicando el juego al que se vá a jugar, el lugar, el dia y la hora. Cuando alguien organiza una quedada, se envía una notificación a todas las personas interesadas en el juego, las cuales podrán confirmar o no la asistencia al evento. El evento se completa cuando se tiene los jugadores suficientes.
- Los jugadores podrán llevarse a la casa las reglas, en el caso de que sea un juego de especial complejidad que necesite de una preparatoria previa.
- Por último, tendremos la opción de "mercadillo": los propietarios de los juegos podrán poner en venta cualquiera de los juegos que posean indicando el precio de venta y si aceptan ofertas por el mismo a la baja. El resto de los miembros de la plataforma podrán consultar todos los juegos que hay en venta y, si acepta ofertas, enviar ofertas por el juego, y el propietario podrá aceptarlas o no.
- La aplicación también tendrá un usuario administrador, encargado del mantenimiento de los juegos, los jugadores y las reglas.

## Ejercicio 2: Electrodomésticos
[Video de solución](https://www.youtube.com/watch?v=3Ed7ejENG-4)

Una tienda de electrodomésticos necesita que construyas un programa para usar su equipo de contabilidad. La idea es que en el programa se pueda gestionar todos los gastos de la empresa, de esa manera pueden tener un software que les permita visualizar y calcular todas sus salidas de dinero, ya sea por gastos, compras de mercadería, pago de impuestos, donaciones, pago de empleados etc.

Deberán poder registrar los gastos con un título, una breve descripción, el monto en dinero que significó y la fecha de la operación.

Los gastos pueden ser por compras, donaciones, pago de impuestos, sueldos o perdidas de dinero. En el caso de las compras, se desea registrar el RUT de la empresa proveedora y la categoría de productos comprado (ejemplo: videojuegos, computación, televisores, etc.). Para el caso de las donaciones se desea guardar el nombre del destinatario a beneficiar (ejemplo: Escuela rural No 999). Para el pago de los impuestos se desea guardar un tipo de impuesto pagado (ejemplo: Parafiscales de empleados, Impuesto a las ventas, etc.) y en el caso de las perdidas, se registrará el motivo (ejemplo: Hurto de 10 celulares).

Los gastos por pagos de sueldos se registraran con la cédula del empleado al cual se le está pagando en cada caso. El software deberá también guardar datos de cada empleado, para poder realizar búsquedas de los pagos que se les ha realizado, siendo que de cada empleado quieren guardar la cédula, el nombre, la dirección, el teléfono y el puesto (ejemplo: vendedor, funcionario de la limpieza, etc.).
