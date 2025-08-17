class Student {
    String name;
    int age;
    int rollNo;
    private static int studentno = 0; // initialize static counter

    Student(String name, int age, int rollNo) {
        this.name = name;
        this.age = age; 
        this.rollNo = rollNo;
        studentno++; // increment when a new student is created
    }
    public void getter(){
        System.out.println(studentno);
    }
}

public class staticKeyword {
    public static void main(String[] args) {
        //Student.studentno =100;// using private access modifire so that the memebers out side the class can not access it 
        //System.out.println(Student.studentno);
        Student s1 = new Student("Sidd", 22, 10);
        //System.out.println("Total students: " + Student.studentno); 
        
        Student s2 = new Student("Suman", 33, 4);
       // System.out.println("Total students: " + Student.studentno); 
        s2.getter();
    }
}
