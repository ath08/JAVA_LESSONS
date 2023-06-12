public class ArraysHomework {
    public static void main(String[] args) {
        int[] ages = new int[6];
        System.out.println(ages[4]);
        ages[0] = 4;
        ages[1] = 74;
        ages[3] = 48;
        ages[4] = 17;
        ages[5] = 10;

        System.out.println(ages[0] + ages[4]);
        System.out.println(ages.length);
        System.out.println(ages[0] + ages[ages.length - 1]);


        System.out.println("------------------------");
        String[] names = {"Hayk", "Anna", "Ani", "Anahit", "Taron"};

        System.out.println("Name is " + names[0] + ","+ "age is " + ages[0]);
        System.out.println("Name is " + names[1] + ","+ "age is " + ages[1]);
        System.out.println("Name is " + names[2] + ","+ "age is " + ages[2]);
        System.out.println("Name is " + names[3] + ","+ "age is " + ages[3]);
        System.out.println("Name is " + names[4] + ","+ "age is " + ages[4]);


    }
}