/**
 * ShalloTest
 */
public class ShallowTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        ShallowInterest interest = new ShallowInterest("游泳");
        ShallowPerson person = new ShallowPerson("person", interest);
        System.out.println(person);

        ShallowPerson person2 = (ShallowPerson) person.clone();
        person2.setName("person2");
        person2.interest.setName("跑步");
        System.out.println(person2);
        System.out.println(person);
    }
}