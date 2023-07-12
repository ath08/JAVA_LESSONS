public class Main{
	public static void main(String[] args){
		Certificate cert = new Certificate();

		cert.setId(152);
		cert.setDate("15-May-2013");
		
		System.out.println(cert.getId());
		System.out.println(cert.getDate());

		Space dreamLend = new Space();
		dreamLend.setSqm(1000);
		System.out.println(dreamLend.getSqm());

		Home[] homes = new Home [5];

		for(int i = 0; i < homes.length; i++){
			Home home = new Home();
			Room[] rooms = new Room[4];

			for(int j = 0; j < rooms.length; j++){
				Room room = new Room();
				room.setSqm(50);
				rooms[j] = room;
			}
			home.setRoom(rooms); 
			homes[i] = home;
		}

		dreamLend.setHome(homes);		
	}
}