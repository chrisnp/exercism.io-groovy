class Leap {

    private final int year

    Leap(int year) {

        this.year = year
    }

    boolean divisibleBy(int x) { 
        
        year % x == 0 
    }

    boolean isLeapYear() {

        divisibleBy(100) ? 
        divisibleBy(400) : 
        divisibleBy(4)
    }
}
