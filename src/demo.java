public class demo {
    public static void main(String[] args) {
        int[] a={1,2,3};
        try {
            a[3]=2;
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }

        System.out.println("asd");
    }
}
