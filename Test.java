import java.text.DecimalFormat;
import java.util.Scanner;

public class Test {
    public static void event(Doctor doctor){
        Scanner sc =new Scanner(System.in);
        doctor.show();
        String p1 = sc.next();
        doctor.checkF();
        doctor.checkS();
        doctor.deposit(20000);
        doctor.pay();
        doctor.receive();
        doctor.checkR();
    }

    public static void main(String[] args){
        Doctor d1 = new Doctor("光","男",30,"sd5689");
        Doctor d2 = new Doctor("明","女",29,"ut8961");
        d1.fee = Float.parseFloat(args[0]);
        d1.salary = Float.parseFloat(args[1]);
        d2.fee = Float.parseFloat(args[2]);
        d2.salary = Float.parseFloat(args[3]);
        event(d1);
        event(d2);
    }
}