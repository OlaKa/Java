package genarr;

/**
 *
 * @authorOla
 */
public class Genarr {
   // generic method printArray
   public static < A > void printArray( A [] inputArray ) {
      // Display array elements
      for(A element : inputArray) {
         System.out.printf("%s ", element);
      }
      System.out.println();
   }
 
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      // Create arrays of Integer, Double and Character
      Integer [] intArray = { 1, 2, 3, 4, 5 };
      Double [] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
      String [] stringArray = {"Hello","how", "are","you?"};

      System.out.println("Array integerArray contains:");
      printArray(intArray);   // pass an Integer array

      System.out.println("\nArray doubleArray contains:");
      printArray(doubleArray);   // pass a Double array

      System.out.println("\nArray stringArray contains:");
      printArray(stringArray);   // pass a String array
    }
}   
