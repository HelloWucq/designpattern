/**
 * NormalFactoryTest
 */
public class NormalFactoryTest {

    public static void main(String[] args) {
        NormalSendFactory factory = new NormalSendFactory();
        Sender sender = factory.produce("sms");
        sender.Send();
    }
}