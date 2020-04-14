public enum Multiplying {
    BY_LEAVES("by leaves"), BY_CHERENKI("by cherenki"), BY_SEEDS("by seeds");
    private String multiplying;

    public String getMultiplying() {
        return multiplying;
    }

    private Multiplying(String multiplying) {
        this.multiplying = multiplying;
    }
}
