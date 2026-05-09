package practicetest;

public class excectioninjava {
    
    public static void countNumber(int[] q, int n) {

        try {

            int count = 0;

            for (int i = 0; i < n; i++) {

                int sum = 0;

           
                for (int j = 0; j < n; j++) {

                    if (i != j) {
                        sum += q[j];
                    }
                }

                if (sum % q[i] == 0) {
                    count++;
                }
            }

            System.out.println(count);

        } catch (ArithmeticException e) {

            System.out.println(e);
        }
}
}