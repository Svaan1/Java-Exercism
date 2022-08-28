
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return this.birdsPerDay;
    }

    public int getToday() {
        if (getLastWeek().length == 0) {
            return 0;
        } else {
        return getLastWeek()[6];
        }
    }

    public void incrementTodaysCount() {
        this.birdsPerDay[6] += 1;
    }

    public boolean hasDayWithoutBirds() {
        for (int day:getLastWeek()) {
            if (day == 0) {
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        if (numberOfDays > 7) {
            numberOfDays = 7;
        }
        int total_sum = 0;
        for (int index = 0; index < numberOfDays; index++) {
            total_sum += this.birdsPerDay[index];
        }
        return total_sum;
    }

    public int getBusyDays() {
        int busy_days = 0;
        for (int day:getLastWeek()) {
            if (day > 4) {
                busy_days += 1;
            }
        }
        return busy_days;
    }
}
