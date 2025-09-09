import java.util.LinkedList;
import java.util.Queue;

// 🎵 Base class for media playback - can be extended for polymorphism
class MediaPlayer {
    public void play(String mediaName) {
        System.out.println("Now playing: " + mediaName);
    }
}

// 🎧 MusicPlayer extends MediaPlayer - shows Polymorphism
public class MusicPlayer extends MediaPlayer {

    // 🎶 Playlist is maintained as a Queue using LinkedList
    private Queue<String> playlist;

    // 🛡️ Encapsulation: playlist is private and accessed via methods only
    public MusicPlayer() {
        playlist = new LinkedList<>();
    }

    // ➕ Add a song to the playlist
    public void addSong(String songName) {
        playlist.offer(songName); // Adds to the end of the queue
        System.out.println("Added to playlist: " + songName);
    }

    // ➖ Remove a song from the playlist
    public void removeSong(String songName) {
        if (playlist.remove(songName)) {
            System.out.println("Removed from playlist: " + songName);
        } else {
            System.out.println("Song not found in playlist: " + songName);
        }
    }

    // ▶️ Play the next song in the queue
    public void playNext() {
        if (!playlist.isEmpty()) {
            String nextSong = playlist.poll(); // Removes and returns head
            play(nextSong); // 👈 From MediaPlayer class
        } else {
            System.out.println("Playlist is empty. Add some songs!");
        }
    }

    // 📃 Show the current playlist
    public void showPlaylist() {
        if (playlist.isEmpty()) {
            System.out.println("🎵 Playlist is empty.");
        } else {
            System.out.println("🎵 Current Playlist:");
            for (String song : playlist) {
                System.out.println(" - " + song);
            }
        }
    }
}

// 🚀 Let's test it with a main method
class Main {
    public static void main(String[] args) {
        MusicPlayer myPlayer = new MusicPlayer();

        // Add some songs
        myPlayer.addSong("🎶 Shape of You");
        myPlayer.addSong("🎶 Believer");
        myPlayer.addSong("🎶 Counting Stars");

        // Show playlist
        myPlayer.showPlaylist();

        // Play next song
        myPlayer.playNext();

        // Remove a song
        myPlayer.removeSong("🎶 Believer");

        // Show updated playlist
        myPlayer.showPlaylist();

        // Play remaining songs
        myPlayer.playNext();
        myPlayer.playNext();

        // Try playing again when playlist is empty
        myPlayer.playNext();
    }
}
