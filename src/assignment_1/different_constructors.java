package assignment_1;

class Student {
    String name;
    int age;
    Student() {
        name = "Unknown";
        age = 0;
    }
    Student(String n, int a) {
        name = n;
        age = a;
    }
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println();
    }
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Rahul", 20);
        s1.display();
        s2.display();
    }
}