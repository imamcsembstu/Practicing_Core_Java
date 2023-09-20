public class Main {
    public static void main(String[] args) {

        int number = 1_000_000;
        String binary=Integer.toBinaryString(number);
        String hex=Integer.toHexString(number);
        String octal=Integer.toOctalString(number);
        System.out.println("Binary:" +binary
                            +"\nHex: "+hex
                            +"\nOctal: "+octal);
    }
}