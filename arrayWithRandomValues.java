public class arrayWithRandomValues {
    public static void main(String[] args) {
        int array[] = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 20);
            System.out.println(array[i]);

        }


        double average = 0;
        for (int i = 0; i < array.length; i++) {
            average += array[i];
        }
        average /= 10;
        System.out.println("Mean : " + average);



            int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];
        }
            System.out.println("Minimum value : " + min);



        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
        }


        System.out.println("Maximum value : " + max);



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
            System.out.println(array[i]);
        }
    }}