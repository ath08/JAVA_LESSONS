class Hello {
    public static void main(String[] args){

// perform mathematical operations
        long num1 = 1500000L;
        long num2 = 30L;

        long mult = num1 * num2;
        long div = num1 / num2;
        long sub = num1 - num2;
        long sum = num1 + num2;
        //boolean isTrue1 == num1 % 2;
        boolean isTrue2 = mult < sum;

        System.out.println(mult);
        System.out.println(div);
        System.out.println(sub);
        System.out.println(sum);
        //System.out.println(isTrue1);
        System.out.println(isTrue2);

// print fullName 
        String firstName = "Tatev";
        String lastName = "Aslikyan";
        String fullName = firstName + " " + lastName;

        System.out.println("My fullName is " + fullName);

    }    

}