class Bob {

    private static boolean silence(String input) {
        input.trim() == ''
    }

    private static boolean question(String input) {
        input.trim().endsWith('?')
    }

    private static boolean yell(String input) {
        input = input.trim()
        (input == input.toUpperCase()) ? 
          input != input.toLowerCase() : 
          false
    }

    public static String response(String input) {
        if (yell(input) && question(input))
            return "Calm down, I know what I'm doing!"
        if (yell(input))
            return "Whoa, chill out!"
        if (question(input))
            return "Sure."
        if (silence(input)) 
            return "Fine. Be that way!"
        "Whatever."
    }

}