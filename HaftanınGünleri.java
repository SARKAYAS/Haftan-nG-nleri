package atm;

import java.util.Scanner;

public class Atm {

    public static void main(String[] args) {

 while(true){
     
     System.out.print("1-7 arası bir sayı giriniz:");
 
 Scanner scan =new Scanner(System.in);
 
 int sayi= scan.nextInt(); 
 
     if (sayi>0 && sayi<8) {
 

        switch (sayi) {
                case 1:
                    
                System.out.println("Pazartesi");
             
                break;
                
                case 2:
                 System.out.println("Salı");
           
                break;  
                
                
                case 3:
                 System.out.println("Çarşamba");
                break;  
                
                case 4:
                 System.out.println("Perşembe");
                break;
                
                case 5:
                 System.out.println("Cuma");
                break;
                
                case 6:
                 System.out.println("Cumartesi");
                break;
                
                case 7:
                 System.out.println("Pazar");
                break;
                
            default:
                 System.out.println("Yanlış sayı girdiniz...");
                
           continue;
        }
 }
     
     else{
         
         break;
     }
 }
 
}
}