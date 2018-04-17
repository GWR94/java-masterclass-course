/**
 * Created by james on 26/06/2017.
 */
public class Main {
    public static void main(String[] args) {
        ITelephone timsPhone;
        timsPhone = new DeskPhone(1123455);
        timsPhone.powerOn();
        timsPhone.callPhone(1123455);
        timsPhone.answer();

        timsPhone = new MobilePhone(456789);
        timsPhone.powerOn();
        timsPhone.callPhone(456789);
        timsPhone.answer();
    }
}
