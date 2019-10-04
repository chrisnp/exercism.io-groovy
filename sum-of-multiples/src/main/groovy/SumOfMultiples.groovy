class SumOfMultiples {

    static int sum(List<Integer> factors, int limit) {
        
        (1..<limit).findAll {
            f -> factors.any { it != 0 && f % it == 0 }
        }.sum() ?: 0
    }
}