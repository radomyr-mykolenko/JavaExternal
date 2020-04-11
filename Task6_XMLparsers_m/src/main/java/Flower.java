

public class Flower {
    private String name;
    private Soil soil;
    private String origin;
    private VisualParameters visualParameters;
    private GrowingTips growingTips;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Soil getSoil() {
        return soil;
    }

    public void setSoil(Soil soil) {
        this.soil = soil;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public VisualParameters getVisualParameters() {
        return visualParameters;
    }

    public void setVisualParameters(VisualParameters visualParameters) {
        this.visualParameters = visualParameters;
    }

    public GrowingTips getGrowingTips() {
        return growingTips;
    }

    public void setGrowingTips(GrowingTips growingTips) {
        this.growingTips = growingTips;
    }
}
