import java.util.*;
public class Palindrom {
    public static void main(String[] args) {
        
    
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a name");
        String str=sc.nextLine();

        int i=0,j=str.length()-1;
        boolean flag=true;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                flag=false;
                break;
            }
            i++;
            j--;
        }
        System.out.println(flag);


        sc.close();

    }
    

    
}