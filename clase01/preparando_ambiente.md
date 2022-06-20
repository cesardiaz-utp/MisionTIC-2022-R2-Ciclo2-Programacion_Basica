# Preparando el ambiente

## Instalando Java
Video: [Instalación OpenJDK11 en Windows](https://youtu.be/0Wn0yWwK20Q)

1. Descargar la version de [OpenJDK](https://adoptium.net/es/temurin/releases/?version=11) que se desea usar (mínimo la version 11) según el sistema operativo que estés usando.  
Si estamos en windows, escogemos el instalador MSI o EXE para que la instalación sea mas sencilla.  
Alternativas:
   * [Adoptium](https://adoptium.net/es/temurin/releases/?version=11)
   * [Amazon Correto](https://aws.amazon.com/es/corretto/)
   * [Azul](https://www.azul.com/downloads/?package=jdk)
   * [IBM](https://www.ibm.com/support/pages/java-sdk-downloads)
   * [Microsoft](https://docs.microsoft.com/es-mx/java/openjdk/download)
   * [Oracle](https://www.oracle.com/java/technologies/downloads/)
2. Ejecuto el archivo descargado con las opciones por defecto.
3. Verifico si java quedó bien instalado en nuestra máquina.
```bash
java -version
```

## Instalando extensiones en VSCode
Video: [Instalación de extensión de Java en VSCode](https://youtu.be/g6TMxG1xTzU)

1. Entramos a VSCode
2. Presionamos en la barra de la izquierda el icono de extensiones
3. Presionamos en el símbolo del embudo en la parte superior y buscamos **Category > Extension Packs**
4. En la caja de filtro, agregaremos `Java`
5. Seleccionamos la extension llamada "**Extension Pack for Java**" de **Microsoft** y damos instalar.
6. Esperamos a que termine de instalar las extensiones recomendadas para el trabajo en Java en nuestro entorno.


## (Opcional) Instalando Kernel Java en Jupyter
Si quiere integrar código Java en Jupyter Notebook, es necesario realizar la instalación de un kernel de Jupyter que se integra con la herramienta jShell (ejecutor interactivo de código java).

**Pre-requisitos**:
- JDK Version 9 o superior
- Python 3

1. Descargue la ultima versión del kernel [IJava](https://github.com/SpencerPark/IJava/releases) (Actualmente está en la version 1.3.0). Existe un archivo listo para la ejecucion llamado `ijava-1.3.0.zip`.
2. Descomprima el archivo en una carpeta temporal. Debe contener una un archivo `install.py` y una carpeta `java`.
3. Abra una consola (terminal) en el directorio donde se extrajeron los archivos.
4. Ejecuta el comando de instalación del kernel
```bash
python install.py --user
```
5. Abra VSCode y crea un nuevo documento de Jupyter Notebook.
6. En la parte superior izquierda, donde se selecciona el Kernel con el que vamos a trabajar, encontraremos, ademas de Python, el kernel de Java.
7. Agregamos una celda de código (java) y agregamos el siguiente código y lo ejecutamos:
```java
System.out.println("Hello, Java");
```
8. Es un éxito!!.  
El kernel de Java se ha habilitado en Jupyter Notebook y lo podemos usar en VSCode.