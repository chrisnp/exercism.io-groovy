class ArmstrongNumber {

    static isArmstrongNumber(number) {
        
        def numDigits = "$number".length()
        
        number == "$number"
                  .collect {
                      d -> d.toInteger() ** numDigits
                  }
                  .sum()
    }
}