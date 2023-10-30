package coding.assignment;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class RecentlyPlayedSongsStore {
	private final int capacity;
    private final Map<String, String> songUserMap;
    private final Set<String> recentlyPlayedSongs;

    public RecentlyPlayedSongsStore(int capacity) {
        this.capacity = capacity;
        this.songUserMap = new LinkedHashMap<>(capacity, 0.75f, true);
        this.recentlyPlayedSongs = new LinkedHashSet<>(capacity, 0.75f);
    }

    public void playSong(String song, String user) {
        if (songUserMap.size() >= capacity) {
            // Remove the least recently played song
            String lruSong = recentlyPlayedSongs.iterator().next();
            songUserMap.remove(lruSong);
            recentlyPlayedSongs.remove(lruSong);
        }

        // Add the song to the recently played list
        songUserMap.put(song, user);
        recentlyPlayedSongs.add(song);
    }

    public List<String> getRecentlyPlayedSongs(String user) {
        List<String> songs = new ArrayList<>();
        for (String song : recentlyPlayedSongs) {
            if (user.equals(songUserMap.get(song))) {
                songs.add(song);
            }
        }
        return songs;
    }

}

