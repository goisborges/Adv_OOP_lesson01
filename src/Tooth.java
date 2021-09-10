public class Tooth {
    private int cusps;
    private String toothName;
    private int numberOfRoots;
    private boolean hasEndodonticTreatment;
    private boolean hasPeriapicalLesion;

    public Tooth(int cusps, String toothName, int numberOfRoots, boolean hasEndodonticTreatment, boolean hasPeriapicalLesion) {
        setCusps(cusps);
        setToothName (toothName);
        setNumberOfRoots (numberOfRoots);
        setHasEndodonticTreatment (hasEndodonticTreatment);
        setHasPeriapicalLesion (hasPeriapicalLesion);
    }

    public int getCusps() {
        return cusps;
    }

    public void setCusps(int cusps) {
        if (cusps <= 5 && cusps > 0){
            this.cusps = cusps;
        }
        else {
            throw new IllegalArgumentException("A tooth cannot have more than 5 cusps");
        }

    }

    public String getToothName() {
        return toothName;
    }

    public void setToothName(String toothName) {
        this.toothName = toothName;
    }

    public int getNumberOfRoots() {
        return numberOfRoots;
    }

    public void setNumberOfRoots(int numberOfRoots) {
        if (numberOfRoots > 0 && numberOfRoots <= 3) {
            this.numberOfRoots = numberOfRoots;
        }
        else {
            throw new IllegalArgumentException("Molars have a maximum of 3 roots. Please verify this information");
        }
    }

    public boolean isHasEndodonticTreatment() {
        return hasEndodonticTreatment;
    }

    public void setHasEndodonticTreatment(boolean hasEndodonticTreatment) {
        this.hasEndodonticTreatment = hasEndodonticTreatment;
    }

    public boolean isHasPeriapicalLesion() {
        return hasPeriapicalLesion;
    }

    public void setHasPeriapicalLesion(boolean hasPeriapicalLesion) {
        this.hasPeriapicalLesion = hasPeriapicalLesion;
    }

    public String toString(){
        return "This tooth is a " + toothName + ", it has " + numberOfRoots + " roots, and " + cusps + " cusps. \n" +
        "Has endodontic treatment done (root canal)?: " + hasEndodonticTreatment + "\n" +
                "Has any periapical lesion? :" + hasPeriapicalLesion + "\n";
    }
}
