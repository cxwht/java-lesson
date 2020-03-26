import java.util.Scanner;

public class calc {
    static Scanner sc = new Scanner(System.in);
    static boolean flag = true;
    public static void main(String[] args) {
        init();
        while(flag) {
            get(cal());
        }
    }
    public static void init() {
        System.out.println("*********欢迎使用计算器************");
        System.out.println("1：加法运算");
        System.out.println("2：减法运算");
        System.out.println("3：乘法运算");
        System.out.println("4：除法运算");
        System.out.println("5： 退出\n");
    }
    public static int cal() {
        int op;
        System.out.println("请输入你要执行的操作");
        op = sc.nextInt();
        return op;
    }
    public static double round(double value){
        return Math.round(value*100)/100.0;
    }
    public static void foo(int op) {
        double x,y,res = 1.2;
        switch(op) {
            case 1:
                System.out.println("请输入第一个加法数");
                x = sc.nextDouble();
                System.out.println("输入第二个加法数");
                y = sc.nextDouble();
                x = isfloat(x);
                y = isfloat(y);
                res = x + y;
                break;
            case 2:
                System.out.println("请输入第一个减法数");
                x = sc.nextDouble();
                System.out.println("输入第二个减法数");
                y = sc.nextDouble();
                x = isfloat(x);
                y = isfloat(y);
                res = x - y;
                break;
            case 3:
                System.out.println("请输入第一个乘法数");
                x = sc.nextDouble();
                System.out.println("输入第二个乘法数");
                y = sc.nextDouble();
                x = isfloat(x);
                y = isfloat(y);
                res = x * y;
                break;
            case 4:
                System.out.println("请输入第一个除法数");
                x = sc.nextDouble();
                System.out.println("输入第二个除法数");
                y = sc.nextDouble();
                x = isfloat(x);
                y = isfloat(y);
                if (x % 0.1 == 0) {
                    x = x;

                } else {
                    System.out.println(x+"  test");
                    x = (x/10);
                }
                System.out.println(x);
                if (y == 0) {
                    System.out.println("除数不能为0！请重新开始");
                }
                res = x / y;
                break;
            default:
                break;
        }
        System.out.println("结果为"+res);
        init();
    }
    public static void get(int op) {
        switch(op) {
            case 1:
                foo(1);
                break;
            case 2:
                foo(2);
                break;
            case 3:
                foo(3);
                break;
            case 4:
                foo(4);
                break;
            case 5:
                System.out.println("再见");
                flag = !flag;
                break;
            default:
                System.out.println("请输入正确的字符!!");
        }
    }
    public static double isfloat(double x) {
        String s = Double.toString(x);
        int pos = s.indexOf('.');
        if(pos != -1){
            if(s.length() > pos + 2) {
                x = Double.parseDouble(s)*10 %10;
                x = round(x);
                System.out.println(x);
            }else {
                x = Double.parseDouble(s);
                System.out.println(x);
            }
        } else {
            x = Double.parseDouble(s);
            System.out.println(x);
        }
        return (double)x;
    }
}
