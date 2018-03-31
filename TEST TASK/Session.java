package test;

public class Session {
	
	private Film film;
	private Room room;
	
	public Session(Film film, Room room) {
		this.film = film;
		this.room = room;
	}

	public Film getFilm() {
		return film;
	}

	public void setFilm(Film film) {
		this.film = film;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	@Override
	public String toString() {
		return "Session [film=" + film + ", room=" + room + "]";
	}
	

}
