public class BracketBalancedCheckerDemo {
    public static void main(String[] args) {
        String[] brackets = {
             "()",
             "()))",
             "((()",
             "((()))",
             "(((())))"
        };

        BracketBalancedChecker checker = new BracketBalancedChecker();

        for(String bracket : brackets){
            if (checker.isBalanced(bracket)){
                System.out.println(bracket+"  bracket is balanced.");
            }else {
                System.out.println(bracket+"  bracket is not balanced.");
            }

        }

    }
}
