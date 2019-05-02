import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * SerialPerson
 */
public class SerialPerson implements Serializable {

    private String name;
    private SerialInterest interest;

    public SerialPerson(String name, SerialInterest interest) {
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

    public static void main(String[] args) throws CloneNotSupportedException, ClassNotFoundException, IOException {
        SerialInterest interest = new SerialInterest("游泳");
        SerialPerson person = new SerialPerson("wucq", interest);
        System.out.println(person);

        // 通过序列化与反序列化实现深复制
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(person);
        byte[] bytes = bos.toByteArray();

        ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
        ObjectInputStream ois = new ObjectInputStream(bis);

        SerialPerson person2 = (SerialPerson) ois.readObject();
        person2.interest.setName("跑步");
        System.out.println(person2);
        System.out.println(person);
    }
}