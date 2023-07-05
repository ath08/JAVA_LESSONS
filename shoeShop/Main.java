public class Main{
	public static void main(String[] args) {
		Shoe shoe1 = new Shoe(300, 7);
		Shoe shoe2 = new Shoe(100, 9);
		Shoe shoe3 = new Shoe(100, 7);
		Shoe shoe4 = new Shoe(30, 7);
		Shoe shoe5 = new Shoe(70, 7);
		Shoe shoe6 = new Shoe(10, 7);

		Client client1 = new Client(500, 7, 35);
		Client client2 = new Client(500, 9, 50);

		shoe1.shoeInfo();
		shoe2.shoeInfo();
		client1.clientInfo();
		client2.clientInfo();
		System.out.println(client1.buyShoe(shoe1));
		System.out.println(client2.buyShoe(shoe2));
		client1.clientInfo();
		System.out.println(client1.buyShoe(shoe3));
		System.out.println(client1.buyShoe(shoe4));
		System.out.println(client1.buyShoe(shoe5));
		System.out.println(client1.buyShoe(shoe6));
		client1.clientInfo();
	}
}