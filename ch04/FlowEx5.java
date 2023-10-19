import java.util.*;
class FlowEx5 {
    public static void main(String[] args) {
        int score = 0;
        char grade = ' ', opt = '0';

        System.out.print("점수를 입력해주세요.>");

        Scanner scanner = new Scanner(System.in);
        score = scanner.nextInt(); // 화면을 통해 입력받은 점수를 score에 저장

        System.out.printf("당신의 점수는 %d입니다.%n", score);

        if (score >= 90) {
            grade = 'A';
            if (score >= 98){
                opt = '+';
            } else if (score < 94) {
                opt = '-';
            }
        } else if (score >= 80) {
            grade = 'B';
            if (score >= 88) {
                opt = '+';
            } else if (score < 84) {
                opt = '-';
            }
        } else {
            grade = 'C';
        }
        System.out.printf("당신의 학점은 %c%c입니다.%n", grade, opt);
        // println으로 하니 오류가 생겼다.
        // print : 괄호안 내용을 단순히 출력. 개행문자(=줄바꿈문자=\n) 포함안됨.
        // printf : C에서의 printf와 동일. %d(정수형), %s(문자열), %c(문자형), %n(줄바꿈), %f(실수형) %b(boolean) 등을 쓰기위해 사용. 개행문자 포함.
        // println : 괄호안 내용을 출력한 후 마지막에 개행문자가 포함되어 있어 출력후 한 줄 띄워짐.
    }
}