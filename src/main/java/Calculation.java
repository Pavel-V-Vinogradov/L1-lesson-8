public class Calculation {
    private static final char[] operands = new char[]{'+', '-', '/', '*'};

    public static String calc(String statement) {
        int findPosoperand = 0;
        char operand = 0;
        for (char o : operands) {
            operand = o;
            findPosoperand = statement.indexOf(operand);
            if (findPosoperand > 0) {
                break;
            }
        }
        if (findPosoperand > 0) {
            Double firstNumber = Double.parseDouble(statement.substring(0, findPosoperand));
            Double secondNumber = Double.parseDouble(statement.substring(findPosoperand + 1, statement.length()));
            switch (operand) {
                case '+':
                    return String.valueOf(firstNumber + secondNumber);
                case '-':
                    return String.valueOf(firstNumber - secondNumber);
                case '*':
                    return String.valueOf(firstNumber * secondNumber);
                case '/': {
                    if (secondNumber == 0) {
                        return statement;
                    }
                    return String.valueOf(firstNumber / secondNumber);
                }
            }
        }
        return statement;
    }
}
