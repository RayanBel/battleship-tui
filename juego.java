public class juego{
        //String diccionario []
        public static void main(String[] args){
                Terminal terminal = new Terminal();

                terminal.type("\u001b[0mhola \n");

                terminal.type(terminal.setColor(0xff3321, 0x005577));
                terminal.type("\033[1mHola mundo");
                terminal.reset();
                terminal.type("\n\n╔═══╗\n║ x ║\n╚═══╝");
                terminal.type("\u001B[2A\u001B[1D╦═══╗\u001B[5D\u001B[1B║ x ║\u001B[5D\u001B[1B╩═══╝");
                terminal.type("\u001B[2A\u001B[1D╦═══╗\u001B[5D\u001B[1B║ o ║\u001B[5D\u001B[1B╩═══╝  I'm done");
                terminal.type("\n\n\u001B[2A\u001B[1D╠═══╬\u001B[5D\u001B[1B║ o ║\u001B[5D\u001B[1B╚═══╝");
                terminal.type(terminal.setColor(0xff3121, 0x225577));
                terminal.type("\u001B[2A\u001B[1D╬═══╗\u001B[5D\u001B[1B║ x ║\u001B[5D\u001B[1B╩═══╝");
                terminal.type("\u001B[2A\u001B[1D╬═══╣\u001B[5D\u001B[1B║ x ║\u001B[5D\u001B[1B╩═══╝");            
                terminal.type("\n\n\u001B[2A\u001B[1D╠═══╬\u001B[5D\u001B[1B║ o ║\u001B[5D\u001B[1B╚═══╝");
                terminal.type("\u001B[2A\u001B[1D╬═══╗\u001B[5D\u001B[1B║ o ║\u001B[5D\u001B[1B╩═══╝");
                terminal.type("\u001B[2A\u001B[1D╬═══╣\u001B[5D\u001B[1B║ o ║\u001B[5D\u001B[1B╩═══╝");

                terminal.type("\033[0m I'm done\n");


                terminal.close();
        }
}