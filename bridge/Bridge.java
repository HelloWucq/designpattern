public abstract class Bridge {
    private Rootable root;

    public void method() {
        root.method();
    }

    public Rootable getRoot() {
        return root;
    }

    public void setRoot(Rootable root) {
        this.root = root;
    }
}