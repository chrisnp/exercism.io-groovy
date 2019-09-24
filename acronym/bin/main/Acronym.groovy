class Acronym {

    static String abbreviate(String phrase) {
        
        def acronym = []

        boolean first = true

        for (ch in phrase) {
            if (/_/ =~ ch) 
                continue
            if (/ -/ =~ ch) {
                first = true
                continue
            }
            if (first) {
                acronym << ch.toUpperCase()
                first = false
            }
        }
        acronym.join()
    }
}