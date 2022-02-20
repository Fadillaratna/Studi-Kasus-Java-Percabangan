
package StudiKasus;


public class SK1 {

    public static void main(String[] args) {
      int buku,pensil,bolpoin,stipo;
        double jumlahBarang, totalHarga,harga,potongan1,potongan2;
        buku = 5;
        pensil = 4;
        bolpoin = 2;
        stipo= 1;
        harga= 7000;
        jumlahBarang = (buku + pensil + bolpoin + stipo);
        totalHarga = (harga * jumlahBarang);
        potongan1 = (totalHarga - ((totalHarga*0)/100));
        potongan2 = (totalHarga - ((totalHarga*20)/100));
        
        System.out.println("Jumlah Barang = " + buku + " + " + pensil + " + " + bolpoin + " + " + stipo + " = " + jumlahBarang );
        System.out.println("Total Harga = " + "Rp " + harga + " * " + jumlahBarang + " = " + " Rp " + totalHarga);
        
        if(totalHarga < 50000){
            System.out.println("Total Bayar (Diskon 0%): " + totalHarga + " - "  + "( " + totalHarga + " * " + 20 + " % "+ "=" + potongan1);
            
        }else if(totalHarga >= 50000){
            System.out.println("Total Bayar (Diskon 20%): " + totalHarga + " - "  + "(" + totalHarga + " * " + 20 + " %"+ ")"  + " = " + potongan2);
        }else{
            System.out.println("Maaf Error");
        }
            
    }
    
}
