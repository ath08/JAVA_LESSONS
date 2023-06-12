public class Arrays {
    public static void main(String[] args){
        int[] numbers = new int[7];
        int[] num = {1, 2, 3, 4, 5};

        System.out.println(num[3]);
        System.out.println(num);

        double[] num1 = new double[4];
        num1[0] = num[4] / num[1];    //5 / 2 => 2.0
        num1[1] = 3.48;
        num1[2] = num1[0] * num1[1];  // 2 * 3.48
        num1[3] = num[4] / num1[0];   // 4 / 3.48

        System.out.println("num1[0] " + num1[0]);  //2.0
        System.out.println("num1[1] " + num1[1]);  //3.48
        System.out.println("num1[2] " + num1[2]);  //6.96
        System.out.println("num1[3] " + num1[3]);  //2.5


        String[] names = new String[6];
        names[0] = "Anahit";
        names[1] = "Tatev";
        names[2] = "Ira";
        names[3] = "Gagik";
        names[4] = "Elen";
        names[5] = "Anna";

        System.out.println(names[0]);
        System.out.println(names.length);
        System.out.println(names[names.length-1]);

        if(names.length % 2 != 0) {
            System.out.println(names[names.length - 1]);
        }else if (names[names.length - 1] == "Anna") {
            System.out.println(names[1]);
            
        } else {
            System.out.println(names[0]);
        }
        // System.out.println();
        // System.out.println();
        // System.out.println();

     }
}