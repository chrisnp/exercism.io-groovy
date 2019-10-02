class PhoneNumber {

    private static final NANP_REGEX = 
        ~/^(?:\+?1)?[-.(\s]*([2-9]\d\d)[-.)\s]*\s?([2-9]\d\d)[-.\s]*(\d{4})\s*$/

    final String area, xchange, subscriber, number 
    
    PhoneNumber(String input) {

        def matcher = 
            (input.replaceAll(/\D*/, '') =~ NANP_REGEX)

        if (matcher) {
            area = matcher.group(1)
            xchange = matcher.group(2)
            subscriber = matcher.group(3)
        }
        else 
            ['000', '000', '0000']

        number = "${area}${xchange}${subscriber}"
    }

    String toString() {
        "(${area}) ${xchange}-${subscriber}"
    }
}
