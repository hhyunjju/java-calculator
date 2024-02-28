public class Calculator {

    /**
     * 수식을 입력받아 계산 결과를 정해진 포맷의 문자열로 만들어 준다.
     *
    * @param exp 수식
     * @return 수식 계산 결과 "{수식} = {결과}"
    * */
    public static String calculateExpression(String exp) {

        // 수식에서 피연산자와 연산자 추출
        double[] operands = extractOperands(exp);
        char operator = extractOperator(exp);

        // 계산
        double result = calculate(operands[0], operands[1], operator);

        // 출력 형식에 맞춰서 문자열 리턴
        return formatResult(exp, result);
    }

    private static double[] extractOperands(String exp) {
        // TODO 1
        // 입력 받은 수식에서 피연산자 2개를 추출한다.
        return new double[2];
    }

    private static char extractOperator(String exp) {
        // TODO 2
        // 입력 받은 수식에서 연산자를 추출한다.
        return ' ';
    }

    private static String formatResult(String exp, double result) {
        // TODO 3
        // "{exp} = {result}" 형태로 문자열 만들어서 리턴한다.
        return "";
    }

    private static double calculate(double n1, double n2, char operator) {
        return switch (operator) {
            case '+' -> n1 + n2;
            case '-' -> n1 - n2;
            case '*' -> n1 * n2;
            case '/' -> n1 / n2;
            default -> throw new IllegalArgumentException("잘못된 연산자 입니다.");
        };
    }
}
