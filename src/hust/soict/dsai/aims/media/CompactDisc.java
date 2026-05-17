package hust.soict.dsai.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable {
    private String artist;
    private ArrayList<Track> tracks = new ArrayList<Track>();

    public CompactDisc(String title, String category, String director, int length, float cost, String artist) {
        super(title, category, director, length, cost);
        this.artist = artist;
    }

    public String getArtist() { return artist; }

    public void addTrack(Track track) {
        if (!tracks.contains(track)) {
            tracks.add(track);
        } else {
            System.out.println("Track already exists.");
        }
    }

    public void removeTrack(Track track) {
        tracks.remove(track);
    }

    @Override
    public int getLength() {
        int total = 0;
        for (Track track : tracks) {
            total += track.getLength();
        }
        return total;
    }

    @Override
    public void play() {
        System.out.println("Playing CD: " + this.getTitle() + " by " + this.getArtist());
        for (Track track : tracks) {
            track.play();
        }
    }
}