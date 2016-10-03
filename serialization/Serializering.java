package serializering;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author katan
 */
public class Serializering {

    public static ArrayList <Employee> p = new ArrayList<>();
  
    public static void main(String[] args) throws IOException {
        initSer();
        Scanner sc = new Scanner(System.in);
        int svar;
        
        while (true) {
            System.out.println("Serialiserings test");
            System.out.println("-----------------------");
            System.out.println("0\tLista data som serialiserats");
            System.out.println("1\tMata in personer i klassen");
            System.out.println("2\tExit menu");
            System.out.println("");
            System.out.print("Välj: ");
            svar = sc.nextInt();

            switch (svar) {
                case 0:
                    showPersons();
                    //System.exit(0);
                    break;
                case 1:
                    mataInPersoner();
                    saveToSer(p);
                    break;
                case 2:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Felaktigt menyval");
                    break;
            }
        }
}
    public static void mataInPersoner() throws IOException {
        while (true) {
            String namn, tel, adress, postnummer,svar;
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Mata in en person!");
            System.out.println("------------------");
            System.out.println("Mata in namn:");
            namn = input.readLine();
            System.out.println("Mata in telefonnummer:");
            tel = input.readLine();
            System.out.println("Mata in adress:");
            adress = input.readLine();
            System.out.println("Mata in postnummer:");
            postnummer = input.readLine();
            p.add(new Employee(namn, tel, adress, postnummer));
            System.out.println("Mata in en ny person? (y|n):");
            svar = input.readLine();
            if (svar.equalsIgnoreCase("n"))
                break;
        }
    }
    
    public static void saveToSer(ArrayList <Employee> p) throws FileNotFoundException, IOException {
        try (FileOutputStream fileOut = new FileOutputStream("employee.ser"); 
                ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(p);
        }
        System.out.printf("Serializerad data har skickats till employee.ser");
    }
    
    public static void showPersons(){
       for(Employee per : p){
           per.empCheck();
           System.out.println("--------------------------------");
       }
    }
    
    public static void initSer(){
        try {
            FileInputStream fileIn = new FileInputStream("employee.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            p = (ArrayList<Employee>) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException i) {
            System.out.println("IOException");
        } catch (ClassNotFoundException c) {
            System.out.println("Employee class hittades inte!");
            System.out.println("ClassNotFoundException");
        }
    }
}
       


