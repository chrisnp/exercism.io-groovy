class RunLengthEncoding {

    static String encode(String input) {
        input
        .replaceAll(/(\D)\1+/) { 
            "${it[0].length()}${it[1]}" 
        }
    }

    static String decode(String input) {
        input
        .replaceAll(/(\d+)(\D)/) { 
            it[2] * (it[1] as int) 
        }
    }
}