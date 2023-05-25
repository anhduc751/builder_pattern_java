public class Bike {
    private int seriNum;
    private bikeType type;
    private boolean isHaveLight;
    private boolean isHaveBrake;
    private String color;
    public void showBike(){
        System.out.println(seriNum +" "+ type + " " +  isHaveLight + " " + isHaveBrake + " " + color);
    }
    public static class Builder{
        private int seriNum;
        private bikeType type;
        private boolean isHaveLight;
        private boolean isHaveBrake;
        private String color;

        public Builder createSeri(int seriNum){
            this.seriNum = seriNum;
            return this;
        }
        public Builder chooseBikeType(bikeType type){
            this.type = type;
            return this;
        }
        public Builder lightOption(boolean isHaveLight){
            this.isHaveLight = isHaveLight;
            return this;
        }
        public Builder brakeOption(boolean isHaveBrake){
            this.isHaveBrake = isHaveBrake;
            return this;
        }
        public Builder chooseColor(String color){
            this.color = color;
            return this;
        }
        public Bike build(){
            Bike bike = new Bike();
            bike.seriNum = this.seriNum;
            bike.type = this.type;
            bike.isHaveLight = this.isHaveLight;
            bike.isHaveBrake = this.isHaveBrake;
            bike.color = this.color;

            return bike;
        }
    }
}

