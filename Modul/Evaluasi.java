
package Modul;
import java.util.Scanner;
public class Evaluasi {

    public static void main(String[] args) {
              Scanner inputUser;
       float a,b,hasil;
       String operator, identitas;
       identitas = "Fadilla Ratna Dwita / 15 / X-RPL 3";
       System.out.println("Identitas " + identitas);
       inputUser= new Scanner(System.in);
        System.out.print("nilai a = ");
        a= inputUser.nextInt();
        System.out.print("nilai operator= ");
        operator=inputUser.next() ;
        System.out.print("nilai b = ");
        b= inputUser.nextInt();
        System.out.println("input user: " + a + " " + operator + " " + b + " ");
        
       switch(operator){
           case "+":
           hasil= a + b;
           System.out.println("hasil = " + a + " " + operator + " " + b + " " + " = " + hasil);
           break;
           case "-":
           hasil= a - b;
           System.out.println("hasil = " + a + " " + operator + " " + b + " " + " = " + hasil);
           break;
           case "*":
           hasil= a * b;
           System.out.println("hasil = " + a + " " + operator + " " + b + " " + " = " + hasil);
           break;
           case "/":
           hasil= a / b;
           System.out.println("hasil = " + a + " " + operator + " " + b + " " + " = " + hasil);
           break;
           case "%":
           hasil= a % b;
           System.out.println("hasil = " + a + " " + operator + " " + b + " " + " = " + hasil);
           break;
           default:
           System.out.println("Operator " + operator + " tidak dapat ditemukan");
       }
    }

    }
    

