public class SoilFactory {

    public String getPochva(String pochvaReadedFromXML){
        switch (pochvaReadedFromXML){
            case "podzolistaya": return Soil.PODZOLISTAYA.getPochva();
            case "gruntovaya": return Soil.GRUNTOVAYA.getPochva();
            case "dernovo-podzolistaya": return Soil.DERNOVO_PODZOLISTAYA.getPochva();
            default: return "unsupported type of pochva";
        }
    }
}
