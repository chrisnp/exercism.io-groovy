class NthPrime {

    static int nth(int n) {
        if (n < 1) 
            throw new ArithmeticException()
        
        if (n == 1)
            return 2
        
        int count = 1
        
        for (int candidate = 3; count <= n; candidate += 2) {
            if (isPrime(candidate)) {
                count += 1
            }
            if (count == n) {
                return candidate
            }
        }
    }

    private static boolean isPrime(int n) {
        if (n <= 1) return false
        if (n == 2) return true
        for (int i = 3; i <= Math.sqrt(n).intValue(); i += 2) {
            if (n % i == 0) {
                return false
            }
        }
        return true
    }
}