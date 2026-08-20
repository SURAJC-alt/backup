public class OOPs1 {
    public static void main(String[] args) {
        Student s1 = new Student(13, "Suraj Chitragar", 88.5f);
        Student random = new Student(s1);
        // s1.name = "Rahul";//the random object Has a copy of "Suraj", it will not change the name of random as Rahul
        //                 //only the s1 object is changed the name "Suraj" to "Rahul"
        Student unknown = new Student();

        s1.greeting(); // Output: Hello! My name is Suraj Chitragar
        random.greeting(); // Output: Hello! My name is Suraj Chitragar
        unknown.greeting(); // Output: Hello! My name is Default Student
        
    }
}

class Student {
    int rollNum;
    String name;
    float marks;

    // 1. Default / Non-Parameterized Constructor
    Student() {
        // Calling another constructor from within a constructor using 'this()'
        this(0, "Default Student", 0.0f);
    }

    // 2. Parameterized Constructor
    Student(int rollNum, String name, float marks) {
        this.rollNum = rollNum;
        this.marks = marks;
        this.name = name;
    }

    // 3. Copy Constructor (Passes another object instance)
    Student(Student otherStudent) {
        this.marks = otherStudent.marks;
        this.name = otherStudent.name;
        this.rollNum = otherStudent.rollNum;
    }

    void greeting() {
        System.out.println("Hello! My name is " + this.name +" "+this.marks+" "+ this.rollNum);
    }
}