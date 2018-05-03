import java.io.Serializable;

public class User implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5399783700261954288L;
	private String username;
	private String pass;
//	private transient Pet pet = new Pet();
	private int age;
	public User(String username, String pass) {
		super();
		this.username = username;
		this.pass = pass;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	public String forWrite() {
		return username + "&&" + pass + "\n";
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", pass=" + pass + ", age=" + age + "]";
	}
	
}


// ---------------------------------------------------------------------------------------


import java.io.*;
import java.net.URL;

public class Main {

	public static void main(String[] args) throws Exception {
//		System.out.println(System.getProperty("file.separator"));
//		System.out.println(System.getProperty("user.home"));
//		System.out.println(System.getProperty("java.home"));
		File f = new File("text.txt");
		System.out.println(f.exists());
		System.out.println(f.canWrite());
//		System.out.println(f.mkdirs());
		f.createNewFile();
		
//		FileOutputStream fos = new FileOutputStream(f);
//		fos.write('я');
//		for (int i = 0; i < 256; i++) {
//			fos.write(i);
//		}
		
//		fos.close();
		
		URL url = new URL("https://upload.wikimedia.org/wikipedia/commons/9/9a/Gull_portrait_ca_usa.jpg");
		InputStream is = url.openStream();
		
		FileOutputStream fos = new FileOutputStream("img.png");
		
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		int b;
		while((b = is.read()) != -1) {
			bos.write(b);
		}
		is.close();
		bos.close();
		fos.close();
		
//		FileWriter fw = new FileWriter("bc.txt");
//		fw.write(new User("Ivan", "pass").forWrite());
//		fw.write(new User("Yura", "passa").forWrite());
//		fw.write(new User("Юра", "asdas").forWrite());
//		fw.close();
		
//		FileOutputStream fos = new FileOutputStream("backup");
//		ObjectOutputStream oos = new ObjectOutputStream(fos);
//		oos.writeObject(new User("Ivan", "pass"));
		
//		FileInputStream fis = new FileInputStream("backup");
//		ObjectInputStream ois = new ObjectInputStream(fis);
//		Object o = ois.readObject();
//		
//		if (o instanceof User) {
//			User u = (User) o;
//			
//		}
//		
//		System.out.println(o);
	}

}

