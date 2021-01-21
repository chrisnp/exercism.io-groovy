class CollatzConjecture {

    static int steps(int number) {
        
        if (number <= 0) {
            throw new ArithmeticException(
                "error: neg int or zero"
            )
        }

        int nsteps = 0

        while (number > 1) {
            number = 
                number % 2 == 0 ? 
                number / 2 : 
                (3 * number) + 1
            
            nsteps++
         }
         nsteps
    }
}