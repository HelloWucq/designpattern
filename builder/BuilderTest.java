/**
 * BuilderTest
 */
public class BuilderTest {

    public static void main(String[] args) {
        Director director = new Director();
        Human human = director.createHumanByDirector(new SmartManBuilder());
        System.out.println(human.getBody());
    }
}