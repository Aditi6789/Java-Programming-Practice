package collections;

import java.util.LinkedList;

/**
 * LinkedList Demo - Demonstrates Doubly Linked List using LinkedList
 * Example: Music Playlist - Efficient add/remove anywhere in playlist
 * Author: Aditi
 * Time Complexity: O(1) for addFirst/last/remove, O(n) for get
 * Concepts Covered: 1. add 2. addFirst 3. addLast 4. removeFirst 5. removeLast 6. get
 */
public class LinkedListDemo {
    public static void main(String[] args) {

        // 1. Create Playlist - LinkedList is best for frequent add/remove
        LinkedList<String> playlist = new LinkedList<>();

        // 2. Add songs
        playlist.add("Kesariya");
        playlist.add("Apna Bana Le");
        playlist.add("Heeriye");
        playlist.add("Chaleya");

        System.out.println("Playlist: " + playlist);

        // 3. Add favorite song at start and end
        playlist.addFirst("Safar - Most Played");
        playlist.addLast("New Release");
        System.out.println("After adding first & last: " + playlist);

        // 4. Play next and previous - LinkedList specialty
        System.out.println("Now Playing: " + playlist.peekFirst());
        System.out.println("Last in queue: " + playlist.peekLast());

        // 5. Remove played songs
        playlist.pollFirst();
        playlist.pollLast();
        System.out.println("After playing/removing: " + playlist);

        // 6. Remove a song from middle - O(n) search but O(1) removal
        playlist.remove("Heeriye");
        System.out.println("After removing Heeriye: " + playlist);
    }
}