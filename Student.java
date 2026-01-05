import javax.swing.*;

interface A{
    void print();
}
class B implements A
{
    @Override
    public void print() {

    }
}
public class Student{
    public static void main(String[] args) {
        B ob = new B();
        
    }
}