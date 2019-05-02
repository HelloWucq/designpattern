/**
 * Target2
 */
public class Target2 extends Template {

    @Override
    protected void step2() {
        System.out.println("this is Target2 step2!");
    }

    @Override
    protected void step4() {
        System.out.println("this is Target2 step4!");
    }

    @Override
    protected boolean isStep4() {
        return false;
    }
}