
package StudiKasus;

import java.util.Scanner;

public class SK4 {

    public static void main(String[] args) {
        Scanner userInput= new Scanner(System.in);
         System.out.print("Masukkan nilai: ");
         int nilai = userInput.nextInt();
         
         
         if(nilai > 90){
             System.out.println("Grade = A");
         }else if (nilai > 80){
             System.out.println("Grade = B+");
         }else if (nilai > 70){
             System.out.println("Grade = B");
         }else {
             System.out.println("Grade = F");
         }
         
         
    }
    
}
