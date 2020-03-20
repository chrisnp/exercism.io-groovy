class Triangle {

    static boolean validTriangle(Number a, b, c) {
        boolean triangleInequality = 
            2 * [a, b, c].max() <= a + b + c 
        boolean degenerate = 
            [a, b, c].any { s -> s <= 0 }
        triangleInequality && !degenerate
    }

    static int uniqSideLengths(Number a, b, c) {

        ([a, b, c] as Set).size()
    }

    static boolean isEquilateral(Number a, b, c) {
        
        validTriangle(a, b, c) && 
        uniqSideLengths(a, b, c) == 1
    }

    static boolean isIsosceles(Number a, b, c) {

        validTriangle(a, b, c) && 
        uniqSideLengths(a, b, c) <= 2
    }

    static boolean isScalene(Number a, b, c) {
        
        validTriangle(a, b, c) && 
        uniqSideLengths(a, b, c) == 3
    }
}