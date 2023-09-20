public class CharStackDemo {
    public static void main(String[] args) {
        CharStack stack = new CharStack();
        stack.push('a');
        stack.push('b');
        stack.push('c');
        stack.push('d');
        stack.push('e');
        stack.push('f');


        stack.printElements();
        stack.pop();
        stack.pop();
        stack.printElements();
    }

}
