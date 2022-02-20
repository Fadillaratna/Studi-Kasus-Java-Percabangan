
package StudiKasus;

import java.util.Scanner;


public class SK3 {

   
    public static void main(String[] args) {
     Scanner userInput= new Scanner(System.in);
        System.out.print("Masukkan Angka Pilihan Anda: ");
        int pilihan = userInput.nextInt();
        
       switch (pilihan){
           case 1:
               System.out.println("Alat Olah Raga");break;
           case 2:
               System.out.println("Alat Elektronik");break;
           case 3:
               System.out.println("Alat Masak");break;
           default:
               System.out.println("Anda Salah Memasukkan Kode");
       }
    }
    
}
