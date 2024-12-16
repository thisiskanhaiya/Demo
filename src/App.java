import java.util.Calendar;

class calculator {
    public int add(int a, int b) {
        return a + b;
    }
    public int sub(int a, int b) {
        return a - b;
    }   
    public int mul(int a, int b) {
        return a * b;
    }   
    public int div(int a, int b) {
        return a / b;
    }
}   


public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    
    calculator c = new calculator();
    int a = c.add(1, 2);
    int b = c.sub(1, 2);
    int c1 = c.mul(1, 2);
    int d = c.div(1, 2);
    System.out.println(a);
    System.out.println(b);
    System.out.println(c1);
    System.out.println(d);
    }
}


