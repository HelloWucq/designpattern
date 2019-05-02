/**
 * BridgeTest
 */
public class BridgeTest {

    public static void main(String[] args) {
        Bridge bridge = new MyBridge();

        Rootable root1 = new RootSub1();
        bridge.setRoot(root1);
        bridge.method();

        Rootable root2 = new RootSub2();
        bridge.setRoot(root2);
        bridge.method();
    }
}