class ReverseString {

    static reverse(String value) {
        
        value.equals("") ? value : reverse(value.substring(1)) + value.charAt(0)
    }
}