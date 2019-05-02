/**
 * Template
 */
public abstract class Template {

    public final void methodTemplate() {
        step1();
        step2();
        step3();
        if (isStep4()) {
            step4();
        }
    }

    protected boolean isStep4() {
        return true;
    }

    private void step1() {
        System.out.println("this is step1");
    }

    private void step3() {
        System.out.println("this is step3");
    }

    protected abstract void step2();

    protected abstract void step4();

}