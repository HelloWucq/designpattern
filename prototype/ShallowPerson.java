/**
 * ShallowPerson
 */
public class ShallowPerson implements Cloneable {
    private String name;
    ShallowInterest interest;

    public ShallowPerson(String name, ShallowInterest interest) {
        this.name = name;
        this.interest = interest;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the interest
     */
    public ShallowInterest getInterest() {
        return interest;
    }

    /**
     * @param interest the interest to set
     */
    public void setInterest(ShallowInterest interest) {
        this.interest = interest;
    }

    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + ", interest=" + interest + '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}