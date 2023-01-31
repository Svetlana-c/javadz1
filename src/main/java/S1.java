import java.util.Random;
public class S1 {
    public static void main(String[] args){
        int min = 0;
        int max = 200;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min;
        System.out.println(i);

    }
    }



