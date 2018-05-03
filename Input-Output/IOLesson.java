package cw;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
//		System.out.println(System.getProperty("file.separator"));
//		System.out.println(System.getProperty("user.home"));
//		System.out.println(System.getProperty("java.home"));

		
		File f = new File("text.txt");
		System.out.println(f.exists());
		System.out.println(f.canWrite());
//		f.mkdirs();
		f.createNewFile();
		
//		FileOutputStream fos = new FileOutputStream(f);
//		
//		for (byte i = Byte.MIN_VALUE; i < Byte.MAX_VALUE; i++) {
//			fos.write(i);
//		}
//		
//		fos.close();
		
		
//		URL url = new URL("http://juicep.ru/wp-content/uploads/2016/04/s6-2.jpg");
//		InputStream is = url.openStream();
//		
//		FileOutputStream fos = new FileOutputStream("img.png");
//		
//		int b;
//		while((b = is.read()) != -1) {
//			fos.write(b);
//		}
//		
//		is.close();
//		fos.close();
		
		
//		URL url = new URL("http://juicep.ru/wp-content/uploads/2016/04/s6-2.jpg");
//		InputStream is = url.openStream();
//		
//		FileOutputStream fos = new FileOutputStream("img.png");
//		BufferedOutputStream bos = new BufferedOutputStream(fos, 102400);
//		
//		int b;
//		while((b = is.read()) != -1) {
//			bos.write(b);
//		}
//		
//		bos.flush();
//		is.close();
//		bos.close();
//		
		
		FileWriter fw = new FileWriter("bc.txt", true);
		
		fw.write(new User("Ivan", "12345").forWrite());
		fw.write(new User("Oleg", "147258").forWrite());
		fw.write(new User("Taras", "659741").forWrite());
		fw.write(new User("Petro", "125452").forWrite());
		fw.write(new User("Alla", "002100").forWrite());

		fw.close(); 
		
		
		
		FileReader fr = new FileReader("bc.txt");
//		int b;
//		while ((b = fr.read()) != -1) {
//			
//		}
		
		BufferedReader br = new BufferedReader(fr);
		String text;
		while ((text = br.readLine())!= null) {
			text = br.readLine();
			System.out.println(text);
			String[] arg = text.split("&&");
			User u = new User(arg[0], arg[1]);
			System.out.println(u);
		}
		
		
		
//		FileOutputStream fos = new FileOutputStream("backup");
//		ObjectOutputStream oos = new ObjectOutputStream(fos);
//		oos.writeObject(new User("Ivan", "1111"));
//				
//
//		FileInputStream fis = new FileInputStream("backup");
//		ObjectInputStream ois = new ObjectInputStream(fis);
//		
//
//		Object o = ois.readObject();
//		if (o instanceof User) {
//			User u = (User) o;
//		}
//		
//		System.out.println(o);
		
	}

}
