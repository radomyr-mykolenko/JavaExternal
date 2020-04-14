public class MultiplyingFactory {
    public String getMultiplying(String multiplyingReadedFromXML){
        switch (multiplyingReadedFromXML){
            case "by leaves": return Multiplying.BY_LEAVES.getMultiplying();
            case "by cherenki": return Multiplying.BY_CHERENKI.getMultiplying();
            case "by seeds": return Multiplying.BY_SEEDS.getMultiplying();
            default:return "unsupported type of multiplying";
        }
    }
}
