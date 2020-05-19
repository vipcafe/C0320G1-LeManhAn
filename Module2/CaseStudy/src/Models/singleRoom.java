package Models;

public class singleRoom extends Service {
    private String externalService;

    public singleRoom(String externalService) {
        this.externalService = externalService;
    }

    public singleRoom(String name, double area, double rentalFree, int maxGuest, String rentalType, String externalService) {
        super(name, area, rentalFree, maxGuest, rentalType);
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
