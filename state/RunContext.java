/**
 * Context
 */
public class RunContext {

    private State state;

    public RunContext(State state) {
        this.state = state;
    }

    /**
     * @return the state
     */
    public State getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(State state) {
        this.state = state;
    }

    public void state() {
        if (state.getValue().equals("state1"))
            state.state1();
        else if (state.getValue().equals("state2"))
            state.state2();
    }
}