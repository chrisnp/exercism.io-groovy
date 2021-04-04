class NthPrime {

    static int nth(int n) {
        if (n < 1) 
            throw new ArithmeticException()        
        if (n == 1)
            return 2
        int nth = 1
        int candidate = 3
        while(nth <= n) {
            if (isPrime(candidate)) {
                nth += 1
            }
            if (nth == n) {
                return candidate
            }
            candidate += 2
        }
    }

    private static boolean isPrime(int n) {
        if (n <= 1) return false
        if (n == 2) return true
        int c = 3
        while(c <= Math.sqrt(n).intValue()) {
            if (n % c == 0) {
                return false
            }
            c += 2
        }
        return true
    }
}