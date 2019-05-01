/**
 * StaticFactory
 */
public class StaticFactoryTest {

    public static void main(String[] args) {
        Sender sender = StaticSendFactory.produceMail();
        sender.Send();
    }
}