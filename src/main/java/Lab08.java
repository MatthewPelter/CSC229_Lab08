public class Lab08 {
    static boolean isPrime(int x) {
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    static int sumOfAllPrimeWithThree(int n) {
        int sum = 0;
        boolean isPrime = true;
        for (int i = 2; i <= n; i++) {
            if (isPrime(i) && hasThree(i)) {
                sum += i;
            }
        }
        
        return sum;
    }
    
    static boolean hasThree(int x) {
        while(x > 0) {
            if (x % 10 == 3) {
                return true;
            }
            x /= 10;
        }
        
        return false;
    }
    
    public static void main(String[] args) {
        System.out.println(sumOfAllPrimeWithThree(100));
    }
}
