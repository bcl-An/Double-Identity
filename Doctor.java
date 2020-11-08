import java.text.DecimalFormat;

public class Doctor implements Student, Teacher {
    String name,sex;
    int age,password;
    double fee,salary,tex,remain;
    Doctor(String na,String se,int ag,int pa){
        name = na; sex = se; age = ag; password = pa;
    }

    public void Show(){
        System.out.println(name+"，请输入密码:");
    }

    public void Pay() {
        remain = remain-fee;
    }

    public void Tex(){
        tex = (salary-fee-5000)*coe;
    }

    public void Receive() {
        remain = remain+salary-tex;
    }

    public void CheckF() {
        System.out.println("学费："+String.format("%.2f",fee));
    }

    public void CheckS() {
        System.out.println("薪水："+String.format("%.2f",salary));
    }

    public void CheckT(){
        System.out.println("纳税："+String.format("%.2f",tex));
    }

    public void CheckR(){
        System.out.println("余额："+String.format("%.2f",remain));
    }
}