/**
 * Facade
 */
public class Facade {

    private SubSource1 sub1;
    private SubSource2 sub2;

    public Facade() {
        sub1 = new SubSource1();
        sub2 = new SubSource2();
    }

    public void method1() {
        System.out.println("this is facade method1");
        sub1.method1();
        sub2.method1();
    }

    public void method2() {
        System.out.println("this is facade method2");
        sub1.method2();
        sub2.method2();
    }
}