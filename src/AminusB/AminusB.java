package AminusB;
import java.util.*;

/*이건 그냥 백준 사이트가 컴파일을 어떻게 하는지 확인하기 위해 풀어본 문제*/
public class AminusB {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("A를 입력 : ");
            int A = scanner.nextInt();

            System.out.print("B를 입력 : ");
            int B = scanner.nextInt();

            System.out.println(A-B);
            scanner.close();
        }

}
