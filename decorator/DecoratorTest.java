/**
 * DecoratorTest
 */
public class DecoratorTest {

    public static void main(String[] args) {
        SourceAble source = new Source1();
        SourceAble decorator = new Decorator(source);
        decorator.method();
    }
}