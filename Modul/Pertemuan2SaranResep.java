
package Modul;

import java.util.Scanner;

public class Pertemuan2SaranResep {

    public static void main(String[] args) {
      Scanner userInput= new Scanner(System.in);
     //int bahan2 = userInput.nextInt();
     String identitas= "Fadilla Ratna Dwita / 15 / X RPL 3";
     System.out.println("Identitas " + identitas);
     System.out.println("\n Saran Resep Dari Bahan Milik Anda");
     
        System.out.println("Bahan Pertama:");
        System.out.println("1. Pisang");
        System.out.println("2. Telur");
        System.out.print("Masukkan no. pilihan anda: ");
        int bahan1= userInput.nextInt();
        
      if(bahan1 == 1 || bahan1 == 2){
        
         if(bahan1 == 1){
             System.out.println("1. Susu");
             System.out.println("2. Minyak Goreng");
             System.out.println("3. Tidak ada");
        }else{//Bahan1 == 2
             System.out.println("1. Minyak Goreng");
             System.out.println("2. Roti");
             System.out.println("3. Tidak ada");
        }
        }else{
            System.out.println("Mohon maaf pilihan anda tidak dapat ditemukan " + "tidak dapat memberikan saran resep");
        }
      
      System.out.print("Masukkan no. pilihan anda: ");
     int bahan2 = userInput.nextInt();
     if(bahan2 >= 1 && bahan2 <= 3){
         if(bahan1==1){
             switch(bahan2){
                 case 1:
                     System.out.println("Anda dapat membuat milk shake banana");break;
                 case 2:
                     System.out.println("Anda dapat membuat pisang goreng");break;
                 case 3:
                     System.out.println("Anda dapat membuat pisang rebus");break;
                
                 
             }
         }else{//Bahan1==2
             switch(bahan2){
                 case 1:
                     System.out.println("Anda dapat membuat telur mata sapi");break;
                 case 2:
                     System.out.println("Anda dapat membuat sandwich telur");break;
                 case 3:
                     System.out.println("Anda dapat membuat telur rebus");break;
                 
             }
         }
        
        }else{
         System.out.println("Mohon maaf pilihan tidak ditemukan" + "tidak dapat memberikan saran resep");
     }
    }
    
}
