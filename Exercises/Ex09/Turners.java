package Ex09;

/**
 * Created by kurt.Schoenhoff on 20/09/2016.
 */
public class Turners {

    public static void main(String[] args) {
        Turner[] turners = new Turner[15];

        for (int i = 0; i < 5; i++){
            turners[i] = new Leaf();
            turners[i+5] = new Page();
            turners[i+10] = new Pancake();

        }

        for(Turner turner : turners){
            turner.turn();
        }
    }
}
