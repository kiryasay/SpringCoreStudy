package kiryasay.spring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Neil Alishev
 */
@Component
public class RockMusic implements Music {
    private List<String> songs;
    public RockMusic()
    {
        songs = new ArrayList<>(3);
        songs.add("Queen");
        songs.add("Nirvana");
        songs.add("Kino");
    }
    @Override
    public String getSong(int id) {
        return songs.get(id);
    }
}