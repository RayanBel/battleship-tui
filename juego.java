public class juego{
        public static void main(String[] args){
                Terminal terminal = new Terminal();

                terminal.setColor(0x4466BB, 0);

                terminal.type("╔═══╗");
                terminal.move(1, 1);
                terminal.move(3,5);
                terminal.type("║ 1 ║");
                terminal.move(1, 1);
                terminal.move(3,5);
                terminal.type("╚═══╝");

                terminal.move(0,2);
                terminal.move(3,1);
                terminal.type("╦═══╗\u001B[5D\u001B[1B║ 2 ║\u001B[5D\u001B[1B╩═══╝");
                terminal.move(3,1);
                terminal.type("\u001B[2A╦═══╗\u001B[5D\u001B[1B║ 3 ║\u001B[5D\u001B[1B╩═══╝");
                terminal.move(3,1);
                terminal.type("\u001B[2A╦═══╗\u001B[5D\u001B[1B║ A ║\u001B[5D\u001B[1B╬═══╝  I'm done");

                terminal.type("\n\n\u001B[2A\u001B[1D╠═══╬\u001B[5D\u001B[1B║ 4 ║\u001B[5D\u001B[1B╚═══╝");
                terminal.type("\u001B[2A\u001B[1D╬═══╗\u001B[5D\u001B[1B║ 5 ║\u001B[5D\u001B[1B╩═══╝");
                terminal.type("\u001B[2A\u001B[1D╬═══╣\u001B[5D\u001B[1B║ 6 ║\u001B[5D\u001B[1B╩═══╝");            
                terminal.type("\n\n\u001B[2A\u001B[1D╠═══╬\u001B[5D\u001B[1B║ 7 ║\u001B[5D\u001B[1B╚═══╝");
                terminal.type("\u001B[2A\u001B[1D╬═══╗\u001B[5D\u001B[1B║ 8 ║\u001B[5D\u001B[1B╩═══╝");
                terminal.type("\u001B[2A\u001B[1D╬═══╣\u001B[5D\u001B[1B║ 9 ║\u001B[5D\u001B[1B╩═══╝");

                terminal.setColor("rojo", false, "verde", true);
                terminal.type("I'm done\n\n\nnothing");

                terminal.move("arriba", 1);
                terminal.type("hola");
                terminal.move("abajo", 2);
                terminal.type("hola");
                terminal.move("arriba", 1);
                terminal.type("hola");
                terminal.move("izquierda", 1);
                terminal.type("hola");
                terminal.move("abajo", 2);
                terminal.type("hola");
                terminal.move("derecha", 20);
                terminal.type("hola");

                terminal.close();
        }
}