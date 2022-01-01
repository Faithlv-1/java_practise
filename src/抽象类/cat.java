package 抽象类;

public class cat extends Animals{
    public cat(){

    }

    public cat(String name,int age){
        this.name=name;
        this.age= age;

    }

    @Override
    public void eat() {
        System.out.println("cat eat");
    }

    public void show(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}
