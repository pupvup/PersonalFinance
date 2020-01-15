package personalfinance.settings;

import org.ini4j.Ini;
import org.ini4j.IniPreferences;
import org.ini4j.Wini;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Locale;
import java.util.prefs.Preferences;

final public class Settings {
	public static final File FONT_7373 = new File("fonts/7373.ttf");
	public static final File SAVE_DIR = new File("saves/");
	public static final String SAVE_FILE_EXT = "myrus";

	public static final String FORMAT_AMOUNT = "%.2f";
	public static final String FORMAT_RATE = "%.4f";
	public static final String FORMAT_DATE = "dd.MM.yyyy";
	public static final String FORMAT_DATE_MONTH = "LLLL yyyy";
	public static final String FORMAT_DATE_YEAR = "yyyy";

	public static final int COUNT_OVERVIEW_ROWS = 10;

	public static final String[] CURRENCY_CODES = new String[]{"RUB", "USD", "EUR", "BTC"};

	public static final File FILE_SETTINGS = new File("saves/settings.ini");
	public static File FILE_SAVE = new File("saves/default.myrus");

	public static void init() {
		try {
			Ini ini = new Ini(FILE_SETTINGS);
			Preferences prefs = new IniPreferences(ini);
			String file = prefs.node("Settings").get("SAVE_FILE", null);
			if (file != null) FILE_SAVE = new File(file);
			setLocale();
		} catch (IOException e) {
			save();
		}
	}

	private static void save() {
		try {
			Wini ini = new Wini(FILE_SETTINGS);
			ini.put("Settings", "FILE_SAVE", FILE_SAVE.getAbsolutePath());
			ini.store();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void setLocale() {
		Locale.setDefault(new Locale("ru"));
	}

	public static File getFileSave() {
		return FILE_SAVE;
	}

	public static void setFileSave(File fileSave) {
		FILE_SAVE = fileSave;
		save();
	}
}
