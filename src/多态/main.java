package 多态;

public class main {
    public static void main(String[] args) {
        Animals a = new cat("asd",1,1);
        cat b = (cat)a;
        b.show();

    }
}
