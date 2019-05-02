import java.io.Serializable;

/**
 * SerialInterest
 */
public class SerialInterest implements Serializable {
    private String name;

    public SerialInterest(String name) {
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