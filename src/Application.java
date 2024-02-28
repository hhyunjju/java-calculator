import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Application {
    public static void main(String[] args) throws IOException {
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.print("수식을 입력해주세요(종료: x) : ");

            // 수식 입력
            // 빈 입력 혹은 x 입력 시 종료
            String input = consoleReader.readLine();
            if (input.isBlank() || input.charAt(0) == 'x') {
                break;
            }

            // 결과 출력
            String result = Calculator.calculateExpression(input);
            System.out.println(result);
        }

        consoleReader.close();
    }
}
