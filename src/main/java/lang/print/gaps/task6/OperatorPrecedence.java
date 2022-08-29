package lang.print.gaps.task6;

public class OperatorPrecedence {
    public static void main(String[] args) {
          boolean fourthBool = 4 <= 101;
        int varSix = 17;

        System.out.println(firstBool && secondBool || thirdBool && fourthBool || (varSix = 5) > 0);
        System.out.println(firstBool && secondBool || thirdBool && fourthBool || (varSix = 5) < 0);
        System.out.println(varSix);
    }
}
