import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LoadArray {
	private int length;
	private String path;
	
	public LoadArray(String path, int length) {
		super();
		this.path = path;
		this.length = length;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
	
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public String[] loadArray() {
		String arrayToLoad [] = new String[this.getLength()];
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(this.getPath()));
			String line = reader.readLine();
			while (line != null) {
				for (int i=0; i<arrayToLoad.length; i++) {
					arrayToLoad[i] = line;
				}
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return arrayToLoad;
	}

}
