/**
 * SmartManBuilder
 */
public class SmartManBuilder implements IBuildHuman {
    Human human;

    public SmartManBuilder() {
        human = new Human();
    }

    @Override
    public void buildBody() {
        human.setBody("body");
    }

    @Override
    public void buildHead() {
        human.setHead("head");
    }

    @Override
    public Human createHuman() {
        return human;
    }

}