import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantLock;

public class TrackingNumberGenerator {
    private static final AtomicLong trackingNumber = new AtomicLong(0);
    private static final ReentrantLock lock = new ReentrantLock();

    public static long generateTrackingNumber() {
        lock.lock();
        try {
            return trackingNumber.getAndIncrement();
        } finally {
            lock.unlock();
        }
    }
}
