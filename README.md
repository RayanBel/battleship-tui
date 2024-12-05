# Hundir la Flota TUI con Java

- [Indice](doc/indice.md) 

## Ejecutar la aplicación

### Desde el código fuente

Se requiere de las herramientas de desrrollador de java (jdk) y se recomienda tener git tambien.

Se puede descargar usando git
```
git clone https://github.com/RayanBel/battleship-tui.git
```
El archivo principal es `juego.java`.
Para poder jugar se ha de compilar y ejecutar en la maquina virtual con
```
javac juego.java
java juego
```

### Ejecutable

Aun no disponible.

## La documentación

El proyecto está compuesto por el archivo principal.
- [`Terminal.java`](Terminal.java): archivo encargado de gestionar la interfaz de la terminal.
- [`Juego.java`](Juego.java): archivo encargado de gestionar la lógica del juego.
- [`README.md`](README.md): este mismo documento
- [`.gitignore`](.gitignore): archivo encargado de indicar qué archivos ha de ignorar git en los repositorios.

El funcionamiento particular de cada archivo se explica en la carpeta `/doc`:
- [TUI](doc/terminal.md)
