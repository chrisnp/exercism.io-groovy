class Triangle {

    boolean validTriangle = true
    int uniqSideLengths

    Triangle(Number...sides) {
        sides = sides.toList()

        boolean triangleInequality = 
            2 * sides.max() <= sides.sum()
        
        boolean degenerate = 
            sides.any { s -> s <= 0 }
        
        this.validTriangle =
            triangleInequality && 
	    !degenerate
        
        this.uniqSideLengths = 
            (sides as Set).size()
    }

    boolean isEquilateral() {
        validTriangle && 
        uniqSideLengths == 1
    }

    boolean isIsosceles() {
        validTriangle && 
        uniqSideLengths <= 2
    }

    boolean isScalene() {
        validTriangle && 
        uniqSideLengths == 3
    }
}