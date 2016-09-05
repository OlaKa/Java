package personnummer;

import javax.swing.JOptionPane;

/**
 *
 * @author Ola
 */
public class Personnummer {
    public static void main(String[] args) {
        String s;
        int dialogbutton=JOptionPane.showConfirmDialog(null, 
               "Är du man?","Fråga", JOptionPane.YES_NO_OPTION);
              s=JOptionPane.showInputDialog(null,"Ange ditt personnummer:");  
        String t = s.substring(s.length()-2, s.length()-1); 
        int tu=Integer.parseInt(t);
        if (dialogbutton==0 && tu%2 == 1 || dialogbutton==1 && tu%2==0){
            JOptionPane.showMessageDialog(null,"Yes!");
            } 
        else
            JOptionPane.showMessageDialog(null,"Lögnare!");
            
    }
    }
