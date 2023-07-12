public class Space{
	private int sqm;
	private Home[] homes;
	private Garage[] garages;
	private int freeSpace;

	public int getSqm(){
		return sqm;
	}
	public void setSqm(int sqm){
		this.sqm = sqm;
		this.setFreeSpace(sqm);
	}
	public Home[] getHome(){
		return homes;
	}
	public void setHome(Home[] homes){
		int totalSqm = 0;
		for(int i = 0; i < homes.length; i++){
			totalSqm += homes[i].calculateHomeSqm();
		}
		if(totalSqm <= this.getFreeSpace() && isConstructable()){
			this.homes = homes;
			this.setFreeSpace(getSqm() - totalSqm);
		}else{
			System.out.println("whats a pity");
		}

	}
	public Garage[] getGarage(){
		return garages;
	}
	public void setGarage(Garage[] garages){
		int totalSquare = 0;
		for (Garage g: garages){
			totalSquare += g.getSqm();
		}
		if(totalSquare <= this.getFreeSpace()){
			this.garages = garages;
			this.setFreeSpace(getSqm() - totalSquare);
		}
	}
	public int getFreeSpace(){
		return freeSpace; 
	}
	private void setFreeSpace(int freeSpace){
		this.freeSpace = freeSpace;
	}

	public boolean isConstructable(){
		return !(getFreeSpace() < 400);
	}

}