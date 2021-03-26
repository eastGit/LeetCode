package linklist.queue;

import java.util.ArrayList;
import java.util.List;

/**
 * Description: LeetCode 煎饼排序 969
 * Created by ldc on 2021/3/15 下午10:10.
 *
 * @author ldc
 */
public class PancakeSort1 {

    public List<Integer> pancakeSort(int[] arr) {
        List<Integer> result = new ArrayList<Integer>();
        for (int i = arr.length; i > 0; i--) {
            int index = 0;
            while (arr[index] != i) {
                index++;
            }

            if (index == i - 1) {
                continue;
            } else if (index == 0) {
                reverse(arr, i);
                result.add(i);
            } else {
                reverse(arr, index+1);
                result.add(index+1);
                reverse(arr, i);
                result.add(i);
            }
        }
        return result;
    }

    private void reverse(int[] arr, int index) {
        int start = 0, end = index - 1;
        while (start < end) {
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            start++;
            end--;
        }
    }
}
