// class A {
//     public A() {
//         System.out.println("A");
//     }
//     public A(int i) {
//         System.out.println("A int");
//     }
// }
// class B extends A {
//     public B() {
//         super(2);
//         System.out.println("B");
//     }
//     public B(int i) {
//         super();
//         System.out.println("B int");
//     }
// }

// public class day2 {
//  public static void main(String[] args) {
//     B obj = new B();
//  }   
// }

//method overiding
// class A {
//     public void show(){
//         System.out.println(
//             "in a"
//         );
//     }
//     public void config(){
//         System.out.println("in a config");
//     }
// }
// class B extends A{
//     public void show(){
//         System.out.println("in B show");
//     }
// }

// public class day2{
//     public static void main(String[] args){
//     B obj =new B();
//         obj.show();
// }
// }

//abstract

abstract class Car{
    public abstract void drive();
    public void playMusic(){
        System.out.println("play music");
    }
}
class WagonR extends Car{
    public void drive(){
        System.out.println("driving...");
    }

}

public class day2 {

    public static void main(String[] args) {
       // Car obj =new Car() //can not create object f abstact class
       Car obj =new WagonR();
         obj.drive();
            obj.playMusic(); 
    }
}