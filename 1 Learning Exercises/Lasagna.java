public class Lasagna {
    public int expectedMinutesInOven() {
        return 40;
    }

    public int remainingMinutesInOven(int currentTime){
        return expectedMinutesInOven() - currentTime;
    }

    public int preparationTimeInMinutes(int numberOfLayers) {
        return numberOfLayers * 2;
    }

    public int totalTimeInMinutes(int numberOfLayers, int currentTime) {
        return preparationTimeInMinutes(numberOfLayers) + currentTime;
        
    }
}
