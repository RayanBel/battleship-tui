import java.util.Arrays;
import java.util.stream.Collectors;

public class Terminal {
        String prefijo="\033[";
        char sufijo='m';
        String diccionarioColor[]={"negro","rojo","verde","amarillo","azul","morado","cian", "blanco"};
        String diccionarioDireccion[]={"arriba", "derecha", "abajo", "izquierda"};

        String arrayToString(int [] numeros){
                return numeros != null ? Arrays.stream(numeros)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(";")) : "";
        }

        // Constructor: limpia la pantalla para mostrar lo que se tenga que mostrar luego
        public Terminal(){
                type(ansi(2,'J')+ansi(new int[] {0,0}, 'H')+ansi(0));
        }

        // Añade el prefijo ESC[, concatena todo lo que uno ha de especificar y añade el prefijo m
        public String ansi(int [] modificadores){
                return prefijo + arrayToString(modificadores) + sufijo;
        }

        // Funcion sobrecargada, hace lo mismo, solo que alteramos el sufijo, en este caso, la lista puede ser null
        public String ansi(int [] modificadores, char sufijo){
                return prefijo + arrayToString(modificadores) + sufijo;
        }

        // Añade el prefijo ESC[, concatena todo lo que uno ha de especificar y añade el prefijo m
        public String ansi(int modificador){
                return prefijo + modificador + sufijo;
        }

        // Funcion sobrecargada, hace lo mismo, solo que alteramos el sufijo, en este caso, la lista puede ser null
        public String ansi(int modificador, char sufijo){
                return prefijo + modificador + sufijo;
        }


        //
        public String setColor(String texto, boolean textoclaro, String fondo, boolean fondoclaro){
                
                int codigoTextoNormal=3;
                int codigoTextoClaro=9;
                int colorTexto=9;

                int codigoFondoNormal=4;
                int codigoFondoClaro=10;
                int colorfondo=9;

                for(int i=0;i<diccionarioColor.length;i++){
                        if (diccionarioColor[i].equals(texto)) 
                                colorTexto=i;
                
                        if (diccionarioColor[i].equals(fondo))
                                colorfondo=i;      
                }

                return ansi(new int[] {textoclaro?codigoTextoClaro:codigoTextoNormal+colorTexto, fondoclaro?codigoFondoClaro:codigoFondoNormal+colorfondo});
        }

        // Define el color, acepta dos valores hexadecimales
        public String setColor(int texto, int fondo){
                return ansi(new int[] {38, 5, texto, 48, 5, fondo});
        }

        

        public void reset(){
                System.out.print(ansi(new int []{0, 39, 49})+ "\\033[" + arrayToString(new int []{0, 39, 49}) + sufijo);
        }

        public void type(String texto){
                System.out.print(texto);
        }

        public void close(){
                reset();
        }
}