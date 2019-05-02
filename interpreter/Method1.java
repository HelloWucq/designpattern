/**
 * Method1
 */
public class Method1 implements Expression {

    @Override
    public int interpret(Scene scene) {
        return scene.getNum1() + scene.getNum2();
    }
}