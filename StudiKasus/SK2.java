
package StudiKasus;

import java.util.Scanner;

public class SK2 {

    public static void main(String[] args) {
    Scanner userInput= new Scanner(System.in);
        System.out.println("\n ==== Menghitung Komisi Sales ==== \n");
        System.out.print("Masukkan total penjualan barang sales: ");
        float penjualanSales = userInput.nextFloat();
        
        float komisi1,komisi2,komisi3,uangJasa,uangJasa2,uangJasa1;
        uangJasa1= 10000;
        komisi1=(uangJasa1 + (penjualanSales * 10)/100);
        uangJasa= 20000;
        komisi2=(uangJasa + (penjualanSales * 15)/100);
        uangJasa2=30000;
        komisi3=(uangJasa2 + (penjualanSales * 20)/100);
        
       
        if(penjualanSales == 200000){
            System.out.println("Komisi Sales :" + komisi1);
        }else if( penjualanSales <=  500000 && penjualanSales > 200000){
            System.out.println("Komisi Sales: " + komisi2);
        }else if(penjualanSales > 500000){
            System.out.println("Komisi sales: " + komisi3);
        }else 
            System.out.println("Sales Tidak mendapat komisi");  
    }
    
}
