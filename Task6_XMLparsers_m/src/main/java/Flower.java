import java.util.Comparator;

public class Flower {
    private String name;
    private String soil;
    private String origin;
    private VisualParameters visualParameters;
    private GrowingTips growingTips;
    private String multiplying;
    private SoilFactory soilFactory;
    private MultiplyingFactory multiplyingFactory;

    public Flower() {
        this.soilFactory = new SoilFactory();
        this.multiplyingFactory = new MultiplyingFactory();
    }

    public Flower(String name) {
        this.name = name;
        this.soil = "test soil";
        this.origin = "test origin";
        VisualParameters visualParameters = new VisualParameters();
        visualParameters.setAverage_height(5);
        visualParameters.setLeaves_color("test color");
        visualParameters.setStem_color("test color");
        this.setVisualParameters(visualParameters);
        GrowingTips growingTips = new GrowingTips();
        growingTips.setTemperature(5);
        growingTips.setWatering(5);
        growingTips.setLightening(true);
        this.setGrowingTips(growingTips);
        this.multiplying = "test multiplying";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSoil() {
        return soil;
    }

    public void setSoil(String soil) {
        this.soil = soilFactory.getPochva(soil);
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

    public String getMultiplying() {
        return multiplying;
    }

    public void setMultiplying(String multiplying) {
        this.multiplying = multiplyingFactory.getMultiplying(multiplying);
    }

    @Override
    public String toString() {
        return "\nFlower name is \u001B[31m" + this.getName()
                + "\n \u001B[37msoil: " + this.getSoil()
                + "\n origin from: " + this.getOrigin()
                + "\n visual parameters \n   stem color: " + this.getVisualParameters().getStem_color()
                + "\n   leaves color: " + this.getVisualParameters().getLeaves_color()
                + "\n   average height: " + this.getVisualParameters().getAverage_height() + "cm"
                + "\n growing tips\n   lightening: " + this.getGrowingTips().isLightening()
                + "\n   watering: " + this.getGrowingTips().getWatering() + "ml"
                + "\n  \u001B[32m temperature: " + this.getGrowingTips().getTemperature() + "C\u001B[37m"
                + "\n multiplying: " + this.getMultiplying();
    }
}
