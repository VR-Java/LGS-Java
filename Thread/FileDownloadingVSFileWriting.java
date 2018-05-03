package part2;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

public class Program {

	public static void main(String[] args) throws Exception {
		
		Thread t1 = new Thread() {
			public void run() {
				URL url = null;
				try {
					url = new URL("https://www.akamai.com/uk/en/multimedia/images/intro/image-manager-intro.png");
				} catch (MalformedURLException e) {
					e.printStackTrace();
				}
				try (
						InputStream is = url.openStream();
						FileOutputStream fos = new FileOutputStream("img.png");
						) {
					int b;
					while((b = is.read()) != -1) {
						fos.write(b);
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		};
		
		Thread t2 = new Thread(() -> {
			try (
					FileWriter fw = new FileWriter("t.txt");
					) {
				double res = 1;
				for (int i = 1; t1.isAlive();i++) {
					res *= i;
					fw.append(String.valueOf(res));
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		});
		
		t1.start();
		t2.start();
		t1.join();
		t2.join();
	}

}
