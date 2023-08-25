package skyWars;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.swing.JOptionPane;

public class SaveLoadGame {
	
	static SaveLoadGame Saved = null;
	private static final String SAVE_FILE = "save.ser";
	static FileOutputStream fos;
	static ObjectOutputStream oos;
	
	static FileInputStream fis;
	static ObjectInputStream ois;
	
	public static void save(TheSkyWars object) {
		try {
			fos = new FileOutputStream(SAVE_FILE);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(Saved);
			oos.close();
			JOptionPane.showMessageDialog(null, "The game was saved!");
		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "Saved not found.");
			e.printStackTrace();
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Error, game not saved.");
			e.printStackTrace();
		}
	}
	
	public static TheSkyWars load(){
		try {
			fis = new FileInputStream(SAVE_FILE);
			ois = new ObjectInputStream(fis);
			TheSkyWars Load = (TheSkyWars) ois.readObject();
			ois.close();
			JOptionPane.showMessageDialog(null, "The game was loaded!");
			return Load;
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Saved not found to load.");
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			JOptionPane.showMessageDialog(null, "Load failed.");
			e.printStackTrace();
		}
		return null;
	}

}
