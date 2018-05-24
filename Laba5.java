
package laba5;

import java.util.Scanner;

public class Laba5 {
    

    public static void main(String[] args) {
        Circle cr= new Circle();
        Circle cr2= new Circle();
        cr.pr();
        cr2.pr();
       // cr.cnrand();
       // cr.pr();
       // cr.length();
        cr.sr(cr2.x, cr2.y);
        cr.touch(cr2.x, cr2.y, cr2.r);
    }
    
}
class Circle {
    
    public double x;
    public double y;
    public double r;
    
    public Circle (){
        Scanner IN = new Scanner(System.in);
        System.out.println("Введите x");
        if (IN.hasNextDouble()){
            x = IN.nextDouble();
        }
        else{
            System.out.println("Ошибка");
            return;
        }
        System.out.println("Введите y");
        if (IN.hasNextDouble()){
            y = IN.nextDouble();
        }
        else{
            System.out.println("Ошибка");
            return;
        }
        System.out.println("Введите r");
        if (IN.hasNextDouble()){
            r = IN.nextDouble();
        }
        else{
            System.out.println("Ошибка");
            return;
        }
    }
    
    public Circle (double a, double b, double c){
        x= a;
        y= b;
        r= c;
    }
    
    public void pr(){
        System.out.println("Координаты окружности x " +x +" y " +y +" радиус " +r);
    }
    
    public void length(){
        double lg = 2* Math.PI* r;
        System.out.println("Длинна окружности " +lg);
    }
    
    public void cnrand(){
        x= (Math.random() *200 -100);
        y= (Math.random() *200 -100);
    }
    
    public void sr(double a, double b){
        double w,s;
        if (x>a){
            if (a>0){
                w= x-a;
            }
            else {
                w= x+a;
            }
        }
        else {
            if (x>0){
                w= a-x;
            }
            else{
                w= a+x;
            }
        }
        if (y>b){
            if (b>0){
                s= y-b;
            }
            else {
                s= y+b;
            }
        }
        else {
            if (y>0){
                s= b-y;
            }
            else{
                s= b+y;
            }
        }
        w = Math.abs(w);
        s = Math.abs(s);
        w = Math.sqrt(w*w +s*s);
        System.out.println("Растояние между центрами окружности "+w);
    }
    
    public void touch(double a,double b, double c) {
        double w,s;
        if (x>a){
            if (a>0){
                w= x-a;
            }
            else {
                w= x+a;
            }
        }
        else {
            if (x>0){
                w= a-x;
            }
            else{
                w= a+x;
            }
        }
        if (y>b){
            if (b>0){
                s= y-b;
            }
            else {
                s= y+b;
            }
        }
        else {
            if (y>0){
                s= b-y;
            }
            else{
                s= b+y;
            }
        }
        w = Math.abs(w);
        s = Math.abs(s);
        w = Math.sqrt(w*w +s*s);
        if ((w== Math.abs(r+c)) || (w== Math.abs(r-c))){
            System.out.println("Окружности касаются в 1 точке");
        }
        else{
            System.out.println("Окружности касаются болеее чем в 1 точке или не касаются вовсе");
        }
    }
}
