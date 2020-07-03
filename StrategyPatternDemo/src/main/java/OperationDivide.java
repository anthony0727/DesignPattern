public class OperationDivide implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
//        int num = 0;
//        try {
//            num = num1 / num2;
//        } catch (ArithmeticException e) {
//            e.printStackTrace();
//            throw e;
//        }
        return num1 / num2;
    }
}
