package web.model;

public class Car {
    private String brand;
    private String country;
    private int year;

    public Car (String brand, String country, int year) {
        this.brand = brand;
        this.country = country;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }

    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
}
