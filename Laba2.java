
package laba2;

import java.util.Scanner;

public class Laba2 {

    public static void main(String[] args) {
        System.out.println("Четные числа");
        chet();
        System.out.println("Прямоугольник");
        Scanner IN = new Scanner(System.in);
        int m = IN.nextInt();
        int n = IN.nextInt();
        pryam(m,n);
        System.out.println("Треугольник");
        tri();
    }
    
    public static void chet(){
        for (int i=1;i<101;i++){
            if (i%2 == 0)
                System.out.println(i);
        }
}
    
    public static void pryam(int m, int n){
        String s = "";
        for (int i=0;i<n;i++){
            s = s+'8';
        }
        for (int i=0;i<m;i++){
            System.out.println(s);
        }
    }
    
    public static void tri(){
        String s = "";
        for (int i=0;i<10;i++){
            s = s+'8';
            System.out.println(s);
        }
    }
}
