import java.util.*;

public class main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int input = 1;
        System.out.printf("Enter an Integers to add to the list(Enter -1 to exit): ");

        while(input > 0){
            input = in.nextInt();
            if(input < 0){
                break;
            }else{
                list.add(input);
            }
        }

        int[] arr = new int[list.size()];
        int i = 0;
        for (Integer x: list) {
            arr[i] = x;
            i++;
        }
        int[] sortedArray = quickSort(arr, 0, arr.length - 1);

        System.out.print(Arrays.toString(sortedArray));
    }



    public static int[] quickSort(int[] list,int li,int ui){
        if (li < ui) {
            int pivot = list[ui];
            int i = (li - 1);

            for (int l = li; l <= ui - 1; l++)
            {
                if (list[l] < pivot)
                {
                    i++;
                    int temp = list[i];
                    list[i] = list[l];
                    list[l] = temp;
                }
            }

            int temp = list[i + 1];
            list[i + 1] = list[ui];
            list[ui] = temp;

            int pi = (i + 1);

            quickSort(list, li, pi - 1);
            quickSort(list, pi + 1, ui);
        }

        return list;
    }
}
