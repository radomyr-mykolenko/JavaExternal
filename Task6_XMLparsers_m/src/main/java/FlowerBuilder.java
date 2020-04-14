import java.util.ArrayList;

public class FlowerBuilder {
    //private Orangery flowers;
    //private Flower flower;

    public FlowerBuilder() {
        //this.flowers = new Orangery();
    }

    public Orangery builtFlowers(ArrayList<String> receivedFromXMLdata) {
        int i;
        //ArrayList<Flower> flowers = new ArrayList<>();
        Orangery flowers = new Orangery();
        for (i = 10; i <= receivedFromXMLdata.size(); i += 10) {
            Flower flower = new Flower();

            flower.setName(receivedFromXMLdata.get(i - 10)); // 0
            flower.setSoil(receivedFromXMLdata.get(i - 9)); // 1
            flower.setOrigin(receivedFromXMLdata.get(i - 8)); // 2

            VisualParameters visualParameters = new VisualParameters();
            visualParameters.setAverage_height(Integer.parseInt(receivedFromXMLdata.get(i - 7))); // 3
            visualParameters.setLeaves_color(receivedFromXMLdata.get(i - 6)); // 4
            visualParameters.setStem_color(receivedFromXMLdata.get(i - 5));  // 5


            flower.setVisualParameters(visualParameters);

            GrowingTips growingTips = new GrowingTips();

            switch (receivedFromXMLdata.get(i - 4)) {   // setting the boolean field "lightening" of growing tips
                case "true":
                    growingTips.setLightening(true);
                    break;
                case "false":
                    growingTips.setLightening(false);
                    break;
                default: {
                    growingTips.setLightening(false);
                    System.out.println("Invalid type of lightening was setted for this flower");
                    break;
                }
            }

            growingTips.setWatering(Integer.parseInt(receivedFromXMLdata.get(i - 3))); // 7
            growingTips.setTemperature(Integer.parseInt(receivedFromXMLdata.get(i - 2)));// 8
            flower.setGrowingTips(growingTips);
            flower.setMultiplying(receivedFromXMLdata.get(i - 1)); // 9

            //flowers.addFlower(flower);
            flowers.addFlower(flower);
        }
        return flowers;
    }
}
