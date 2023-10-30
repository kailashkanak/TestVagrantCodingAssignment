import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class RecentlyPlayedStoreTest {
    @Test
    public void testRecentlyPlayedStore() {
        RecentlyPlayedStore store = new RecentlyPlayedStore(3);

        store.playSong("User1", "S1");
        store.playSong("User1", "S2");
        store.playSong("User1", "S3");
        assertEquals(store.getRecentlyPlayedSongs("User1"), Arrays.asList("S1", "S2", "S3"));

        store.playSong("User1", "S4");
        assertEquals(store.getRecentlyPlayedSongs("User1"), Arrays.asList("S2", "S3", "S4"));

        store.playSong("User1", "S2");
        assertEquals(store.getRecentlyPlayedSongs("User1"), Arrays.asList("S3", "S4", "S2"));

        store.playSong("User1", "S1");
        assertEquals(store.getRecentlyPlayedSongs("User1"), Arrays.asList("S4", "S2", "S1"));
    }

    @Test
    public void testEmptyStore() {
        RecentlyPlayedStore store = new RecentlyPlayedStore(3);
        assertTrue(store.getRecentlyPlayedSongs("User1").isEmpty());
    }

    @Test
    public void testCapacityExceeded() {
        RecentlyPlayedStore store = new RecentlyPlayedStore(2);

        store.playSong("User1", "S1");
        store.playSong("User1", "S2");
        store.playSong("User1", "S3");

        assertEquals(store.getRecentlyPlayedSongs("User1"), Arrays.asList("S2", "S3"));
    }
}