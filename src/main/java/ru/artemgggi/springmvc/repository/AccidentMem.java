package ru.artemgggi.springmvc.repository;

import org.springframework.stereotype.Repository;
import ru.artemgggi.springmvc.model.Accident;
import java.util.ArrayList;
import java.util.List;

@Repository
public class AccidentMem {

    public static final AccidentMem instance = new AccidentMem();

    private static final class Lazy {
        private static final AccidentMem INST = new AccidentMem();
    }

    public static AccidentMem instOf() {
        return Lazy.INST;
    }

    public List<Accident> accidents = new ArrayList<>();

    public Accident create(Accident accident) {
        accidents.add(accident);
        return accident;
    }

    public List<Accident> getAccidents() {
        return accidents;
    }

    public Accident findById(int id) {
        Accident accident = null;
        for (Accident ac : accidents) {
            if (ac.getId() == id) {
                accident = ac;
            }
        }
        return accident;
    }
}
