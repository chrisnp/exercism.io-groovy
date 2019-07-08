class SaddlePoints {

    static List<List<Integer>> getSaddlePoints(List<List<Integer>> matrix) {

        List<List<Integer>> saddlePoints = []

        if (matrix != []) {
            int rows = matrix.size()
            int cols = matrix[0].size()
            (0 .. rows - 1).each { r -> 
                (0 .. cols - 1).each { c ->
                    if (matrix[r][c] == matrix[r].max() &&
                        matrix[r][c] == matrix.collect { rs -> rs[c] }
                                              .min())
                            saddlePoints << [r, c]
                }
            }
        }
        saddlePoints
    }
}