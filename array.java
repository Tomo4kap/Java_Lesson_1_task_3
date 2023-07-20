// Дан массив nums = [3,2,4,3, 1, 3, 3, 5] и число val = 3. 
// Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива. 
// Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, 
// а остальные - равны ему.


// [3,2,4,3,1,3,3,5]
// [2,4,1,5,3,3,3,3]

import java.util.Arrays;

public class array {
    public static void Array(String[] args)
    {
        int arr[] = {3, 2, 4, 3, 1, 3, 3, 5};
        int val = 3;

        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != val) {
                arr[index] = arr[i];
                index++;
            }
        }
        for (int i = index; i < arr.length; i++) {
            arr[i] = val;
        }

        System.out.println(Arrays.toString(arr));
    }
}