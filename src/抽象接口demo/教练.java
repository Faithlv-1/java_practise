package 抽象接口demo;

public abstract class 教练 extends people implements 学习英语 {

    public 教练() {
    }

    public 教练(String name, int age) {
        super(name, age);
    }

    public abstract void tea();
}
