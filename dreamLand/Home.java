public class Home{
	private Room[] room;

	public Room[] getRoom(){
		return room;
	}
	public void setRoom(Room[] room){
		this.room = room;
	}

	public int calculateHomeSqm(){
		int homeSqm = 0; 
		for(Room r : this.getRoom()){
			homeSqm += r.getSqm();
		}
		return homeSqm;
	} 
}