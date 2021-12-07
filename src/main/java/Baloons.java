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

    public double [] getBallon() {
        return baloons;
    }


    public double getTotalWeight() {
        if (baloons.length == 0) {
            return 0;
        }
        double sum =0;
        for (int i=0; i < baloons.length; i++) {
            sum = this.baloons[i];
        }

        return sum;
    }



}
