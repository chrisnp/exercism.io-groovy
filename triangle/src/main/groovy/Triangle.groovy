class Triangle {

    private static boolean validTriangle(Number a, Number b, Number c) {

        boolean triangleInequality = 
            2 * [a, b, c].max() <= a + b + c 
            
        boolean degenerate = 
            [a, b, c].any { s -> s <= 0 }
        
        triangleInequality && !degenerate
    }

    private static int uniqSideLengths(Number a, Number b, Number c) {

        ([a, b, c] as Set).size()
    }

    static boolean isEquilateral(Number a, Number b, Number c) {
        
        validTriangle(a, b, c) && 
        uniqSideLengths(a, b, c) == 1
    }

    static boolean isIsosceles(Number a, Number b, Number c) {

        validTriangle(a, b, c) && 
        uniqSideLengths(a, b, c) <= 2
    }

    static boolean isScalene(Number a, Number b, Number c) {
        
        validTriangle(a, b, c) && 
        uniqSideLengths(a, b, c) == 3
    }
}