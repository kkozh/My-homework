public class arrayWithRandomValues {
    public static void main(String[] args){
        int []array = array();
        average(array);
        min(array);
        max(array);
        bubble(array);

    }


    public static int[] array(){
        int array[] = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 20);
            System.out.println(array[i]);

        }
        return array;
    }

        public static double average(int []array){

            double average = array[0];
            for (int i = 0; i < array.length; i++) {
            average += array[i];
        }
        average /= 10;
        System.out.println("Mean : " + average);
        return 0;
        }


        public static int min(int[] array) {
            int min = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] < min)
                    min = array[i];
            }
            System.out.println("Minimum value : " + min);
            return min;
        }

        public static int max(int[] array) {
            int max = array[0];
            for (int i = 0; i < array.length; i++) {
                if (array[i] > max)
                    max = array[i];
            }


            System.out.println("Maximum value : " + max);
            return max;
        }

    public static int[] bubble(int[] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {

                if (array[j] > array[j + 1]) {
                    int b = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = b;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }return array;



    }}


