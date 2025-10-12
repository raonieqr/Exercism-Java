public class ElonsToyCar {
    private Integer distance;
    private Integer battery;

    public ElonsToyCar()
    {
        this.distance = 0;
        this.battery = 100;
    }
    
    public static ElonsToyCar buy() {
        return(new ElonsToyCar());
    }

    public String distanceDisplay() {
       return ("Driven " + distance + " meters");
    }

    public String batteryDisplay() {
        if (this.battery == 0)
            return ("Battery empty");
        return ("Battery at " + battery + "%");
    }

    public void drive() {
        if (this. distance == 2000 || this.battery == 0)
            return ;
        else
        {
            distance += 20;
            if (distance % 20 == 0)
                battery--;
            return ;
        }
    }
}
