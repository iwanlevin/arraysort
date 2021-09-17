import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class mainTest {

    @Test
    public void quickSort() {
        boolean ordered = true;
        int[] arr = {5, 1, 3, 7, 2, 8, 22, 4, 55};
        int[] sortedarr = new int[arr.length];
        sortedarr = main.quickSort(arr, 0, arr.length - 1);
        int[] ans = {1, 2, 3, 4, 5, 7, 8, 22, 55};
        Assertions.assertArrayEquals(ans, sortedarr);

    }

    @Test
    public void stringSort() {
        boolean ordered = true;
        String[] arr = {"Lemon", "Kiwi", "Apple", "Orange", "Watermelon", "Banana", "Peach", "plum", "strawberry"};
        String[] sortedarr = new String[arr.length];
        sortedarr = main.stringSort(arr);
        String[] ans = {"Apple", "Banana","Kiwi", "Lemon", "Orange", "Peach", "plum", "strawberry", "Watermelon"};
        Assertions.assertArrayEquals(ans, sortedarr);
    }
}

