public class juego{
        //String diccionario []
        public static void main(String[] args){
                Terminal terminal = new Terminal();

                terminal.type(terminal.setColor(0xff33121, 0x005577));
                terminal.type("\033[5m Hola mundo");

                // terminal.type("╔═══╗\n║ x ║\n╚═══╝");
                // terminal.type("\u001B[2A\u001B[1D╦═══╗\u001B[5D\u001B[1B║ x ║\u001B[5D\u001B[1B╩═══╝");
                // terminal.type("\u001B[2A\u001B[1D╦═══╗\u001B[5D\u001B[1B║ o ║\u001B[5D\u001B[1B╩═══╝");
                // terminal.type("\n\n\u001B[2A\u001B[1D╠═══╬\u001B[5D\u001B[1B║ o ║\u001B[5D\u001B[1B╚═══╝");
                // terminal.type("\u001B[2A\u001B[1D╬═══╗\u001B[5D\u001B[1B║ x ║\u001B[5D\u001B[1B╩═══╝");
                // terminal.type("\u001B[2A\u001B[1D╬═══╣\u001B[5D\u001B[1B║ x ║\u001B[5D\u001B[1B╩═══╝");            
                // terminal.type("\n\n\u001B[2A\u001B[1D╠═══╬\u001B[5D\u001B[1B║ o ║\u001B[5D\u001B[1B╚═══╝");
                // terminal.type("\u001B[2A\u001B[1D╬═══╗\u001B[5D\u001B[1B║ o ║\u001B[5D\u001B[1B╩═══╝");
                // terminal.type("\u001B[2A\u001B[1D╬═══╣\u001B[5D\u001B[1B║ o ║\u001B[5D\u001B[1B╩═══╝");
                for(;;);

                //terminal.close();
        }
}