import java.util.*;

public class main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> liststr = new ArrayList<>();

        int inputint = 1;
        String inputstr = "";
        System.out.print("Enter S to sort a list of Strings or I to sort a list of Integers: ");
        String choice = in.nextLine();
        if (choice.equals("s") || choice.equals("S")){
            System.out.print("Enter an Strings to add to the list(Enter exit to quite): ");

            while (!inputstr.equals("exit")) {
                inputstr = in.nextLine();
                if (inputstr.equals("exit")) {
                    break;
                } else {
                    liststr.add(inputstr);
                }
            }

            String[] arr = new String[liststr.size()];
            int i = 0;
            for (String x : liststr) {
                arr[i] = x;
                i++;
            }
            String[] sortedArray = stringSort(arr);

            System.out.print(Arrays.toString(sortedArray));
        }else {
            System.out.print("Enter an Integers to add to the list(Enter -1 to quite): ");

            while (inputint > 0) {
                inputint = in.nextInt();
                if (inputint < 0) {
                    break;
                } else {
                    list.add(inputint);
                }
            }

            int[] arr = new int[list.size()];
            int i = 0;
            for (Integer x : list) {
                arr[i] = x;
                i++;
            }
            int[] sortedArray = quickSort(arr, 0, arr.length - 1);

            System.out.print(Arrays.toString(sortedArray));
        }
    }


    public static int[] quickSort(int[] list, int li, int ui) {
        if (li < ui) {
            int pivot = list[ui];
            int i = (li - 1);

            for (int l = li; l <= ui - 1; l++) {
                if (list[l] < pivot) {
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


    public static String[] stringSort(String[] list) {

        int size = list.length;
        for(int i = 0; i<size-1; i++)
        {
            for (int j = i+1; j< list.length; j++)
            {

                if(list[i].toLowerCase().compareTo(list[j].toLowerCase())>0)
                {

                    String temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
        }


        return  list;
    }

}
