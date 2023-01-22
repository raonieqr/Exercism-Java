
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return(birdsPerDay);
    }

    public int getToday() {
        if (birdsPerDay.length >= 1)
            return(birdsPerDay[birdsPerDay.length - 1]);
        return (0);
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length - 1] += 1;
    }

    public boolean hasDayWithoutBirds() {
        for(int birds:birdsPerDay)
        {
            if (birds == 0)
                return (true);
        }
        return (false);
    }

    public int getCountForFirstDays(int numberOfDays) {
        int sum = 0;
        int i =0;
        for (int birds:birdsPerDay)
        {
            if (i != numberOfDays)
                sum += birds;
            else
                break ;
            i++;
        }
        return (sum);
    }

    public int getBusyDays() {
        int counter = 0;

        for (int birds:birdsPerDay)
        {
            if (birds >= 5)
                counter++;
        }
        return (counter);
    }
}

