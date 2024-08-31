public class BigOSingleLoop {

    public static void main(String[] args) {

        int numberOfOperations=0;
        int n=100000; //size of data
        int m = 500;
        long startTime;
        long endTime;

        System.out.println("input size n is: " + n);

        //*****Task-1 Single Loop.......O(n)
        startTime = System.currentTimeMillis();
        for(int i=0; i<n; i++) numberOfOperations+= 1;
        endTime = System.currentTimeMillis();
        System.out.println("Number of operations with single loop: " + numberOfOperations + " in " + (endTime-startTime) + " miliseconds");

        //*****Task-2 Nested Loop.......O(n2)
        numberOfOperations = 0;
        startTime = System.currentTimeMillis();
        for (int j = 0; j<n; j++) {
            for(int i=0; i<n; i++){
                numberOfOperations+=1;
            }
        }
        endTime = System.currentTimeMillis();
        System.out.println("Number of operations with nested loop: " + numberOfOperations + " in " + (endTime-startTime) + " miliseconds");

        //*****Task-3 Three Nested Loop.......O(n3)
        numberOfOperations = 0;
        startTime = System.currentTimeMillis();
        for (int j = 0; j<n; j++) {
            for(int i=0; i<n; i++){
                for (int k = 0 ; k < n ; k++) {
                    numberOfOperations+=1;
                }
            }
        }
        endTime = System.currentTimeMillis();
        System.out.println("Number of operations with three nested loop: " + numberOfOperations + " in " + (endTime-startTime) + " miliseconds");

        //*****Task-4 N and M Nested Loops.......O(n*m)
        numberOfOperations = 0;
        startTime = System.currentTimeMillis();
        for (int j = 0; j<n; j++) {
            for(int i=0; i<m; i++){
                numberOfOperations+=1;
            }
        }
        endTime = System.currentTimeMillis();
        System.out.println("Number of operations with nested loop n*m: " + numberOfOperations + " in " + (endTime-startTime) + " miliseconds");

        //*****Task-4.1 N and M Consecutive Loops.......O(n+m)
        numberOfOperations = 0;
        startTime = System.currentTimeMillis();
        for (int j = 0; j<n; j++) {
            numberOfOperations+=1;
        }
        for(int i = 0; i < m; i++) {
            numberOfOperations+=1;
        }
        endTime = System.currentTimeMillis();
        System.out.println("Number of operations with nested loop n4m: " + numberOfOperations + " in " + (endTime-startTime) + " miliseconds");

        //*****Task-5 Logarithmic complexity.......
        numberOfOperations = 0;
        startTime = System.currentTimeMillis();
        for(int i=1; i<n; i*=2) numberOfOperations+= 1;
        endTime = System.currentTimeMillis();
        System.out.println("Number of operations with logarithmic: " + numberOfOperations + " in " + (endTime-startTime) + " miliseconds");


        //update

    }
}
