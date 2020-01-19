import java.time.LocalDate
import java.time.LocalDateTime

class Gigasecond {

    static final Integer GIGASECOND = 1E09

    static LocalDateTime add(LocalDate date) {
        
        add(date.atStartOfDay())
    }

    static LocalDateTime add(LocalDateTime time) {
        
        time.plusSeconds(GIGASECOND)
    }

}
