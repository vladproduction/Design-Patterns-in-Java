package vladproduction.mediator.demo;

import java.util.Timer;
import java.util.TimerTask;

public class TimerAsMediatorRole {

    private Timer timer;

    public TimerAsMediatorRole(int seconds) {
        timer = new Timer();
        timer.schedule(new OnStart(), seconds*1000);
        timer.schedule(new OnStartAction(), seconds*2*1000);
        timer.schedule(new TimesUp(), seconds*3*1000);
    }

    private class OnStart extends TimerTask {
        @Override
        public void run() {
            System.out.println("Attention!");
            System.out.println("3-->2-->");
        }
    }

    private class OnStartAction extends TimerTask {
        @Override
        public void run() {
            System.out.println("Times RUN");
        }
    }

    private class TimesUp extends TimerTask {
        @Override
        public void run() {
            System.out.println("Times UP!!!");
            System.out.println("Congratulation with a finishing!!!");
            timer.cancel();
        }
    }

    public static void main(String[] args) {
        System.out.println("Start line prepared");
        new TimerAsMediatorRole(2);
    }
}
