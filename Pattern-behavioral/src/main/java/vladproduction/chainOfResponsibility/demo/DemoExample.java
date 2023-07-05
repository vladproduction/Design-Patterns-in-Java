package vladproduction.chainOfResponsibility.demo;


import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DemoExample {

    private static final Logger logger = Logger.getLogger(DemoExample.class.getName());

    public static void main(String[] args) {

        //level to log at
        logger.setLevel(Level.FINER);

        ConsoleHandler handler = new ConsoleHandler();
        //level to publish at
        handler.setLevel(Level.FINER);
        logger.addHandler(handler);

        logger.finest("Finest level of logging"); //this one won't print
        logger.finer("Finer level, but not as fine as finest");
        logger.fine("Fine, but not as fine as finer or finest");

//        Jul 05, 2023 9:57:39 PM vladproduction.chainOfResponsibility.demo.DemoExample main
//        FINER: Finer level, but not as fine as finest
//        Jul 05, 2023 9:57:40 PM vladproduction.chainOfResponsibility.demo.DemoExample main
//        FINE: Fine, but not as fine as finer or finest


    }
}
