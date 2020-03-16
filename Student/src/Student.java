public class Student {
    int id;
    String name;
    int age;
    String address;
    public int sleepCount = 0;
    public int studyCount = 0;

    // 方法定义
    public void study() {
        name = this.name;
        if ( sleepCount == 0 && studyCount == 0) {
            System.out.println(name+"去上早上的课");
            studyCount++;
        } else if (sleepCount > 0 && studyCount >= 1) {
            System.out.println("上课睡醒");
            studyCount++;
            sleepCount--;
        } else if (studyCount - sleepCount >= 1) {
            System.out.println("去上下午的课");
        }
    }

    public void sleep() {
        sleepCount++;
        System.out.println("睡了");
    }

    public void stuInfo() {
        System.out.println("该生的编号为"+this.id);
        System.out.println("该生的名字为"+this.name+"");
        System.out.println("该生的年龄为"+this.age+"");
        System.out.println("该生的地址为"+this.address);
    }




    // 对象
    public Student() {
        System.out.println("对象实例化成功，但是无属性值");
    }
    public Student(int id, String name, int age, String address) {
        System.out.println("对象创建完成");
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }
}
