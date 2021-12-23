package baloon;

public class App {


    public class Balloon {
        private double helium;

        public Balloon() {
            helium = Math.random() * (0.009 - 0.005) + 0.005;
        }

        public double getLoad() {
            return helium * 6 / 0.007;
        }
    }

    public class Donkey {

        private double mass;
        private Balloon[] balloons;

        public Donkey(double mass) {
            this.mass = mass;
            balloons = new Balloon[0];
        }

        public void addBalloon(Balloon balloon) {
            balloons = extendsArray(balloons);
            balloons[balloons.length - 1] = balloon;
        }

        public boolean isFlying() {
            double load = 0;
            for (Balloon b : balloons)
                load += b.getLoad();
            return load >= mass * 1000;
        }

        public Balloon[] getBalloons() {
            return balloons;
        }

        private Balloon[] extendsArray(Balloon[] arr) {
            Balloon[] tmp = new Balloon[balloons.length + 1];

            for (int i = 0; i < balloons.length; i++)
                tmp[i] = balloons[i];

            return tmp;
        }


        public static void main(String[] args) {


            Donkey donkey2 = new Donkey(1);

            while (!donkey2.isFlying())
                donkey2.addBalloon(new Balloon());


            System.out.println("==============================================================");
            System.out.println("Ja latam!!!");
            System.out.println(donkey2.getBalloons().length);

        }
    }
}