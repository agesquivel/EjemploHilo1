import java.awt.*;

class TestThread extends Thread {

    private Graphics contGraph;
    private int coordY;

    // Constructor para almacenar nuestro nombre
    // y el retardo
    public TestThread ( Graphics g, int y ) {
        this.contGraph = g;
        this.coordY = y;
    }

    // El metodo run() es similar al main(), pero para
    // threads. Cuando run() termina el thread muere
    public void run() {
        //Establecer color aleatorio
        contGraph.setColor(new Color( (int) (Math.random() * 255),
                (int) (Math.random() * 255),
                (int) (Math.random() * 255) ));

        int coordX = 100;

        for (int i = 0; i < 500; i++){
            contGraph.fillRect(coordX, coordY, 5, 20);
            //repaint();
            coordX =  coordX + 5;
        }
    }

} //Class TestThread

public class EjemploHilo1 extends JFrame{

    public static void main( String args[] ) {

        //Crear el JFrame


        //Acción cuando se cierre


        //Crear un JPanel


        //Asignar el panel al JFrame





        TestThread t1,t2,t3;
        // Creamos los threads
        t1 = new TestThread ( GraphicsPanel,100 );
        t2 = new TestThread ( GraphicsPanel,200  );
        t3 = new TestThread ( GraphicsPanel,300  );

        // Arrancamos los threads
        t1.start();
        t2.start();
        t3.start();
    }
} //class EjemploHilo1