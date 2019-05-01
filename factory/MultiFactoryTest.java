/**
 * MultiFactoryTest
 */
public class MultiFactoryTest {

    public static void main(String[] args) {
        MultiSendFactory factory = new MultiSendFactory();
        Sender sender = factory.produceMail();
        sender.Send();
    }
}