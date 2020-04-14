public enum Soil {
    PODZOLISTAYA("podzolistaya"), GRUNTOVAYA("gruntovaya"), DERNOVO_PODZOLISTAYA("dernovo-podzolistaya");
    private String pochva;

    Soil(String pochva) {
        this.pochva = pochva;
    }

    public String getPochva() {
        return pochva;
    }
}
