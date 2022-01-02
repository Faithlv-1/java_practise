package 异常.多态;

public class cat extends Animals{
    public cat() {

    }

    public cat(String name, int age) {
        super(name, age);
    }

    public cat(String name,int age,int sex){
        this.name=name;
        this.age=age;
        this.sex=sex;

    }
    @Override
    public void eat() {
        System.out.println("cat eat");
    }

    public void show(){
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.sex);

    }
}
