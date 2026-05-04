package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist> members1 = new ArrayList<>();
        members1.add(new MusicArtist("OG", 80));
        members1.add(new MusicArtist("OGC", 70));
        members1.add(new MusicArtist("OGB", 90));
        members1.add(new MusicArtist("OGD", 50));
        members1.add(new MusicArtist("OGI", 40));

        MusicBand band1 = new MusicBand("MJ", 1959, members1);

        List<MusicArtist> members2 = new ArrayList<>();
        members2.add(new MusicArtist("OGa", 70));
        members2.add(new MusicArtist("OGb", 80));
        members2.add(new MusicArtist("OGc", 90));
        members2.add(new MusicArtist("OGd", 30));
        members2.add(new MusicArtist("OGe", 20));

        MusicBand band2 = new MusicBand("GlOC", 1960, members2);

        band1.printMembers();
        band2.printMembers();
        MusicBand.transferMembers(band1, band2);
        band1.printMembers();
        band2.printMembers();
    }
}
