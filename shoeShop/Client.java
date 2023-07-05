public class Client{
	private int discretionaryIncome;
	private int shoeSize;
	private int numOfShoes;

	public Client(int discretionaryIncome, int shoeSize, int numOfShoes){
		this.discretionaryIncome = discretionaryIncome;
		this.shoeSize = shoeSize;
		this.numOfShoes = numOfShoes;
	}

	public int getDiscretionaryIncome(){
		return discretionaryIncome;
	}
	public void setDiscretionaryIncome(int discretionaryIncome){
		this.discretionaryIncome = discretionaryIncome;	
	}
	public int getShoeSize(){
		return shoeSize;
	}
	public void setShoeSize(int shoeSize){
		this.shoeSize = shoeSize;
	}
	public int getNumOfShoes(){
		return numOfShoes;
	}
	public void setNumOfShoes(int numOfShoes){
		this.numOfShoes = numOfShoes;
	}

	public void clientInfo(){
		System.out.printf("discretionary Income is: %d, shoe Size is: %d, number Of Shoes are: %d \n", discretionaryIncome, shoeSize, numOfShoes);
	}

	public Shoe buyShoe(Shoe shoe){
		if(discretionaryIncome <= shoe.getPrice() || shoeSize != shoe.getSize() || numOfShoes >= 50){
			System.out.println("whats a pity, you can't buy this shoe.");
			return null;
		} else{
			discretionaryIncome -= shoe.getPrice();
			numOfShoes++;
			System.out.println("Shoe purchased successfully!");
			return shoe;
		}
	}

}