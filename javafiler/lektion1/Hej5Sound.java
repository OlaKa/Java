import javax.swing.*;
import java.awt.*;
import java.util.concurrent.TimeUnit;

public class Hej5Sound {

            public static void main (String[] arg) {

                          JOptionPane.showMessageDialog(null, "Hej!\n" + "Number of processors: " + Runtime.getRuntime().availableProcessors() +
							"\n" + "Free memory:" + Runtime.getRuntime().freeMemory());
			  /*Loop to sound 5 times*/ 
                         for(int i=0; i<5;i++){
			     Toolkit.getDefaultToolkit().beep();
			     try {
				 Thread.sleep(1000);                 //1000 milliseconds is one second.
			     } catch(InterruptedException ex) {
				 Thread.currentThread().interrupt();
			     }

			 }

            }

 

}
