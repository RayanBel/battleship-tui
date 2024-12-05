public class Terminal {
        private String prefijo="\033[";
        private char sufijo='m';
        private String diccionarioColor[]=new String []{"negro","rojo","verde","amarillo","azul","morado","cian", "blanco"};
        private String diccionarioDireccion[]={"arriba", "abajo", "derecha", "izquierda"};

        private String arrayToString(int [] numeros){
                String texto= "";
                for(int i=0;i<numeros.length;i++)
                        texto+=numeros[i]+(i==numeros.length-1?"":";");
                return texto;
        }

        private int posInArray(String [] lista, String texto){
                int posicion=-1;
                for(int i=0;i<lista.length;i++)
                        if (lista[i].equals(texto)){
                                posicion=i;
                                break;
                        }
                return posicion;
        }

        public void type(String texto){
                System.out.print(texto);
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

                colorTexto=posInArray(diccionarioColor, texto)!=-1?posInArray(diccionarioColor, texto):colorTexto;
                colorfondo=posInArray(diccionarioColor, fondo)!=-1?posInArray(diccionarioColor, fondo):colorfondo;

                return ansi(new int[] {textoclaro?codigoTextoClaro:codigoTextoNormal+colorTexto, fondoclaro?codigoFondoClaro:codigoFondoNormal+colorfondo});
        }

        // Define el color, acepta dos valores hexadecimales
        public void setColor(int texto, int fondo){
                type(ansi(new int[] {38, 5, texto, 48, 5, fondo}));
        }

        // Mueve el cursor
        public void move(String direccion, int cantidad){
                move(posInArray(diccionarioDireccion, direccion), cantidad);
        }

        public void move(int direccion, int cantidad){
                type(ansi(cantidad, (char)('A'+direccion)));
        }

        // Resetea el color
        public void reset(){
                type(ansi(0));
        }

        // Constructor: limpia la pantalla para mostrar lo que se tenga que mostrar luego
        public Terminal(){
                type(ansi(2,'J')+ansi(new int[] {0,0}, 'H'));
                reset();
        }

        public void close(){
                reset();
                type("\n");
        }
}