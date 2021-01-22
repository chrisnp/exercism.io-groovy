class PhoneNumber {

    private static final NANP = 
        ~/^1?([2-9]\d{2})([2-9]\d{2})(\d{4})$/
     
    static String clean(String input) {

        String number
        String areaCode
        String xchange 
        String subscriber 

        def matcher = 
            (input.replaceAll(/\D+/, '') =~ NANP)

        if (matcher) {
            areaCode = 
                matcher.group(1)
            xchange = 
                matcher.group(2)
            subscriber = 
                matcher.group(3)
            number = 
                "${areaCode}${xchange}${subscriber}"
        }
        else {
            throw new Exception()
        }
        number
    }
}
