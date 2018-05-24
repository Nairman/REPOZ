
package laba3;

public class Laba3 {

    public static void main(String[] args) {
        System.out.println("Массив четных чисел");
        chet();
        System.out.println("Массив нечетных чисел");
        nechet();
        System.out.println("");
        System.out.println("Массив случайных чисел");
        random();
        System.out.println("");
        System.out.println("Таблица случайных чисел");
        randomtabl();
        System.out.println("");
        System.out.println("Таблица с максимумом");
        modul();
    }
    
    public static void chet(){
        int g[] = new int[10];
        int h = 2;
        for (int i=0;i<9;i++){
                h = h+2;
                g[i]= h;
        }
        for (int i=0;i<9;i++){
            System.out.print(g[i]);
            System.out.print(' ');
        }
        System.out.println(' ');
        for (int i=0;i<9;i++){
            System.out.println(g[i]);
        }
    }
    public static void nechet(){
        int g[] = new int[50];
        int h = -1;
        for (int i=0;i<=49;i++){
                h = h+2;
                g[i]= h;
        }
        for (int i=0;i<=49;i++){
            System.out.print(g[i]);
            System.out.print(' ');
        }
        System.out.println(' ');
        for (int i=49;i>=0;i--){
            System.out.print(g[i]);
            System.out.print(' ');
        }
    }
    public static void random(){
       int g[] = new int[10];
       int d=0;
       for (int i=0;i<10;i++){
                g[i]= (int)(Math.random()*10);
                System.out.print(g[i]);
                System.out.print(' ');
                if ((g[i]%2==0) & (g[i]!=0))
                    d++;
       }
       System.out.println("");
       System.out.print("Количество четных элементов ");
       System.out.print(d);
    }
    public static void randomtabl(){
       int g[][] = new int[8][5];
       for (int i=0;i<8;i++){
           System.out.println("");
           for (int j=0;j<5;j++){
                g[i][j]= (int)(Math.random()*90 +10);
                System.out.print(g[i][j]);
                System.out.print(' ');
           }
       }
    }
    public static void modul(){
       int g[][] = new int[7][4];
       int f[] = new int [7];
       for (int i=0;i<7;i++){
           System.out.println("");
           f[i]= 1;
           for (int j=0;j<4;j++){
                g[i][j]= (int)(Math.random()*12 -6);
                f[i]= f[i]*Math.abs(g[i][j]);
                System.out.print(g[i][j]);
                System.out.print(' ');
           }
       }
       int max=0;
       int index=0;
       for (int i=0;i<7;i++){
           if (f[i]>max){
               max= f[i];
               index= i+1;
           }
       }
       System.out.println("");
       System.out.println("Индекс наибольшего произведения строки по модулю");
       System.out.println(index);
    }
}
