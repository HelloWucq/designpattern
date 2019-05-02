/**
 * StateTest
 */
public class StateTest {

    public static void main(String[] args) {

        State state = new State();
        RunContext context = new RunContext(state);
        state.setValue("state1");
        context.state();

        state.setValue("state2");
        context.state();
    }
}