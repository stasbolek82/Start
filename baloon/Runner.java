package baloon;

import java.util.Random;

public class Runner {
        public static void main(String[] args) {

        Donkey donkey = new Donkey("Don",100);

        Random rand = new Random();
        double min =  0.005;
        double max =  0.007;

                double a = Math.random()*(max-min+1)+min;
                double rand_weight = 0.001*rand.nextDouble();

        if ((rand_weight >= 0.005) && (rand_weight<= 0.009)){

        System.out.println("I can fly!"+ a);}
        else {

                System.out.println("I can fly! ---- " + rand_weight);
        }

    }
}
