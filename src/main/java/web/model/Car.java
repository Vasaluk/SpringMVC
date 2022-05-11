package web.model;

public class Car {
    private String model;
    private String num;
    private int mileage;

    public Car() {}

    public Car (String model, String num, int mileage) {
        this.model = model;
        this.num = num;
        this.mileage = mileage;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return new String(String.valueOf(model + " " + num + " " + mileage));
    }
}
