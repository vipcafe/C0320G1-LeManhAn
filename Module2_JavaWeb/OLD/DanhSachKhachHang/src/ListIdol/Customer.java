package ListIdol;

public class Customer {
    private String name ; // tên
    private String properties ; // thuộc tính
    private String species ; // chủng loại
    private String Img ; // dường dẫn ảnh

    public Customer(String name, String properties, String species, String img) {
        this.name = name;
        this.properties = properties;
        this.species = species;
        Img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProperties() {
        return properties;
    }

    public void setProperties(String properties) {
        this.properties = properties;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getImg() {
        return Img;
    }

    public void setImg(String img) {
        Img = img;
    }
}
