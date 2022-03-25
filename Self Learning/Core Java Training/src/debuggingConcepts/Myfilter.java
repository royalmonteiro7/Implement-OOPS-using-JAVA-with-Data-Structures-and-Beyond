package debuggingConcepts;

import java.util.logging.Filter;
import java.util.logging.Level;
import java.util.logging.LogRecord;

public class Myfilter implements Filter {

	@Override
	public boolean isLoggable(LogRecord log) {
		// dont log config files in log
		if (log.getLevel() == Level.CONFIG)
			return true;
		return true;
	}

}
