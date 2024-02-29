import java.util.ArrayList;
import java.util.List;

public class Calculator {

    public interface Operator {

        /**
         * 연산 수행 메소드
         * */
        double operate(double n1, double n2);

        /**
         * 연산자 char 리턴
         * */
        char getOperatorChar();

        /**
         * 어떤 연산인지 설명
         * */
        String describe();
    }

    private final List<Operator> operators = new ArrayList<>();

    public double calculate(double n1, double n2, int opNum) {
        if (opNum < 0 || opNum >= operators.size()) {
            throw new IllegalArgumentException("맞는 연산자가 없습니다.");
        }

        Operator operator = operators.get(opNum);

        return operator.operate(n1, n2);
    }

    public void registerOperator(Operator operator) {
        operators.add(operator);
    }

    public char getOperatorChar(int opNum) {
        if (opNum < 0 || opNum >= operators.size()) {
            throw new IllegalArgumentException("맞는 연산자가 없습니다.");
        }

        return operators.get(opNum).getOperatorChar();
    }

    public String describeAllOperators() {
        StringBuilder descriptions = new StringBuilder();

        for (int i=0; i<operators.size(); i++) {
            Operator operator = operators.get(i);
            descriptions.append(String.format(
                    "%d: %s\n", i, operator.describe()
            ));
        }

        return descriptions.toString();
    }
}
