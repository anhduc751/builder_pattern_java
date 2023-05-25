public class Main {
    public static void main(String[] args) {
        Bike bike = new Bike.Builder()
                            .createSeri(123)
                            .chooseBikeType(bikeType.oneWheel)
                            .lightOption(true)
                            .brakeOption(true)
                            .chooseColor("yellow")
                            .build();
        bike.showBike();
    }
}