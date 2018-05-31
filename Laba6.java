package laba6; 

import java.util.Scanner; 

public class Laba6 { 

public static void main(String[] args) { 
    //Pegas p1 = new Pegas(); 
    //p1.fly(); 
    //Dog d1 = new Dog(); 
    // Cat c1 = new Cat(); 
    //d1.ret(); 
    //c1.ret();
    Human h1= new Human();
    h1.set_paramname();
    h1.retname();
    Ape a1= new Ape();
    a1.set_paramdb();
    a1.retdb();
    } 
} 

class Horse{ 

private String name = ""; 

public Horse(){ 
    Scanner IN = new Scanner(System.in); 
    System.out.println("Введите имя"); 
    name = IN.nextLine(); 
} 

public String givename() { 
    return(name); 
} 

public void setname(String name) { 
    this.name=name; 
    } 
} 

class Pegas extends Horse{ 

public void fly(){ 
    System.out.println("Пегас " +this.givename()); 
    } 
} 

class Pet{ 
    private float m; 
    private boolean g; 
    private int t; 

public void set_param(){ 
    Scanner IN = new Scanner(System.in); 
    System.out.println("Введите вес"); 
    m = IN.nextFloat(); 
    System.out.println("Введите пол"); 
    g = IN.nextBoolean(); 
    System.out.println("Введите возраст"); 
    t = IN.nextInt(); 
} 

public float givem(){ 
    return(m); 
} 

public boolean giveg(){ 
    return(g); 
} 

public int givet(){ 
    return(t); 
  } 
} 

class Dog extends Pet{ 

private String name = ""; 

public Dog(){ 
    Scanner IN = new Scanner(System.in); 
    System.out.println("Введите имя собаки"); 
    name = IN.nextLine(); 
    this.set_param(); 
} 

public void ret(){ 
    System.out.println("Имя собаки " +name); 
    System.out.println("Вес собаки " +this.givem()); 
    System.out.println("Пол собаки " +this.giveg()); 
    System.out.println("Возраст собаки " +this.givet()); 
} 
} 

class Cat extends Pet{ 

private String name = ""; 

public Cat(){ 
    Scanner IN = new Scanner(System.in); 
    System.out.println("Введите имя кошки"); 
    name = IN.nextLine(); 
    this.set_param(); 
} 

public void ret(){ 
    System.out.println("Имя кошки " +name); 
    System.out.println("Вес кошки " +this.givem()); 
    System.out.println("Пол кошки " +this.giveg()); 
    System.out.println("Возраст кошки " +this.givet()); 
}
}

class Fish{ 
private boolean jab; 

public void retbool(){
    System.out.println("Жабры " +jab);
}
public void set_parambool(){ 
    Scanner IN = new Scanner(System.in); 
    System.out.println("Введите true or false"); 
    jab = IN.nextBoolean(); 
} 
} 

class Animal extends Fish{ 
    private float w;
    
    public void retfl(){
    System.out.println("Вес " +w);
    this.retbool();
}
    
    public void set_paramfl(){ 
    Scanner IN = new Scanner(System.in); 
    System.out.println("Введите вес"); 
    w = IN.nextFloat();
    this.set_parambool();
} 
} 

class Ape extends Animal{ 
    private double e;
    
    public void retdb(){
    System.out.println("Рост " +e);
    this.retfl();
}
    
    public void set_paramdb(){ 
    Scanner IN = new Scanner(System.in); 
    System.out.println("Введите рост"); 
    e = IN.nextDouble(); 
    set_paramfl();
} 
} 

class Human extends Ape{ 
    private String name = "";
    
    public void retname(){
    System.out.println("Имя " +name);
    this.retdb();
}
    
    public void set_paramname(){ 
    Scanner IN = new Scanner(System.in); 
    System.out.println("Введите имя"); 
    name = IN.nextLine();
    this.set_paramdb();
} 
} 