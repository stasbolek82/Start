package baloon;

public class Balloon1 {
    private double[] balloons;
    private int number;

    public Balloon1() {
        this.balloons = new double[0];
        this.number = 0;
    }

    public void addBalloon() {
        this.number++;
        double max = 0.009;
        double min = 0.005;
        double[] newTab = new double[number];
        System.arraycopy(balloons, 0, newTab, 0, balloons.length);
        newTab[this.number - 1] = Math.random() * (max - min) + min;
        balloons = newTab;
    }

    public double getTotalWeight() {
        double sum = 0;
        for (int i=0; i< this.number; i++)
            sum += balloons[i];
        return sum;
    }

    public int getNumber(){
        return this.number;
    }
//Opcja z domyślnym konstruktorem :


}
