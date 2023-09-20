import java.nio.ByteBuffer;
import java.nio.CharBuffer;

public class CharBufferReadWrite {
    public static void main(String[] args) {
        CharBuffer cb = CharBuffer.allocate(8);
        System.out.println("Right after creation : ");
        printBuffer(cb);
        for (int i = 65; i<73; i++ ){
            cb.put((char) i);
        }
        System.out.println("After Populating Data: ");
        printBuffer(cb);
    }
    private static void printBuffer(CharBuffer cb) {
        int limit = cb.limit();
        System.out.println("Position: " + cb.position() + "," + "limit: " + limit);
        System.out.println("Data: ");
        for (int i = 0; i < limit; i++) {
            System.out.print(cb.get(i) + " ");
        }
        System.out.println();
    }
}
