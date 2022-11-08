public class Laptop {
    String brand;
    int ram;
    String dateOfManufacture;

    public Laptop(String brand, int ram, String dateOfManufacture) {
        this.brand = brand;
        this.ram = ram;
        this.dateOfManufacture = dateOfManufacture;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getDateOfManufacture() {
        return dateOfManufacture;
    }

    public void setDateOfManufacture(String dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "brand='" + brand + '\'' +
                ", ram=" + ram +
                ", dateOfManufacture='" + dateOfManufacture + '\'' +
                '}';
    }
}
