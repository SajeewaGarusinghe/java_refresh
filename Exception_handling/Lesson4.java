package Exception_handling;
abstract class Parent3 {
    abstract void run(int x);
}
class Child extends Parent3 {

//    class 'Child' must either be declared abstract or implement abstract method 'run(int)' in 'Parent3'
    @Override
    void run(int x) {
        System.out.println("overiding Parent abstrat method");
    }
}
public class Lesson4 {
}
