import java.util.ArrayList;

public class FlowersArrayListToArray {
    public static Flower[] convert(ArrayList<Flower> flowerArrayList){
        int i = 0;
        for(Flower elements: flowerArrayList){
            if(elements!=null) i++;
        }
        Flower[] arrayForSorting = new Flower[i];
        for (i=0;i<arrayForSorting.length;i++){
            arrayForSorting[i] = flowerArrayList.get(i);
        }
        return arrayForSorting;
    }
}
