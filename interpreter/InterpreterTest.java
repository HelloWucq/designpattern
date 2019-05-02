/**
 * InterpreterTest
 */
public class InterpreterTest {

    public static void main(String[] args) {
        int result = new Method2().interpret(new Scene(new Method1().interpret(new Scene(9, 2)), 8));
        System.out.println(result);
    }
}