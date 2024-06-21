class EliudsEggs {

    static eggCount(number) {
        int count = 0
        while (number != 0) {
            count += number % 2
            number = number.intdiv(2) 
        }
        count
    }
}
