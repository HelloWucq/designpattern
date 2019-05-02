/**
 * TemplateTest
 */
public class TemplateTest {

    public static void main(String[] args) {

        Template target1 = new Target1();
        target1.methodTemplate();
        System.out.println("============");

        Template target2 = new Target2();
        target2.methodTemplate();
    }
}