package ru.artemgggi.springmvc.control;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.artemgggi.springmvc.model.Accident;
import ru.artemgggi.springmvc.repository.AccidentJdbcTemplate;
import java.util.ArrayList;
import java.util.List;

@Controller
public class IndexControl {

    private final AccidentJdbcTemplate accidents;

    public IndexControl(AccidentJdbcTemplate accidents) {
        this.accidents = accidents;
    }

    @GetMapping("/")
    public String index(Model model) {
        List<Accident> res = new ArrayList<>();
        accidents.getAll().forEach(res::add);
        model.addAttribute("accidents", res);
        model.addAttribute("user", SecurityContextHolder
                .getContext()
                .getAuthentication()
                .getPrincipal());
        return "index";
    }
}
