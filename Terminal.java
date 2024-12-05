
public class Terminal {
        String prefijo="\033[";
        String sufijo="m";
        String diccionarioColor[]={"negro","rojo","verde","amarillo","azul","morado","cian", "blanco"};

        public Terminal(){
                type(prefijo+"2J"+prefijo+"0;0H");
        }

        public String setColor(String texto, boolean textoclaro, String fondo, boolean fondoclaro){
                
                String codigoTextoNormal="3";
                String codigoTextoClaro="9";
                String colorTexto="9";

                String codigoFondoNormal="4";
                String codigoFondoClaro="10";
                String colorfondo="9";

                for(int i=0;i<diccionarioColor.length;i++){
                        if (diccionarioColor[i].equals(texto)) 
                                colorTexto=String.valueOf(i);
                
                        if (diccionarioColor[i].equals(fondo))
                                colorfondo=String.valueOf(i);      
                }

                return prefijo+(textoclaro?codigoTextoClaro:codigoTextoNormal)+colorTexto+
                ";"+(fondoclaro?codigoFondoClaro:codigoFondoNormal)+colorfondo+sufijo;
        }

        public String setColor(int texto, int fondo){
                return prefijo+"38;5;"+texto+";48;5;"+fondo+sufijo;
        }

        public void reset(){
                System.out.print(prefijo+"0"+prefijo);
        }

        public String tabla(char[][] tablero){
                String tabla = "";
                for(int i = 0; i < tablero.length; i++){
                        for(int j = 0; j < tablero[i].length; j++){
                                tabla += tablero[i][j];
                        }
                        tabla += "\n\n";
                }
                return tabla;
        }
        public void type(String texto){
                System.out.print(texto);
        }

        public void close(){
                reset();
        }
}