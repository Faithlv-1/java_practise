package 抽象接口demo;

public abstract class people {
    public String name;
    public int age;


    public people(){}

    public people(String name,int age){
        this.name=name;
        this.age= age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract void eat();


}
