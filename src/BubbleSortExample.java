public class BubbleSortExample {

    public BubbleSortExample() {

    }

    public int[] bubbleSort(int[] array) {
        int tmp; // Zwischenspeicher

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {

        int[] array = {7, 12, 6, 8, 13, 2, 4, 14, 19, 5, 9};
        System.out.println("Unsortiert:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        System.out.println("Sortiert:");

        BubbleSortExample bubbleSortExample = new BubbleSortExample();
        int[] sortiert = bubbleSortExample.bubbleSort(array);
        for(int i = 0; i < sortiert.length; i++){
            System.out.println(sortiert[i]);
        }
    }
}
