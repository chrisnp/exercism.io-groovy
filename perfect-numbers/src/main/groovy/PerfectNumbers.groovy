class PerfectNumbers {

    static Classification classify(int num) {
        if (num <= 0) 
            throw new ArithmeticException("not a natural number")
        int aliquot = (num == 1) ? 0 :
                      (1 .. Math.floor(num / 2)).findAll { n -> num % n == 0}
                                                .sum(0) as int
        switch (aliquot) {
            case { it < num }:
                return Classification.DEFICIENT
            case { it > num }:
                return Classification.ABUNDANT
            case { it == num }:
                return Classification.PERFECT 
            default :
                throw new ArithmeticException("classification error")
        } 
    }
}