package coding.assignment;

public class TestingCode {

	public static void main(String[] args) {
		RecentlyPlayedSongsStore store = new RecentlyPlayedSongsStore(3);

        store.playSong("S1", "user1");
        store.playSong("S2", "user1");
        store.playSong("S3", "user1");

        System.out.println(store.getRecentlyPlayedSongs("user1")); 

        store.playSong("S4", "user1");
        System.out.println(store.getRecentlyPlayedSongs("user1")); 

        store.playSong("S2", "user1");
        System.out.println(store.getRecentlyPlayedSongs("user1")); 

        store.playSong("S1", "user1");
        System.out.println(store.getRecentlyPlayedSongs("user1")); 

	}

}
