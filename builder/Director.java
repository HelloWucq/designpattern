/**
 * Director
 */
public class Director {

    public Human createHumanByDirector(IBuildHuman bh) {
        bh.buildBody();
        bh.buildHead();
        return bh.createHuman();
    }
}