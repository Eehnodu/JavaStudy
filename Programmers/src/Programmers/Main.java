package Programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String args[]) {
        // 첫 번째 방식: 배열 직접 생성 후 출력
        long startTime1 = System.currentTimeMillis();
        int start = 3, end = 10;
        int[] arr = new int[end - start + 1];
        for (int i = start, j = 0; i <= end; i++, j++) {
            arr[j] = i;
        }
        System.out.println(Arrays.toString(arr));
        long endTime1 = System.currentTimeMillis();
        System.out.println("첫 번째 방식 소요 시간: " + (endTime1 - startTime1) + "ms");

        // 두 번째 방식: List를 이용하여 생성 후 출력
        long startTime2 = System.currentTimeMillis();
        List<Integer> list = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            list.add(i);
        }
        int[] arr2 = list.stream().mapToInt(Integer::intValue).toArray();
        System.out.println(Arrays.toString(arr2));
        long endTime2 = System.currentTimeMillis();
        System.out.println("두 번째 방식 소요 시간: " + (endTime2 - startTime2) + "ms");
    }
}
