package Models;

import com.sun.corba.se.spi.extension.CopyObjectPolicy;
import com.sun.javafx.image.impl.ByteIndexed;

public class House extends Service {
    private String roomStandard;
    private String houseDescription;
    private int numberOfFloors;

    public House(String roomStandard, String houseDescription, int numberOfFloors) {
        this.roomStandard = roomStandard;
        this.houseDescription = houseDescription;
        this.numberOfFloors = numberOfFloors;
    }

    public House(String name, double area, double rentalFree, int maxGuest, String rentalType, String roomStandard, String houseDescription, int numberOfFloors) {
        super(name, area, rentalFree, maxGuest, rentalType);
        this.roomStandard = roomStandard;
        this.houseDescription = houseDescription;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String rooStandard) {
        this.roomStandard = roomStandard;
    }

    public String getHouseDescription() {
        return houseDescription;
    }

    public void setHouseDescription(String houseDescription) {
        this.houseDescription = houseDescription;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public void showInfo() {
        System.out.println("Room Standard : " + this.roomStandard);
        System.out.println("House Description : " + this.houseDescription);
        System.out.println("Number Of Floors : " + this.numberOfFloors);
        super.showInfo();
    }
}
