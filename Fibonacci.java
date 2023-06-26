public class Fibonacci {
    public static void main(String[] args) {
        for(int number: getFibonacci(9)){
            System.out.print(number + " ");
        }
    }

    public static int[] getFibonacci(int n) {
    int[] arrrayOfFibonacci = new int[n];
    arrrayOfFibonacci[0] = 0;
    arrrayOfFibonacci[1] = 1;

    for (int i = 2; i < n; i++) {
        arrrayOfFibonacci[i] = arrrayOfFibonacci[i - 1] + arrrayOfFibonacci[i - 2];
    }
    return arrrayOfFibonacci;
}

}
