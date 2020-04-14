import java.util.ArrayList;

public class Orangery {
    private ArrayList<Flower> flowers = new ArrayList<>();

    public void addFlower(Flower flower) {
        if (flower != null)
            this.flowers.add(flower);
        else this.flowers.add(new Flower("test flower"));
    }

    public void displayFlowers() {
        for (Flower flower : flowers) {
            System.out.println(flower.toString());
        }
    }
}
