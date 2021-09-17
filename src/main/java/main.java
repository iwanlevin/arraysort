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

    }


    public static int[] quicksort(int[] list,int li,int ui){
        return list;
    }
}
