import java.util.Scanner;
import utils.*;
public class scanner {

    public static void main(String[]args){
        String name;
        int opIndex;
        boolean flag = true;
        boolean wedStatus;
        Scanner input = new Scanner(System.in);
        System.out.println("**********欢迎光临婚姻状态检测系统**********\n");
        System.out.println("请选择您要执行的操作序号（必须为1或者2）\n");
        System.out.println("1：查询个人婚姻状况信息\n");
        System.out.println("2：残忍退出系统\n");
        while( flag ) {
            System.out.println("请输入您要执行的操作序号：");

            opIndex = input.nextInt();
            if(opIndex == 1){
                System.out.println("请输入您要查询的姓名：");
                name  = input.next();
                wedStatus = tool.isWedding(name);
                if(wedStatus){
                    System.out.println(name+"结婚了，哎！！");
                }else{
                    System.out.println(name+"还是一个单身狗，加油把！");
                }
            }else{
                System.out.println("感谢您的使用，欢迎下次继续光临^_^!!");
                flag = false;
            }
        }
    }

}
