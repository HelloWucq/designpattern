/**
 * State
 */
public class State {

    private String value;

    /**
     * @return the value
     */
    public String getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(String value) {
        this.value = value;
    }

    public void state1() {
        System.out.println("this is state1");
    }

    public void state2() {
        System.out.println("this is state2");
    }
}