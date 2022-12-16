public class FindTheSmallest {

        public FindTheSmallest() {
        }

        public int smallest(int[] a) {
            int smallest = a[0];

            for (int i = 1; i < a.length; i++) {
                if (smallest > a[i]) {
                    smallest = a[i];
                }
            }
            return smallest;
        }

        public static void main(String[] args) {
            int[] numbers = {10, 30, -20, 55, 21, -15, 66, -200};
            FindTheSmallest beispielAlgorithmus = new FindTheSmallest();
            System.out.println(beispielAlgorithmus.smallest(numbers));

        }
    }


