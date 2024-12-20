class ArmstrongNumber {

    static isArmstrongNumber(number) {
        String ds = "$number"
        int dsLen = ds.length()
        number == ds.collect { it.toInteger() ** dsLen }.sum()
    }
}