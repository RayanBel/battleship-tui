# Funcionamiento de la TUI

Primero una introducción, hay varios niveles de interfaz. Nos centraremos en 3:
- CLI (Command-Line Interface): Son meros comandos, vease el funcionamiento de git, el compilador y el interprete de java, entre otras aplicaciones.
- TUI (Text-Based User Interface): Son aplicaciones más interactivas, pero se mantienen en la terminal, vease este proyecto.
- GUI (Graphical User Interface): Las aplicaciones que comunmente usamos, como Visual Studio Code, el navegador, block de notas, etc.

Al dejar explicada cuáles son los distintos niveles, pasemos a entender cómo funciona este proyecto en especifico.
Para ello hace falta presentar [los códigos de escape ANSI](https://es.wikipedia.org/wiki/C%C3%B3digo_escape_ANSI) (que acortaremos como ANSI en este documento).

Podemos resumir que la terminal permite más interacción que mero texto plano. Podemos añadir color, mover el cursor por la terminal, borrar la pantalla, entre otras acciones.

Nos centraremos en los `ANSI [`, ya que son los más útiles en nuestro día a día.
Entre las cosas que podemos hacer está darle estilo al texto con una tabla de números que va desde el 0 hasta 107. Por ejemplo, el número 1 es negrita y el 4 es el subrallado. Para usar colores tenemos varios meodos