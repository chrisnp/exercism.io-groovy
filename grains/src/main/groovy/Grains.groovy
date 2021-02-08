class Grains {
    static square(num) {
        if (num < 1 || num > 64)
            throw new ArithmeticException('bad argument')
        // 1 << num - 1 // fails for num > 2**32
        BigInteger.TWO.power(num - 1)
    }

    static total() {
        // (1 << 64) - 1 // again
        (1..64).collect { square(it) }.sum()
    }
}
