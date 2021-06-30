package ALpha;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Demo {
	
	private static Logger log=LogManager.getLogger(Demo.class.getName());
	public static void main(String[] args) {
		// TODO Auto-generated method stub

log.debug("debug message");


	log.info("info loggs");

	log.error("error message");
	log.fatal("fatal message");
	System.out.println("done");

	}

}
