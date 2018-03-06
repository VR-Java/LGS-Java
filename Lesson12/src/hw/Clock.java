package hw;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class Clock {

	public static class Minute {
		private LocalTime minute;
		private double koef;

		private Minute(LocalTime t) {
			this.minute = t;
			this.koef = 0;
		}

		@Override
		public String toString() {
			return minute + " k=" + koef;
		}
		
		public void setKoef(double koef) {
			this.koef = koef;
		}
		
		public double getKoef() {
			return this.koef;
		}
		
		public LocalTime getMinute() {
			return this.minute;
		}
		
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((minute == null) ? 0 : minute.hashCode());
			return result;
		}


		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Minute other = (Minute) obj;
			if (minute == null) {
				if (other.minute != null)
					return false;
			} else if (!minute.equals(other.minute))
				return false;
			return true;
		}
	}

	
	private static List<Minute> list = new ArrayList<>();

	
	public static List<Minute> getList() {
		init();
		return list;
	}


	public static void init() {
		LocalTime start = LocalTime.parse("00:00:00");
		LocalTime finish = LocalTime.parse("23:59:59");

		list = createList(start, finish);
		for (int i = 0; i < list.size(); i++) {
			list.get(i).setKoef(koef(i));
		}
		//return list;
	}

	
	public static List<Minute> createList(LocalTime start, LocalTime finish) {
		long workTime = ChronoUnit.MINUTES.between(start, finish);
		List<Minute> list = new ArrayList<>();
		LocalTime currTime;

		for (int i = 0; i <= (int) workTime; i++) {
			currTime = start.plus(i, ChronoUnit.MINUTES);
			list.add(new Minute(currTime));
		}
		return list;
	}

	
	public static double koef(int i) {
		if (i < 450) {
			return 1.5;
		} else if (i >= 450 && i < 1050) {
			return 1;
		} else if (i >= 1050 && i < 1260) {
			return 1.25;
		} else {
			return 1.5;
		}
	}
	

	

}
