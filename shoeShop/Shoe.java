public class Shoe{
	private int price;
	private int size;

	public Shoe(int price, int size){
		this.price = price;
		this.size = size;
	}

	public int getPrice(){
		return price;
	} 
	public void setPrice(int price){
		this.price = price;
	}
	public int getSize(){
		return size;
	}
	public void setSize(int size){
		this.size = size;
	}
	public void shoeInfo(){
		System.out.printf("price is: %d, size is: %d \n", price, size);
	}
}