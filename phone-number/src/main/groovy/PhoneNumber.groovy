class PhoneNumber {

    private static final NANP = ~/^1?([2-9]\d{2})([2-9]\d{2})(\d{4})$/

    final String number
    final String areaCode
    final String xchange 
    final String subscriber 
     
    PhoneNumber(String input) {

        def matcher = 
            (input.replaceAll(/\D+/, '') =~ NANP)

        if (matcher) {
            areaCode = matcher.group(1)
            xchange = matcher.group(2)
            subscriber = matcher.group(3)
            number = "${areaCode}${xchange}${subscriber}"
        }
        else {
            number = "0000000000"
        }
    }

    String toString() {
        "(${areaCode}) ${xchange}-${subscriber}"
    }
}
