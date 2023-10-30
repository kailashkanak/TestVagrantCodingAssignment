The `RecentlyPlayedStore` class is a Java implementation for managing a user's recently played songs. It keeps track of the most recent songs played by users and provides a method to retrieve them. This README serves as a guide to understanding and using the class.
Create an instance of the `RecentlyPlayedStore` RecentlyPlayedStore store = new RecentlyPlayedStore(3);
Add songs to the store for a user using the playSong method.
  store.playSong("User1", "S1");
  store.playSong("User1", "S2");
  store.playSong("User1", "S3");
Retrieve the recently played songs for a user using the getRecentlyPlayedSongs method
  List<String> user1RecentlyPlayedSongs = store.getRecentlyPlayedSongs("User1");
The store automatically manages the number of songs to keep based on the specified capacity. 
  RecentlyPlayedStore store = new RecentlyPlayedStore(3);
  store.playSong("User1", "S1");
  store.playSong("User1", "S2");
  store.playSong("User1", "S3");
  List<String> user1RecentlyPlayedSongs = store.getRecentlyPlayedSongs("User1");
  
