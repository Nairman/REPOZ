
package laba4;

import java.util.Scanner;

public class Laba4 {

    public static void main(String[] args) {
        System.out.println("Массив из случайных чисел от a до b");
        System.out.println("");
        Zd1();
        System.out.println("Массивы из случайных чисел от a до b");
        System.out.println("");
        Zd2();
        System.out.println("Сортировка");
        System.out.println("");
        Zd3();
        System.out.println("Рекурсия");
        System.out.println("");
        Zd4();
    }
    
    public static void Zd1(){
        int arr[] = new int[20];
        int a,b;
        System.out.println("Введите a и b");
        System.out.println("");
        Scanner IN = new Scanner(System.in);
        if (IN.hasNextInt()){
            a = IN.nextInt();
        }
        else{
            System.out.println("Ошибка");
            return;
        }
        if (IN.hasNextInt()){
            b = IN.nextInt();
        }
        else{
            System.out.println("Ошибка");
            return;
        }
        for (int i=0; i<20;i++){
            arr[i] = rand (a,b);
            System.out.print(arr[i]);
            System.out.print(' ');
        }
        System.out.println("");
    }
    
    static int rand(int a, int b){
        int f,k;
        if (a<b){
            f= a;
        }
        else{
            f= b;
        }
        if (f<0){
            f-=1;
        }
        k= Math.abs(a-b)+1;
        return (int) (Math.random()*k +f);
    }
    
    public static void Zd2(){
        int a,b;
        int[] arr1,arr2,arr3,arr4,arr5;
        arr1= new int[10];
        arr2= new int[10];
        arr3= new int[10];
        arr4= new int[10];
        arr5= new int[10];
        System.out.println("Введите a и b");
        System.out.println("");
        Scanner IN = new Scanner(System.in);
        if (IN.hasNextInt()){
            a = IN.nextInt();
        }
        else{
            System.out.println("Ошибка");
            return;
        }
        if (IN.hasNextInt()){
            b = IN.nextInt();
        }
        else{
            System.out.println("Ошибка");
            return;
        }
        mass(arr1,a,b);
        mass(arr2,a,b);
        mass(arr3,a,b);
        mass(arr4,a,b);
        mass(arr5,a,b);
    }
    
    static void mass (int arr[],int a, int b){
        for (int i=0; i<arr.length;i++){
            arr[i] = rand (a,b);
            System.out.print(arr[i]);
            System.out.print(' ');
        }
        System.out.println("");
    }
    
    public static void Zd3(){
        int a,b;
        int[] arr1= new int[10];
        System.out.println("Введите a и b");
        System.out.println("");
        Scanner IN = new Scanner(System.in);
        if (IN.hasNextInt()){
            a = IN.nextInt();
        }
        else{
            System.out.println("Ошибка");
            return;
        }
        if (IN.hasNextInt()){
            b = IN.nextInt();
        }
        else{
            System.out.println("Ошибка");
            return;
        }
        mass(arr1,a,b);
        sort(arr1);
    }
    
    static void sort(int arr[]){
        int k;
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]>arr[j]){
                    k= arr[i];
                    arr[i]= arr[j];
                    arr[j]= k;
                }
            }
        }
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            System.out.print(' ');
        }
    }
    
    public static void Zd4(){
        int i=0;
        int j=0;
        rekur(i,j);
    }
    
    static void rekur(long i,long j){
        i+=i;
        j++;
        System.out.println("Последовательность № ");
        System.out.println(j);
        rekur(i,j);
    }
    
}
