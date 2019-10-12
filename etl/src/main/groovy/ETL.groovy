class ETL {

    static Map<String, Integer> transform(Map<String, List<String>> input) {
        
        input.inject([:]) { acc, score, letters -> 

            letters.each { acc.put(it.toLowerCase(), score as int)}

            acc as Map
        }
    }
}