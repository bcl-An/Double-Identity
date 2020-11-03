import java.text.DecimalFormat;

public class Doctor implements Student, Teacher {
    String name,sex,password;
    int age;
    double fee,salary,remain;
    Doctor(String na,String se,int ag,String pa){
        name = na; sex = se; age = ag; password = pa;
    }

    public void show(){
        System.out.println(name+"，请输入密码:");
    }

    public void deposit(double m){
        remain = remain+m;
    }

    public void pay() {
        remain = remain-fee;

    }

    public void receive() {
        remain = remain+salary/12;
    }

    public void checkR(){
        System.out.println("余额："+String.format("%.2f",remain));
    }

    public void checkF() {
        System.out.println("学费："+String.format("%.2f",fee));
    }

    public void checkS() {
        System.out.println("薪水："+String.format("%.2f",salary));
    }
}