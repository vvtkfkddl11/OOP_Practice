// numStudents 명의 학생의 실습 점수를 입력받아서 평균과 최댓값을 구하는 프로그램
import java.util.Scanner;

public class 김사랑{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final int MIN_SCORE = 0; // 실습 점수의 최소값
        final int MAX_SCORE = 100; // 실습 점수의 최댓값
        int numStudents; // 입력받은 학생 수
        int sum = 0; // 총 실습 점수
        int maxScore = 0; // 입력받은 실습 점수 중 최댓값
        double avg; // 입력받은 실습 점수의 평균값

        do {
            System.out.print("학생 수를 입력하세요: ");
            numStudents = sc.nextInt();
        } while (numStudents <= 0); // 학생 수가 0 이하이면 다시 입력받도록 처리함

        // while문을 사용하여 numStudents번 반복하면서 실습 점수를 입력받기
        int currentNum = 0;
        while (currentNum < numStudents) {
            System.out.print((currentNum+1) +"번째 학생의 실습 점수: ");
            int score = sc.nextInt();

            // 미흡한 구현 코드 부분 1) 입력받은 실습 점수가 유효한 범위인지 검사하는 조건문 작성 (단, MIN_SCORE, MAX_SCORE 활용해야됨)
            if (score<0 || score>100) {
                System.out.println("잘못된 점수입니다. 다시 입력하세요.");
            } else {
                sum += score; // 입력받은 실습 점수를 sum에 더함
                currentNum++; // 입력된 점수의 조건이 맞지 않을 경우 다시 입력받음

                // 미흡한 구현 코드 부분 2) 입력받은 실습 점수 중 최댓값(maxScore) 구하는 코드 작성
                while (score > maxScore) {
                    maxScore = score;
                }
            }
        }
        sc.close(); // Scanner 객체 닫기

        // 미흡한 구현 코드 부분 3) 평균값 계산하는 변수 할당(단, avg 활용해야됨)
        avg = (double)sum/numStudents;

        System.out.printf("평균: %.2f \n", avg); // 평균값 출력하기(소수 둘째자리값까지 정확한 값)
        System.out.println("최댓값: " + maxScore); // 최댓값 출력하기
    }
}
