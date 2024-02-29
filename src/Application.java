import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Application {
    public static void main(String[] args) throws IOException {
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));

        Calculator calculator = new Calculator();

        //TODO 만든 연산자 등록
        //calculator.registerOperator(....);

        String operatorOptions = calculator.describeAllOperators();

        while (true) {
            System.out.println(operatorOptions);
            System.out.println("종료: x");

            String input = consoleReader.readLine();

            if (input.isBlank() || input.charAt(0) == 'x') {
                break;
            }

            int opNum = Integer.parseInt(input);
            char operatorChar = calculator.getOperatorChar(opNum);

            System.out.print("num1: ");
            double n1 = Double.parseDouble(consoleReader.readLine());
            System.out.print("num2: ");
            double n2 = Double.parseDouble(consoleReader.readLine());

            double result = calculator.calculate(n1, n2, opNum);

            System.out.printf("%f %c %f = %f\n",
                    n1, operatorChar, n2, result
            );
        }

        consoleReader.close();
    }
}
