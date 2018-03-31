package test;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CinemaUtils {
	
	
	Set<Session> sessions = new HashSet<>();
	
	Map<Set<Session>, LocalDateTime> shedule = new HashMap<>();
	
	public Map<Set<Session>, LocalDateTime> getShedule(){
		return shedule;
	}
	
	public Set<Film> getAllFilms(){
		Set<Film> films = new HashSet<>();
		
		Set<Map.Entry<Set<Session>, LocalDateTime>> sheduleS = shedule.entrySet();
		Iterator<Map.Entry<Set<Session>, LocalDateTime>> i = sheduleS.iterator();
		while (i.hasNext()) {
			Map.Entry<Set<Session>, LocalDateTime> currentSeance = i.next();
			Set<Session> s = currentSeance.getKey();
			Iterator<Session> iterS = s.iterator();
			while (iterS.hasNext()) {
				Session currentS = iterS.next();
				films.add(currentS.getFilm());
			}
		}
		return films;
	}

	public void addFilm(Film film, Room room, LocalDateTime time) {
		Session session = new Session(film, room);
		sessions.add(session);
		shedule.put(sessions, time);
	}
	
	public Film addFilm(String name){
		return new Film(name);
	}
//	
//	public Film addFilmToShedule(Session session, LocalDateTime time){
//		sessions.add(session);
//		return shedule.put(sessions, time);
//	}

	// removes Film completely (from all rooms, all sessions)
	public void removeFilm(Film film) {
		Set<Map.Entry<Set<Session>, LocalDateTime>> sheduleS = shedule.entrySet();
		Iterator<Map.Entry<Set<Session>, LocalDateTime>> i = sheduleS.iterator();
		while (i.hasNext()) {
			Map.Entry<Set<Session>, LocalDateTime> currentSeance = i.next();
			Set<Session> s = currentSeance.getKey();
			Iterator<Session> iterS = s.iterator();
			while (iterS.hasNext()) {
				Session currentS = iterS.next();
				if (currentS.getFilm().equals(film)) {
					iterS.remove();
				}
			}
		}
	}
	
	public Room addRoom(int roomNumber){
		return new Room(roomNumber);
	}
	
	public void addSession(Film film, Room room){
		sessions.add(new Session(film, room));
	}
	
	public void addSession(Session session){
		sessions.add(session);
	}
	
	

}
