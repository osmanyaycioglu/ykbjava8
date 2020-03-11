package ykb.com.ykb.java.train.inputstreams;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.Reader;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class StreamsMain {
	public static void main(final String[] args) {
		StreamsMain.multipleParam("os", "mos", "cos");
		StreamsMain.multipleParam2(new String[] { "os", "mos", "cos" });

		File file = new File("cust.txt");
		try {
			FileInputStream fs = new FileInputStream(file);
			FileChannel channel = fs.getChannel();
			ByteBuffer dst = ByteBuffer.allocateDirect(4 * 1024 * 1024);
			int read2 = channel.read(dst);

			byte[] bytesToRead = new byte[4 * 1024 * 1024];
			BufferedInputStream bis = new BufferedInputStream(fs);
			bis.read(bytesToRead);
			int read = fs.read(bytesToRead);

			Reader reader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(reader);
			String readLine = bufferedReader.readLine();

			byte[] readAllBytes = Files.readAllBytes(Paths.get("cust.txt"));

			List<String> rl = Files.readAllLines(Paths.get("cust.txt"), Charset.forName("UTF-8"));

			// osman,yay,osmany,12345,ALTIN,TL#1200;DOLAR#1300
			Files.write(Paths.get("test.txt"), bytesToRead, StandardOpenOption.CREATE, StandardOpenOption.APPEND);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void multipleParam(final String... str) {

	}

	public static void multipleParam2(final String[] str) {

	}

}
