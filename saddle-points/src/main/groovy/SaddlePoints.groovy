class SaddlePoints {

    static List<List<Integer>> getSaddlePoints(List<List<Integer>> matrix) {

        List<List<Integer>> saddlePoints = []

        if (matrix != []) {
            int rows = matrix.size()
            int cols = matrix[0].size()
            (0 .. rows - 1).each { r -> 
                (0 .. cols - 1).each { c ->
                    Closure saddle = {int row, int col -> 
                        matrix[row][col] == matrix[row].max() &&
                        matrix[row][col] == matrix.collect { rs -> rs[col] }
                                                  .min()
                    }
                    if ( saddle(r, c) ) saddlePoints << [r, c]
                }
            }
        }
        saddlePoints
    }
}