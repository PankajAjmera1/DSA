// class Computer{
//     public void playMusic(){
//         System.out.println("Playing music");
//     }
//     public  String getMePen(int cost){
//         return "Pen";
//     }
// }

// public class demo {
//     public static void main(String[] args) {
//         Computer c = new Computer();
//         c.playMusic();
//         String str = c.getMePen(10);
//         System.out.println(str);
//     }
// }

// Output: 
// Playing music
// Pen


//method overloading
// class Calculator{
//     // public int add(int i, int j){
//     //     return i+j;
//     // }
//     public int add(int i, int j, int k){
//         return i+j+k;
//     }
   
//     public float add(int i, int j){
//         return i+j;
//     }
// }
// class demo{
//     public static void main(String[] args) {
//         Calculator c = new Calculator();
//         System.out.println(c.add(2, 3));
//         System.out.println(c.add(2, 3, 4));
//     }
// }

//Output:
// 5.0
// 9
class Student{
    int rollno;
    String name;
    int marks;
}
class demo{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "Rahul";
        s1.marks = 90;
        Student s2 = new Student();
        s2.rollno = 2;
        s2.name = "Rohit";
        s2.marks = 80;
        Student s3 = new Student();
        s3.rollno = 3;
        s3.name = "Rohan";
        s3.marks = 70;
        Student students[]=new Student[3];
        students[0]=s1;
        students[1]=s2;
        students[2]=s3;
        // for(int i=0;i<students.length;i++){
        //     System.out.println("Rollno: "+students[i].rollno);
        //     System.out.println("Name: "+students[i].name);
        //     System.out.println("Marks: "+students[i].marks);
        // }
        for (Student stu:students){
            System.out.println("Rollno: "+stu.rollno);
            System.out.println("Name: "+stu.name);
            System.out.println("Marks: "+stu.marks);
        }
    }
}


