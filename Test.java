import java.text.DecimalFormat;
import java.util.Scanner;

public class Test {
    public static void Event(Doctor doctor){
        int p1 = 00000000;
        Scanner sc =new Scanner(System.in);
        doctor.Show();
        try {
            p1 = Integer.parseInt(sc.next());
        }catch (IllegalArgumentException e){
            System.out.println("密码为纯数字 "+e.getMessage());
        }
        if (p1 == doctor.password){
            doctor.CheckF();
            doctor.CheckS();
            doctor.Pay();
            doctor.Tex();
            doctor.Receive();
            doctor.CheckT();
            doctor.CheckR();
        }else {
            System.out.println("密码错误");
        }
    }

    public static void main(String[] args){
        Doctor d1 = new Doctor("光","男",30,19045689);
        Doctor d2 = new Doctor("明","女",29,21208961);
        d1.fee = Float.parseFloat(args[0]);
        d1.salary = Float.parseFloat(args[1]);
        d2.fee = Float.parseFloat(args[2]);
        d2.salary = Float.parseFloat(args[3]);
        Event(d1);
        Event(d2);
    }
}