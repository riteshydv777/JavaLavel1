//  npr = n!/(n-r)! . using function 

import java.util.*;
public class Ques14 {

    public static int fact(int x){
        int rv = 1 ;
        for(int i = 1 ; i <= x ; i++){
            rv = rv * i ;
        }
        return rv ;
    } 
          
    


    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n : ");
        int n = sc.nextInt();
        System.out.println("enter r : ");
        int r = sc.nextInt();

        int nfact = fact(n);
        int nmrfact = fact(n-r);

        int npr = nfact / nmrfact ;
        System.out.println( n+ "P" +r+ "=" +npr);

    }
}
