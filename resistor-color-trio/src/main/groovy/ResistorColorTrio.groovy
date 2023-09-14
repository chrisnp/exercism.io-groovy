class ResistorColorTrio {

    static final colors = [ 'black', 'brown', 
                            'red', 'orange', 
                            'yellow', 'green',
                            'blue', 'violet', 
                            'grey', 'white' ]

    static String label(List<String> colorsInput) {

        def (tens, ones, zeros) = 
                colorsInput.collect { c -> colors.indexOf(c) } 
        
        int resistance = "${tens}${ones}${'0'.multiply(zeros)}" as int
        
        resistance >= 1000  ? "${resistance / 1000} kiloohms" 
                            : "${resistance} ohms"
    }
}