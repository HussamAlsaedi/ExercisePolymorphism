public class Bike  implements Vehicle{

  private String brand;
  private double hour;

  public Bike(){

  }

    public Bike(String brand, double hour) {
        this.brand = brand;
        this.hour = hour;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getHour() {
        return hour;
    }

    public void setHour(double hour) {
        this.hour = hour;
    }

    @Override
    public double calculateRentCost() {

        return hour * 10;
    }

    @Override
    public void dispalyDelails() {
        System.out.println("Rental Details: ");
        System.out.println("Bike brand: " +brand);
        System.out.println("Daily Rental: $10");
        System.out.println("Rental Cost: " + calculateRentCost());

    }
}
