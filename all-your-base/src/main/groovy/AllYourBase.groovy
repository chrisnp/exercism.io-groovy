class AllYourBase {

    private final Integer numInBase

    AllYourBase(int inputBase, List<Integer> digits) {
        if (inputBase < 2)
            throw new ArithmeticException(
                "invalid input base"
            )
        numInBase = 
            digits.reverse().indexed().collect { i, d -> 
                if (d < 0 || d >= inputBase) 
                    throw new ArithmeticException(
                        "invalid digit in representation"
                    )
                d * inputBase ** i
            }
            .sum(0) as int     
    }

    def rebase(outputBase) {
        if (outputBase < 2)
            throw new ArithmeticException(
                "invalid output base"
            )
        List<Integer> newRepresentation = []
        int n = numInBase
        while (n > 0) {
            newRepresentation << n % outputBase
            n /= outputBase
        }
        newRepresentation.reverse()?: [0]
    }
}