public class NightTimer extends Thread {
    @Override
    public void run() {
        int nightLength = 360; // This is 6 minutes converted to seconds.
        while (nightLength > 0) {
            try {
                Thread.sleep(1000);
                nightLength -= 1;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
