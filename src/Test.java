public class Test {


    public static void main(String[] args) {

        MultiArray ma = new MultiArray(3,4);
        ma.randomize();
        ma.print();
        System.out.println("Najmniejsza: "+ma.findMin());
        System.out.println("Najwieksza: "+ma.findMax());

    }


}
