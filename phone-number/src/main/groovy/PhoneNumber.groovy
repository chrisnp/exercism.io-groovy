class PhoneNumber {

    private static final NANP = 
        ~/^1?([2-9]\d{2})([2-9]\d{2})(\d{4})$/
     
    static String clean(String input) {

        String phoneNumber
        String areaCode
        String xChange 
        String subscriber 

        def matcher = (input.replaceAll(/\D+/, '') =~ NANP)

        if (matcher) {
            areaCode    = matcher.group(1)
            xChange     = matcher.group(2)
            subscriber  = matcher.group(3)
            phoneNumber = "${areaCode}${xChange}${subscriber}"
        }
        else {
            throw new Exception("Check your number")
        }
        phoneNumber
    }
}
