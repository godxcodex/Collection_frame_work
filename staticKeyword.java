class Student{
String name ;
int age;
int rollNo;
static int studentno;
public  Student(String name,int age, int rollNo){
    this.name = name;
    this.age = age;
    this.rollNo = rollNo;
    studentno++;
}
}
public class staticKeyword {
    public static void main(String[] args) {
     Student s1 = new Student("sidd", 22, 10);
        System.out.println(s1.studentno);
      Student s2 = new Student("suman", 033, 4);
      System.out.println(s2.studentno);

    }
}
