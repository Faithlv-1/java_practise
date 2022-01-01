package 抽象接口demo;

public abstract class 运动员 extends people implements 学习英语{
    public int num;

    public 运动员() {
    }

    public 运动员(String name, int age) {
        super(name, age);
    }

    public abstract void exe();
}
