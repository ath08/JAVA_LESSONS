public class Operations{
	public static void main(String[] args){
		System.out.println(5&8);     //0	
		System.out.println(17&24);   //16
		System.out.println(5|8);     //13
		System.out.println(5^8);     //13
		System.out.println(23^54);   //33
		System.out.println("---------------");
		System.out.println(33&15);   //1
		System.out.println(76&101);  //68
		System.out.println(301|17);  //317
		System.out.println(43|94);   //127
		System.out.println(67^10);   //73
		System.out.println(55^23);   //32
		
		//^ XOR => return 0 if the bits are matching
		//      => return p if the bits aren't maching

	}
}