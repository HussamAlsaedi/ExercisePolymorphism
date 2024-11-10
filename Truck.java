public class Truck implements Vehicle {

    private String type;
    private double week;


    public Truck(){

    }
    public Truck(String type, double week) {
        this.type = type;
        this.week = week;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getWeek() {
        return week;
    }

    public void setWeek(double week) {
        this.week = week;
    }

    @Override
    public double calculateRentCost() {
        return 500 * week;
    }

    @Override
    public void dispalyDelails() {
        System.out.println("Rental Details: ");
        System.out.println("Bike type: " +type);
        System.out.println("Hourly Rental: $500");
        System.out.println("Rental Cost: " + calculateRentCost())
        ;

    }
}
