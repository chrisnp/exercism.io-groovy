class PrimeFactors {

    static List<Long> factors(Long value) {
        
        List<Long> factors = []
        Long candidate = 2

        while (candidate <= 1 + Math.sqrt(value)) {
            while (value % candidate == 0) {
                factors << candidate
                value /= candidate
            }
            if (candidate == 2)
                candidate += 1
            else 
                candidate += 2
        }
        
        value == 1 ? factors : factors << value
    }
}