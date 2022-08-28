public class CarsAssemble {
    private int BASE_CARS_PER_HOUR = 221;

    public double productionRatePerHour(int speed) {
        double success_rate = switch (speed) {
            case 1,2,3,4:
                yield 1.00;
            case 5,6,7,8:
                yield 0.90;
            case 9:
                yield 0.80;
            case 10:
                yield 0.77;
            default:
                yield 0;
        };
        return this.BASE_CARS_PER_HOUR * speed * success_rate;
    }

    public int workingItemsPerMinute(int speed) {
        return (int)Math.floor(productionRatePerHour(speed)/60);
    }
}
