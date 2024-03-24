
public class Array2dUtility {

    // Declare all methods as static.

    // 1. print
    // Implement a method called print that prints out the values of a 2D array of integers row by row.
    public static void print(int[][] printed){
        for(int[] row: printed){
            for(int col:row){
                System.out.println(col);
            }
        }
    }

    // 2. sum
    // Implement a method called sum that returns the sum of a 2D array of integers
    public static int sum(int[][] n){
        int sum = 0;
        for (int[] row: n){
            for(int col:row){
                sum +=col;
            }
        }
        return sum;
    }

    // 3. average
    // Implement a method called average that returns the average value of a 2D array of integers.
    // You may assume that the 2D array is a square. That is, it has the same number of rows and columns.
    // Reminder: call your sum method within the average method.
    public static double average(int[][] n){
        int sum = sum(n);
        int length = n.length * n[0].length;

        System.out.println((double)sum/length);
        return ((double) sum /length);
    }

    // 4. minimum
    // Implement a method called minimum that returns the minimum value of a 2D array of integers.
    public static int minimum(int[][]n){
        int minimum = n[0][0];
        for (int[] row: n){
            for(int col:row){
                if (col < minimum){
                    minimum = col;
                }
            }
        }
        return minimum;
    }


    // 5. maximum
    // Implement a method called maximum that returns the maximum value of a 2D array of integers.
    public static int maximum(int[][]n){
        int max = n[0][0];
        for (int[] row: n){
            for(int col:row){
                if (col > max){
                    max = col;
                }
            }
        }
        return max;
    }

    // 6. evenCountStandard
    // Implement a method called evenCountStandard that returns the number of even numbers in a 2D array of integers.
    // Use a standard for loop to implement this method.
    public static int evenCountStandard(int[][]n){
        int count = 0;
        for (int i = 0; i<n.length; i++){
            for (int j = 0; j<n[i].length;j++){
                if (n[i][j] % 2 == 0){
                    System.out.println(j);
                    count +=1;
                }
            }
        }
        System.out.println(count);
        return count;
    }


    // 7. evenCountEnhanced
    // Implement a method called evenCountEnhanced that returns the number of even numbers in a 2D array of integers.
    // Use an enhanced for loop to implement this method.
    public static int evenCountEnhanced(int[][] n){
        int count = 0;
        for (int[] col: n){
            for (int row: col){
                if (row % 2 == 0){
                    count +=1;
                }
            }
        }
        return count;
    }

    // 8. allPositive
    // Implement a method called allPositive that returns true if all the values in a 2D array of integers are positive.
    public static boolean allPositive(int[][] n){
        boolean yesno = true;
        for (int[] col: n){
            for (int row: col){
                if (row <= 0){
                    yesno = false;
                }
            }
        }
        return yesno;
    }

    // 9. rowSums
    // Implement a method called rowSums that returns a one dimensional array that contains the sum of each row at each index.
    public static int[] rowSums(int[][] n){
        int [] sum = new int[n.length];
        for (int i = 0; i<n.length; i++){
            int sums = 0;
            for (int j = 0; j<n[i].length;j++){
                sums += n[i][j];
            }
            sum[i] = sums;
        }
        return sum;
    }
    // 10. colSums
    // Implement a method called colSums that returns a one dimensional array that contains the sum of each col at each index.
    public static int[] colSums(int[][] n){
        int [] sum = new int[n.length];
        for (int i = 0; i<n.length; i++){
            int sums = 0;
            for (int j = 0; j<n[i].length;j++){
                sums += n[j][i];
            }
            sum[i] = sums;
        }
        /*
        print(n);
        for (int c: sum){
            System.out.println(c);
        }*/
        return sum;
    }
}
