import java.lang.Math;

public class Homework2 {

    public static void main(String[] args) {
        int array[] = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 20);
            System.out.println(array[i]);
        }


            int min = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] < min)
                    min = array[i];
            }
            int max = array[0];
            for (int i = 0; i < array.length; i++) {
                if (array[i] > max)
                    max = array[i];
            }
            System.out.println("Minimum value : " + min);
            System.out.println("Maximum value : " + max);






            for (int i = 0; i < array.length; i++) {
                int num = array[i];

                for (int j = i - 1; j >= 0; j--) {
                    int leftNumber = array[j];

                    if (num < leftNumber) {
                        array[j + 1] = leftNumber;
                        array[j] = num;
                    } else {
                        break;
                    }
                    for (Integer output : array) {
                        System.out.println(output);
                    }
                }
            }
        }
    }












