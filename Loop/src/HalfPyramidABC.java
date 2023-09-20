public class HalfPyramidABC {
    public static void main(String[] args) {
        char ch='A';
        int i;int j;
        for (i=10; i>0; i--){
            for(j=1; j<i; j++) {
                System.out.print(ch);
            }
            ch++;
            System.out.println();
        }
    }
}
