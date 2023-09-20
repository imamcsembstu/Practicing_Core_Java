package FinallyException;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        FinallyBlockDemo finallyBlockDemo =new FinallyBlockDemo();
        finallyBlockDemo.readFile("text.txt");
    }
}