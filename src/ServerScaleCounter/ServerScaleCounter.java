package ServerScaleCounter;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

//Lv2 서버증설 문제.
public class ServerScaleCounter {

    public int solution(int[] players, int m, int k) {
        int answer = 0;
        int nowServer = 0;
        Queue<Integer> addServers = new LinkedList<>();

        for (int i = 0; i < players.length; i++) {
            if (i >= k) nowServer -= addServers.remove();

            int need = Math.max((players[i] / m) - nowServer, 0);
            addServers.offer(need);
            nowServer += need;
            answer += need;
        }

        return answer;
    }

    public static void main(String[] args) {
        ServerScaleCounter scaler = new ServerScaleCounter();

        int[] test1 = {0, 2, 3, 3, 1, 2, 0, 0, 0, 0, 4, 2, 0, 6, 0, 4, 2, 13, 3, 5, 10, 0, 1, 5};
        int[] test2 = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
        int[] test3 = {100, 0, 0, 0, 0, 100, 0, 0, 0, 0, 100, 0, 0, 0, 0, 100, 0, 0, 0, 0, 100, 0, 0, 0};

        System.out.println("Test 1 (Expected 7): " + scaler.solution(test1, 3, 5));
        System.out.println("Test 2 (Expected 11): " + scaler.solution(test2, 10, 2));
        System.out.println("Test 3 (Expected 12): " + scaler.solution(test3, 25, 1));
    }
}
