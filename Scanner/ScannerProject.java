import java.util.*;

/**
 *
 * @author Ola
 */
public class ScannerProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double x=0;
        // Skapa en referens
        Scanner sc; 
        
        while(true){
        try{
            sc= new Scanner(System.in);
            System.out.print("Ange ett decimaltal x: ");
            //Läs in ett tal
            System.out.flush();
            x = sc.nextDouble();
            System.out.print("Ange ett heltal x: ");
            System.out.flush();
            //Läs in ett tal
            int n = sc.nextInt();
            System.out.println("x^n= "+String.format("%.2f", Math.pow(x, n)));
            break;
        }catch(InputMismatchException e){ 
            System.out.println("felaktig inmatning. Skriv ett decimaltal tex 6,5");
            //System.out.println(e.getStackTrace());
        }
        }
    }
    
}
