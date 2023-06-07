class PrimitiveTypes {
    public static void main(String[] args){
        // byte data type is a 8-bit signed integer
        // byte default value is 0
        // min value is -128(-2^7)
        // max value is 127 (2^7-1)

        byte max = 127; 
        byte min = -128;
        //byte c = min + max; 
        
        System.out.println(min);
        System.out.println(max);
        //System.out.println(c);

        // short data type is a 16-bit signed integer
        // byte default value is 0
        // min value is -32,768(-2^15)
        // max value is 32,767 (2^15-1) 
        
        //short a = 15000;
        //short b = -300;

        short a = 15000;
        short b = 300;

        // short sum = a + b;
        // short sub = a - b;

        // System.out.print(sum);
        // System.out.print(sub);

        System.out.println(a);
        System.out.println(b);

        // int data type is a 32-bit signed integer
        // byte default value is 0
        // min value is -2,147,483,648(-2^31)
        // max value is 2,147,483,647 (2^31-1) 

        int o = -2000000000;
        int t = o + 2000000001;

        System.out.println(o); 
        System.out.println(t);

        // int data type is a 64-bit signed integer
        // byte default value is 0L
        // min value is -9,223,372,036,854,775,808(-2^63)
        // max value is 9,223,372,036,854,775,807(2^63-1)

        long h = 250005L;
        long k = h++;
        //long q = k--:

        System.out.println("h is " + h); //why??
        System.out.println("k is " + k);
        //System.out.print(q);

        //float 32-bite 
        //default value is 0.0f

        float f = 58.36f;

        float g = -77748.2f;

        System.out.println(f);
        System.out.println(g);
    }    

}