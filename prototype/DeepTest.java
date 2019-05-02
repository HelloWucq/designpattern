/**
 * DeepTest
 */
public class DeepTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        DeepInterest interest = new DeepInterest("游泳");
        DeepPerson person = new DeepPerson("wucq", interest);
        System.out.println(person);
        DeepPerson person2 = (DeepPerson) person.clone();
        person2.setName("wucq2");
        person2.interest.setName("跑步");
        System.out.println(person2);
        System.out.println(person);
    }
}