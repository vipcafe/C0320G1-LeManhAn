package Models;

public class SingleRom extends Service {
    private String externalService; // dịch vụ khác

    public SingleRom(){}

    public SingleRom(String externalService) {
        this.externalService = externalService;
    }

    public SingleRom(String name, double area, double rentalFee, int maxGuest, String rentalType, String externalService) {
        super(name, area, rentalFee, maxGuest, rentalType);
        this.externalService = externalService;
    }

    public String getExternalService() {
        return externalService;
    }

    public void setExternalService(String externalService) {
        this.externalService = externalService;
    }

    @Override
    public void showInfo() {
        System.out.println("External Service : " + this.externalService);
        super.showInfo();
    }
}
