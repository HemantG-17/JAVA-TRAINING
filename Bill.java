import java.util.*;
public class Bill {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int tax=5;
        System.out.println("item name");
        String item=sc.nextLine();
        System.out.println("unit price");
        int unit=sc.nextInt();
        System.out.println("quantity");
        int quan=sc.nextInt();
        System.out.println("discount");
        int dis=sc.nextInt();
        double total=((quan*unit)-dis);
        total=total+(total*0.05); 
        System.out.println("-----------------------------------BILL---------------------------------------------------------");
        System.out.println(" ");
        System.out.println("ITEM                     UNIT PRICE       DISCOUNT      QUANTITY      TAX       TOTAL");
        System.out.println(" "+item+"                         ₹ "+unit+"              ₹"+dis +"               ₹"+quan + "        "+tax +"%"+"         ₹"+total );
        System.out.println("");
        System.out.println("-------------------------------THANK YOU ---------------------------------------------------------------");

    }
}
 