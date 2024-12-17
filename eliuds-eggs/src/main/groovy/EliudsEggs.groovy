class EliudsEggs {
    static eggCount(number) {
        int count = 0
        while (number > 0) {
            count += 1
            number = number & (number - 1) 
        }
        count
    }
}
