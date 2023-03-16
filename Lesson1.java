// Java program to show that
// if the static method is redefined by
// a derived class, then it is not
// overriding, it is hiding

class Parent1 {
    // Static method in base class
    // which will be hidden in subclass
    static void m1() {
        System.out.println("From parent "
                + "static m1()");
    }
}

class Child extends Parent1 {
    static void m1() {
        System.out.println("From child static m1()");
    }
}

// Driver class
public class Lesson1 {
    public static void main(String[] args) {
        Parent1 obj1 = new Child();

        // As per overriding rules this
        // should call to class Child static
        // overridden method. Since static
        // method can not be overridden, it
        // calls Parent's m1()
        Parent1.m1();
    }
}

