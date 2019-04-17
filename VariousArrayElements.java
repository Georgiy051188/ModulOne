public class VariousArrayElements {
    public static void main(String[] args) {
        int[] array = {1, 4, 6, 1, 1, 3, 7, 9, 0};
        System.out.println(elementsArray(array));
    }

    public static int elementsArray(int[] array) {
        int res = 0;
        int various = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            various++;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] == array[i]) {
                    count++;
                }
            }
        }
        return res = various - count + 1;
    }
}
