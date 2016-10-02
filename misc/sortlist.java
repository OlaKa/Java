package fält;

import static fält.Fält.lp;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Ola
 */
public class Fält {

    static List<Integer> lp = new LinkedList<>();
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) throws IOException {
        System.out.println("Ange ett tal (avsluta q) :");
        while (sc.hasNextInt()) {
            lp.add(sc.nextInt());
        }
        Collections.sort(lp);
        for (Integer s : lp) {
            System.out.println(s);
        }        
    }
}
