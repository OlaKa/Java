import javax.swing.*;
import java.awt.*;
import java.util.concurrent.TimeUnit;

public class HejMessage {

            public static void main (String[] arg) {

		JOptionPane.showMessageDialog(null, "Detta är ett informationsmeddelande","Information", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "Detta är ett varningsmeddelane","Varning!", JOptionPane.WARNING_MESSAGE); 
		JOptionPane.showMessageDialog(null, "Detta är ett felmeddelande","Fel", JOptionPane.ERROR_MESSAGE);

                        
            }

}
