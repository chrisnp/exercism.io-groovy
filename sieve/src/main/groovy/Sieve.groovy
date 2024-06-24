class Sieve {
    static primes(Integer limit) {
        limit += 1
        def sieve = (1..limit).collect { true }
        sieve[0] = false
        for (int n = 2; n ** 2 <= limit; n++) 
            if (sieve[n]) 
                for (int m = n ** 2; m <= limit; m += n)
                    sieve[m] = false
        def primes = []
        if (limit > 2) primes << 2
        for (int candidate = 3; candidate <= limit; candidate += 2)
            if (sieve[candidate])
                primes << candidate
        primes
    }
}
