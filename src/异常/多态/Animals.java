package 异常.多态;

public class Animals {
    public String name;
    public int age;
    public int sex;
    public Animals(){}

    public Animals(String name,int age){
        this.name=name;
        this.age = age;
    }

    public void eat(){
        System.out.println("animals eat");
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

    public void show1(){
        System.out.println(this.name);
        System.out.println(this.age);
    }




}
