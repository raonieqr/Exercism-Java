import java.time.LocalDate;
import java.time.LocalDateTime;

public class Gigasecond {
    private LocalDateTime time;
    private Integer gigas = 1000000000;

    public Gigasecond(LocalDate moment) {
        this.time = moment.atTime(0, 0);
    }

    public Gigasecond(LocalDateTime moment) {
        this.time = moment;
    }

    public LocalDateTime getDateTime() {
        return (time.plusSeconds(gigas));
    }
}