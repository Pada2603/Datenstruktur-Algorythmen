public class BubbleSortString {

    public BubbleSortString() {
    }

    public String[] sortString(String[] stringArray) {
        String tmp;

        for (int i = 0; i < stringArray.length - 1; i++) {
            for (int j = 0; j < stringArray.length - 1; j++) {
                if (stringArray[j].compareTo(stringArray[j + 1]) > 0) {
                    tmp = stringArray[j];
                    stringArray[j] = stringArray[j + 1];
                    stringArray[j + 1] = tmp;
                }
            }
        }
        return stringArray;
    }


    public static void main(String[] args) {
        String str[] = {"s", "k", "c", "r", "v", "n", "b", "f", "a", "d"};
        System.out.println("Unsortiert:");
        for (String i : str) {
            System.out.println(i);
        }

        BubbleSortString bubbleSortString = new BubbleSortString();
        String[] sortString = bubbleSortString.sortString(str);

        System.out.println("Sortiert:");
        for (String i : sortString) {
            System.out.println(i);
        }
        String str2[] = {"Pata", "Peter", "Andi", "Franki", "Olaf", "Asterix", "Laura", "Christoph", "Bernd", "Xena"};
    }
}
