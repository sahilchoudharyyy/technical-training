package assignment_1;

class Parent {
    void show() {
        System.out.println("This is Parent class method.");
    }
    void display(int a) {
        System.out.println("Display method with one parameter: " + a);
    }
    void display(int a, int b) {
        System.out.println("Display method with two parameters: " + (a + b));
    }
}
class Child extends Parent {
    @Override
    void show() {
        System.out.println("This is Child class method (Overridden).");
    }
}
public class Overload_Override {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.show();
        obj.display(10);
        obj.display(10, 20);
    }
}
