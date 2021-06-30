package Beta.copy;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Demo1 {
	
	private static Logger log=LogManager.getLogger(Demo1.class.getName());
	public static void main(String[] args) {
		// TODO Auto-generated method stub

log.debug("debug message");

	log.info("info loggs");

	log.error("error message");
	log.fatal("fatal message");

	}

}
