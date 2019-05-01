/**
 * SendFactory
 */
public class MultiSendFactory {

    public Sender produceMail() {
        return new MailSender();
    }

    public Sender produceSms() {
        return new SmsSender();
    }
}