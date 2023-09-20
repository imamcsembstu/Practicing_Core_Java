public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int x=20;
        int y=30;
        x= x^y;
        System.out.println("x= x^y: "+x);
        y=x^y;
        System.out.println("y= x^y: "+y);
        x=x^y;
        System.out.println("x= x^y: "+x);

    }
}