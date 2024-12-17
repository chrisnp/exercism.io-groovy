class Bob {
    
    public static response(String input) {
        def silence = { it.trim() == '' }
        def yell = { 
            it.trim() == it.trim().toUpperCase() 
            ? it.trim() != it.trim().toLowerCase()
            : false 
        }
        def question = { it.trim().endsWith('?') }
        if (silence(input)) 
            return "Fine. Be that way!"
        if (yell(input) && question(input))
            return "Calm down, I know what I'm doing!"
        if (yell(input))
            return "Whoa, chill out!"
        if (question(input))
            return "Sure."
        "Whatever."
    }

}