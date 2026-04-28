package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        MusicBand musicBand1 = new MusicBand(" 1",2000);
        MusicBand musicBand2 = new MusicBand(" 2",2000);
        MusicBand musicBand3 = new MusicBand(" 3",2000);
        MusicBand musicBand4 = new MusicBand(" 4",2000);
        MusicBand musicBand5 = new MusicBand(" 5",2000);
        MusicBand musicBand6 = new MusicBand(" 6",2000);
        MusicBand musicBand7 = new MusicBand("772",2000);
        MusicBand musicBand8 = new MusicBand(" 8",2000);
        MusicBand musicBand9 = new MusicBand(" 9",2000);
        MusicBand musicBand10 = new MusicBand(" 102",2000);
        List<MusicBand> bands = new ArrayList<>();
        bands.add(musicBand1);
        bands.add(musicBand2);
        bands.add(musicBand3);
        bands.add(musicBand4);
        bands.add(musicBand5);
        bands.add(musicBand6);
        bands.add(musicBand7);
        bands.add(musicBand8);
        bands.add(musicBand9);
        bands.add(musicBand10);
        Collections.shuffle(bands);
        List<MusicBand> result = groupsAfter2000(bands);
        System.out.println(result);
    }
    public static List<MusicBand> groupsAfter2000 (List<MusicBand>bands) {
        List<MusicBand> result = new ArrayList<>();
        for (MusicBand band : bands) {
            if (band.getYear() > 2000) {
                result.add(band);
            }
        }
        return result;
    }
}
