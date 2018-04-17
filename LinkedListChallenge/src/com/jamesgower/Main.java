package com.jamesgower;

import java.util.*;

/**
 * Created by james on 20/06/2017.
 */
public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Album> albums = new ArrayList<>();

    public static void main(String[] args) {
        Album album = new Album("The Commitment", "Cadet");
        album.addSong("Intro", 2.40);
        album.addSong("From The Roads", 4.57);
        album.addSong("No Way", 3.45);
        album.addSong("Gipset Flow", 3.17);
        album.addSong("Wanna Know Why", 2.05);
        albums.add(album);

        album = new Album("Pure Koke: Volume 1", "K Koke");
        album.addSong("My Bitch", 3.12);
        album.addSong("Watching Me", 3.21);
        album.addSong("I Ain't Perfect", 2.06);
        album.addSong("Fuck Dis Life", 2.45);
        albums.add(album);

        album = new Album("Common Sense", "J Hus");
        album.addSong("Common Sense",2.10);
        album.addSong("Leave Me",2.17);
        album.addSong("Plottin",2.40);
        album.addSong("Fisherman ft. MoStack & MIST",3.15);
        album.addSong("Good Time ft. Burna Boy",2.59);
        album.addSong("Good Luck Chale ft. Tiggs Da Author", 2.45);
        album.addSong("Did You See",4.10);
        album.addSong("Spirit",2.40);
        albums.add(album);

        album = new Album("Final Flash", "AJ Tracey");
        album.addSong("Final Flash", 3.28);
        albums.add(album);

        List<Song> playlist = new ArrayList<Song>();
        albums.get(2).addSongToPlaylist("Did You See", playlist);
        albums.get(0).addSongToPlaylist("Gipset Flow", playlist);
        albums.get(0).addSongToPlaylist("Wanna Know Why", playlist);
        albums.get(0).addSongToPlaylist("Fail", playlist); // Test for fail
        albums.get(3).addSongToPlaylist(1, playlist);
        albums.get(1).addSongToPlaylist(1, playlist);
        albums.get(1).addSongToPlaylist(2, playlist);
        albums.get(1).addSongToPlaylist(3, playlist);
        albums.get(1).addSongToPlaylist(4, playlist);
        albums.get(2).addSongToPlaylist(8, playlist);
        albums.get(1).addSongToPlaylist(24, playlist); //Test for fail


        play(playlist);
    }

    private static void play(List<Song> playlist) {
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> listIterator = playlist.listIterator();
        if(playlist.size() == 0) {
            System.out.println("No songs in the playlist");
            return;
        }
        else {
            System.out.println("Now playing: " + listIterator.next().toString());
            printMenu();
        }

        while(!quit) {
            int action = scanner.nextInt();
            switch(action) {
                case 0: //Quit playlist
                    System.out.println("Closing down...");
                    quit = true;
                    break;

                case 1: //Next Song
                    if(!forward) {
                        if(listIterator.hasNext()) {
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if(listIterator.hasNext()) {
                        System.out.println("Now playing: " + listIterator.next().toString());
                    }
                    else {
                        System.out.println(listIterator.previous().getTitle() + " is the end of the playlist");
                        forward = false;
                    }
                    break;

                case 2: //Previous Song
                    if(forward) {
                        if(listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if(listIterator.hasPrevious()) {
                        System.out.println("Now playing: " + listIterator.previous().toString());
                    }
                    else {
                        System.out.println(listIterator.next().getTitle() + " is already the start of the playlist");
                        forward = true;
                    }
                    break;

                case 3: //Replay track
                    if(forward) {
                        System.out.println("Replaying " + listIterator.previous().toString());
                    }
                    else if(!forward) {
                        System.out.println("Replaying " + listIterator.next().toString());
                    }
                    break;

                case 4: //Remove track
                    String deletedSong;
                    if(forward) {
                        deletedSong = listIterator.previous().getTitle();
                        System.out.println(deletedSong + " has been removed from the playlist");
                    }
                    else if(!forward) {
                        deletedSong = listIterator.next().getTitle();
                        System.out.println(deletedSong + " has been removed from the playlist\n" +
                                "The playlist is now: ");
                    }
                    listIterator.remove();


                case 5:
                    printList(playlist);
                    break;
                case 6:
                    printMenu();
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("Available options:\n" +
                "0 - Quit Playlist\n" +
                "1 - Next Song\n" +
                "2 - Previous Song\n" +
                "3 - Replay Current Track\n" +
                "4 - Remove Current Song From Playlist\n" +
                "5 - Print All Songs In Playlist\n" +
                "6 - Show Menu Options");
    }

    private static void printList(List<Song> playlist) {
        for (int i=0; i < playlist.size(); i++) {
            System.out.println((i+1) + " - " + playlist.get(i).toString());
        }
    }

}
