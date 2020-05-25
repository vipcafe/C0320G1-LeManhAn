package Models;

public abstract class Service {
    String name; //tên
    double area; //Diện tích sữ dụng
    double rentalFee; // tiền thuê nhà
    int maxGuest; // số người tối đa
    String rentalType; // kiểu thuê ( ngày , giờ , tháng hoặc năm )

    Service() {
    }

    public Service(String name, double area, double rentalFee, int maxGuest, String rentalType) {
        this.name = name;
        this.area = area;
        this.rentalFee = rentalFee;
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

    public double getRentalFee() {
        return rentalFee;
    }

    public void setRentalFee(double rentalFee) {
        this.rentalFee = rentalFee;
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
        System.out.println("Rental Fee : " + this.rentalFee);
        System.out.println("Max Guest : " + this.maxGuest);
        System.out.println("Rental Type : " + this.rentalType);
    }
}
