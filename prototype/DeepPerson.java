/**
 * DeepPerson
 */
public class DeepPerson implements Cloneable {

    private String name;
    DeepInterest interest;

    public DeepPerson(String name, DeepInterest interest) {
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
    public DeepInterest getInterest() {
        return interest;
    }

    /**
     * @param interest the interest to set
     */
    public void setInterest(DeepInterest interest) {
        this.interest = interest;
    }

    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + ", interest=" + interest + '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object obj = super.clone();

        // 以下实现深复制
        DeepPerson person = (DeepPerson) obj;
        person.interest = (DeepInterest) this.interest.clone();
        return obj;
    }
}