public class Baloons {
    private double[] baloons;
    private int number;

    public Baloons() {
        this.baloons = new double[0];
        this.number = 0;
    }

    public void addBaloon(double baloon) {
        this.number++;
        double[] newTab = new double[number];
        System.arraycopy(baloons, 0, newTab, 0, baloons.length);
        newTab[this.number - 1] = baloon;
        baloons = newTab;
    }

    public double getBallon() {
        return this.getTotalWeight();
    }

    public double getTotalWeight() {
        double sum = this.number;
        return sum;
    }



}
