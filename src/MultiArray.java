import java.util.Arrays;
import java.util.Random;

public class MultiArray {

    private int[][] tab;


    public MultiArray(int a, int b) {
        this.tab = new int[a][b];
        randomize();
    }



    public void randomize(){
        Random r = new Random();
        for (int i = 0 ; i < tab.length ; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                tab[i][j] = r.nextInt(99) + 1;
            }
        }
    }


    public void print(){
        System.out.println("Zawartosc tablicy: ");
        for (int i = 0 ; i < tab.length ; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                System.out.print(tab[i][j]+", ");
            }
            System.out.println();
        }

    }


    int findMin(){
        int min= tab[0][0];
        for (int i = 0 ; i < tab.length ; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                if (tab[i][j] < min){
                    min = tab[i][j];
                }
            }

        }
        return min;
    }

    int findMax(){
        int max= tab[0][0];
        for (int i = 0 ; i < tab.length ; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                if (tab[i][j] > max){
                    max = tab[i][j];
                }
            }

        }
        return max;
    }


}

