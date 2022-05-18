package ru.artemgggi.springmvc.control;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.artemgggi.springmvc.repository.AccidentMem;

import java.util.ArrayList;
import java.util.List;


@Controller
public class IndexControl {
    @GetMapping("/")
    public String index(Model model) {

        List<String> users = new ArrayList<>();
        users.add("Artem");
        users.add("Ivan");
        users.add("Michail");
        model.addAttribute("users", users);
        model.addAttribute("accidents", AccidentMem.instOf().getAccidents());
        return "index";
    }
}
