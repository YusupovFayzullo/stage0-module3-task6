package lang.print.gaps.task6;

public class PrePostIncrement {
    public static void main(String[] args) {
            int a = 5;
            int b = 7;
            int c = 12;
            int d = 15;

            // use post-increment operator in the mathematical expression
            int x =   a   + b +   c   + (++d);
            System.out.println("Expected x is 40, x = " + x);
    }
}
