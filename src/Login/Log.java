package Login;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.FileHandler;
import java.util.logging.Formatter;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

public class Log {
	private Logger log = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	
	public Log(){
		String loggerName = Log.class.getSimpleName();
		Logger root = Logger.getLogger(loggerName);
		FileHandler txt = null;
		try {
			txt = new FileHandler("log.txt",true);
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		root.setLevel(Level.ALL);
		txt.setFormatter(new Formatter() {
			
			@Override
			public String format(LogRecord record) {
				String ret = "";
				SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/ HH:mm");
				Date d = new Date(record.getMillis());
				ret += df.format(d);
				if(record.getLevel().intValue() >= Level.WARNING.intValue())
				{
					ret += "Attention!: ";
				}
				ret += record.getLevel();
				
				
				ret += " " + this.formatMessage(record)+ "\r\n";
				
				return ret;
			}
		});
		root.addHandler(txt);
	}

	public static void main(String[] args) {
		Log lm = new Log();
		lm.dosmt();
	}

	private void dosmt() {
		log.severe("Error STH");
		log.severe("Error STH");
		log.warning("Test");
		log.info("Ds ist eine Info");
	}

}
