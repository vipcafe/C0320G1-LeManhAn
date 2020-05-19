package Models;

public abstract class Service {
    String name;
    double area;
    double rentalFree;
    int maxGuest;
    String rentalType;

    Service() {
    }

    ;

    public Service(String name, double area, double rentalFree, int maxGuest, String rentalType) {
        this.name = name;
        this.area = area;
        this.rentalFree = rentalFree;
        this.maxGuest = maxGuest;
        this.rentalType = rentalType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getRentalFree() {
        return rentalFree;
    }

    public void setRentalFree(double rentalFree) {
        this.rentalFree = rentalFree;
    }

    public int getMaxGuest() {
        return maxGuest;
    }

    public void setMaxGuest(int maxGuest) {
        this.maxGuest = maxGuest;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    public void showInfo() {
        System.out.println("Name : " + this.name);
        System.out.println("Area : " + this.area);
        System.out.println("Rental Free : " + this.rentalFree);
        System.out.println("Max Guest : " + this.maxGuest);
        System.out.println("Rental Type : " + this.rentalFree);
    }
}
