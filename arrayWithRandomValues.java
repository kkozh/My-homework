public class ArrayWithRandomValues {
    public static void main(String[] args){
        int []array = array();
        getArrayAverage(array);
        getArrayMin(array);
        getArrayMax(array);
        bubbleSorting(array);

    }


    public static int[] array(){
        int array[] = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 20);
            System.out.println(array[i]);

        }
        return array;
    }

        public static double getArrayAverage(int[] array) {

        double average = array[0];
        for (int i = 0; i < array.length; i++) {
            average += array[i];
        }
        average = average / array.length;

        System.out.println("Mean : " + average);
        return average;
    }


        public static int getArrayMin(int[] array) {
            int min = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] < min)
                    min = array[i];
            }
            System.out.println("Minimum value : " + min);
            return min;
        }

        public static int getArrayMax(int[] array) {
            int max = array[0];
            for (int i = 0; i < array.length; i++) {
                if (array[i] > max)
                    max = array[i];
            }
            System.out.println("Maximum value : " + max);
            return max;
        }

    public static int[] bubbleSorting(int[] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {

                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
        return array;
    }
}
