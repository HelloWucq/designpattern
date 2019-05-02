/**
 * Method2
 */
public class Method2 implements Expression {

    @Override
    public int interpret(Scene scene) {
        return scene.getNum1() - scene.getNum2();
    }
}