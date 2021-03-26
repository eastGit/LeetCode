package linklist.queue;

import java.util.ArrayList;
import java.util.List;


/**
 * Description: LeetCode 煎饼排序 969
 * Created by ldc on 2021/3/12 下午9:31.
 *
 * @author ldc
 */
public class PancakeSort {

    public List<Integer> pancakeSort(int[] arr) {
        List<Integer> result = new ArrayList<Integer>();
        int[] index = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            index[arr[i]] = i;
        }
        for (int i = arr.length; i > 1; i--) {
            if (index[i] + 1 != 1) {
                result.add(index[i] + 1);
                reverse(arr, index[i] + 1, index);
            }

            if (i != 1) {
               result.add(i);
               reverse(arr, i, index);
            }

        }


        return result;
    }

    private void reverse(int[] arr, int n, int[] index) {
        for (int i = 0, j = n - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            index[arr[i]] = i;
            index[arr[j]] = j;
        }

    }

    public static void main(String[] args) {
        PancakeSort pancakeSort = new PancakeSort();
        int[] arr = new int[]{3,2,4,1};
        System.out.println(pancakeSort.pancakeSort(arr));
    }
}
