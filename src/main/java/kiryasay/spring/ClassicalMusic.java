package kiryasay.spring;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Neil Alishev
 */
@Component
@Scope("singleton")
public class ClassicalMusic implements Music {
    private List<String> songs;
    public ClassicalMusic()
    {
        System.out.println("ClassicalMusic Constructor");
        songs = new ArrayList<>(3);
        songs.add("Shopen");
        songs.add("Bah");
        songs.add("Chaikovskiy");
    }
    @PostConstruct
    public void doMyInit()
    {
        System.out.println("Doing ClassicalMusic initialization");
    }
    @PreDestroy //чтобы использовать нужно добавить в maven Javax Annotation API
    public void doMyDestroy()
    {
        System.out.println("Doing ClassicalMusic destroying");
    }
    @Override
    public String getSong(int id) {
        return songs.get(id);
    }
}