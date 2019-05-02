/**
 * ShallowInterest
 */
public class DeepInterest implements Cloneable {

    private String name;

    public DeepInterest(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Interest{" + "name='" + name + '\'' + '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}