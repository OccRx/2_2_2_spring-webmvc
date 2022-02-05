package web.model;

public class Car {
    String brand;
    int model;
    int series;

    public Car(String brand, int model, int series) {
        this.brand = brand;
        this.model = model;
        this.series = series;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model=" + model +
                ", series=" + series +
                '}';
    }
}
