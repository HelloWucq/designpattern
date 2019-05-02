/**
 * ShallowInterest
 */
public class ShallowInterest {

    private String name;

    public ShallowInterest(String name) {
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
}