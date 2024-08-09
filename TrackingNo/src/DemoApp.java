public class DemoApp {
    public static void main(String[] args) {
        TrackingNumberGenerator generator = new TrackingNumberGenerator();

        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                for (int j = 0; j < 10; j++) {
                    long trackingNumber1 = generator.generateTrackingNumber();
                    System.out.println("Tracking Number: " + trackingNumber1);
                }
            }).start();
        }
    }
}
