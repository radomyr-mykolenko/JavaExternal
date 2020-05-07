import java.io.Serializable;

public class Flower implements Serializable {
    private Long id;
    private String name;
    private String color;
    private String height;
    private String countryOfOrigin;

    public Flower(Long id, String name, String color, String height, String countryOfOrigin) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.height = height;
        this.countryOfOrigin = countryOfOrigin;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }
    @Override
    public String toString() {
        return "Flower{" +
                "id = " + id +
                ", Name = '" + name + '\'' +
                ", Color = '" + color + '\'' +
                ", Height = '" + height + '\'' +
                ", Country of origin = '" + countryOfOrigin + '\'' +
                '}';
    }
}
