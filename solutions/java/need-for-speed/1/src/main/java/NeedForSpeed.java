class NeedForSpeed {
    private int speed;
    private int battery;
    private int batteryDrain;
    private int distance;
    private boolean status;
    // TODO: define the constructor for the 'NeedForSpeed' class
    public NeedForSpeed (int speed, int batteryDrain)
    {
        this.distance = 0;
        this.battery = 100;
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
       if (this.battery == 0)
           return (true);
        return (false);
    }

    public int distanceDriven() {
        return (this.distance);
    }

    public void drive() {
        if (this.battery == 0)
            return ;
        this.battery -= this.batteryDrain;
        this.distance += speed;
    }

    public static NeedForSpeed nitro() {
        return (new NeedForSpeed(50, 4));
    }
}

class RaceTrack {
    private int distance;
    // TODO: define the constructor for the 'RaceTrack' class
    public RaceTrack(int distance)
    {
        this.distance = distance;
    }
    
    public boolean tryFinishTrack(NeedForSpeed car) {
        while (!car.batteryDrained())
           car.drive();
        return (car.distanceDriven() >= distance);
    }
}
