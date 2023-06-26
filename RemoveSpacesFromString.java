public class RemoveSpacesFromString{
	public static void main(String[] args){
		String str = "Good Morning Everyone";
		System.out.println("with spaces: " + str);
		str = str.replaceAll("\\s+","");
		System.out.println("Without any spaces: " + str);


	}
}