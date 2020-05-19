package Models;

public class Villa extends Service {
    private String romStandard;
    private String villaDescription;
    private int numberOfFloors;
    private double poolArea;

    public Villa(String romStandard, String villaDescription, int numberOfFloors, double poolArea) {
        this.romStandard = romStandard;
        this.villaDescription = villaDescription;
        this.numberOfFloors = numberOfFloors;
        this.poolArea = poolArea;
    }

    public Villa(String name, double area, double rentalFree, int maxGuest, String rentalType, String romStandard, String villaDescription, int numberOfFloors, double poolArea) {
        super(name, area, rentalFree, maxGuest, rentalType);
        this.romStandard = romStandard;
        this.villaDescription = villaDescription;
        this.numberOfFloors = numberOfFloors;
        this.poolArea = poolArea;
    }

    public String getRomStandard() {
        return romStandard;
    }

    public void setRomStandard(String romStandard) {
        this.romStandard = romStandard;
    }

    public String getVillaDescription() {
        return villaDescription;
    }

    public void setVillaDescription(String villaDescription) {
        this.villaDescription = villaDescription;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    @Override
    public void showInfo() {
        System.out.println("Rom Standard : " + this.romStandard);
        System.out.println("Villa Description : " + this.villaDescription);
        System.out.println("Number OfF loors : " + this.numberOfFloors);
        System.out.println("Pool Area : " + this.poolArea);
        super.showInfo();
    }
}
