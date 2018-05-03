package oop_9;

import java.util.*;

public class Main {

	public static void main(String[] args) {
//		Set<String> strs = new HashSet<>();
//		strs.add("Igor");
//		strs.add("Vitalik");
//		strs.add("Igor");
//		strs.add("Yura");
//		strs.add("igor");
//		
//		System.out.println(strs);
		
		Set<Player> set = new LinkedHashSet<>();
		System.out.println(set.add(
				new Player("Igor", 1, 20000, 30000, 100.0)));
		System.out.println(set.add(
				new Player("Igor", 5, 20000, 30000, 100.0)));
		System.out.println(set.add(
				new Player("Vitalik", 31, 55500, 30000, 100.0)));
		System.out.println(set.add(
				new Player("Yura", 10, 233000, 310000, 400.0)));
		System.out.println(set.add(
				new Player("Ira", 8, 50000, 80000, 800.0)));
		System.out.println(set.add(
				new Player("Roman", 3, 2210000, 50000, 500.0)));
		System.out.println(set.add(
				new Player("Igor", 1, 40000, 650000, 5500.0)));
		
		Iterator<Player> i = set.iterator();
		while (i.hasNext()) {
			Player p = i.next();
			if (p.getLvl() < p.getExperience() / 10000) {
				System.out.print(p.getUsername() + " lvl=" +
						p.getLvl() + ", level up to ");
				p.setLvl((int) (p.getExperience() / 10000));
				System.out.println(p.getLvl());
			}
			if (p.getHealth() < p.getLvl() * 100) {
				p.setHealth(p.getLvl() * 100);
			}
			
		}
		
		set.forEach(System.out::println);
	}

}


//----------------------------------------------------------------------------------------------

package oop_9;

public class Player {
	private String username;
	private int lvl;
	private int money;
	private long experience;
	private double health;
	
	public Player(String username, int lvl, int money, long experience, double health) {
		this.username = username;
		this.lvl = lvl;
		this.money = money;
		this.experience = experience;
		this.health = health;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getLvl() {
		return lvl;
	}

	public void setLvl(int lvl) {
		this.lvl = lvl;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public long getExperience() {
		return experience;
	}

	public void setExperience(long experience) {
		this.experience = experience;
	}

	public double getHealth() {
		return health;
	}

	public void setHealth(double health) {
		this.health = health;
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (experience ^ (experience >>> 32));
		long temp;
		temp = Double.doubleToLongBits(health);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + money;
		result = prime * result + ((username == null) ? 0 : username.hashCode());
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
		Player other = (Player) obj;
		if (experience != other.experience)
			return false;
		if (Double.doubleToLongBits(health) != Double.doubleToLongBits(other.health))
			return false;
		if (money != other.money)
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Player [username=" + username + ", lvl=" + lvl + ", money=" + money + ", experience=" + experience
				+ ", health=" + health + "]";
	}
}
