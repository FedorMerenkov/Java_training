package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> members1 = new ArrayList<>();
        members1.add(" ads");
        members1.add(" adsd");
        members1.add(" adsc");
        members1.add(" adse");
        members1.add(" adsi");

        MusicBand band1 = new MusicBand("MJ", 1959, members1);
        List<String> members2 = new ArrayList<>();
        members2.add(" ABC");
        members2.add(" ABCA");
        members2.add(" ABCB");
        members2.add(" ABCE");
        members2.add(" ABCI");

        MusicBand band2 = new MusicBand("GlOC", 1960, members2);
        band1.printMembers();
        band2.printMembers();
        MusicBand.transferMembers(band1, band2);
        band1.printMembers();
        band2.printMembers();
    }
}
