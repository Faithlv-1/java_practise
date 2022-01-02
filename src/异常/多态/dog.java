package 异常.多态;

public class dog extends Animals{
    public dog() {
    }

    public dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("dog eat");
    }

    public void show(){
        System.out.println(this.name);
        System.out.println(this.age);

    }
}
