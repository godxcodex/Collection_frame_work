class Student {
    String name;
    int age;
    int rollNo;
    static int studentno = 0; // initialize static counter

    public Student(String name, int age, int rollNo) {
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
        studentno++; // increment when a new student is created
    }
}

public class staticKeyword {
    public static void main(String[] args) {
        Student s1 = new Student("Sidd", 22, 10);
        System.out.println("Total students: " + Student.studentno); 

        Student s2 = new Student("Suman", 33, 4);
        System.out.println("Total students: " + Student.studentno); 
    }
}
