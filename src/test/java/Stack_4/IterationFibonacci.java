package Stack_4;

public class IterationFibonacci {

    public static void main(String[] args) {
        System.out.println(fibonacci(0));
        System.out.println(fibonacci(1));
        System.out.println(fibonacci(2));
        System.out.println(fibonacci(3));
        System.out.println(fibonacci(4));
        System.out.println(fibonacci(5));
        System.out.println(fibonacci(6));
        System.out.println(fibonacci(7));
        System.out.println(fibonacci(8));
        System.out.println(fibonacci(9));
    }

    static int fibonacci(int number) {
        if(number < 0) return -1;
        if(number == 0) return 0;
        if(number == 1) return 1;

        int m=0;
        int sum=1;

        for (int i = 2; i <= number ; i++) {
            sum = sum+m;
            m = sum-m;
        }
        return sum;
    }

}
