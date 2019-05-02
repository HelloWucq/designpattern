/**
 * StrategyTest
 */
public class StrategyTest {

    public static void main(String[] args) {

        Strategy strategy = new Type1Strategy();
        Context context = new Context(strategy);
        context.encrypt();
    }
}