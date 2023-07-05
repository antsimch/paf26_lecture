package sg.edu.nus.iss.day26_lecture.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import sg.edu.nus.iss.day26_lecture.model.Show;
import sg.edu.nus.iss.day26_lecture.service.ShowService;

@Controller
@RequestMapping
public class ShowController {
    
    private ShowService showService;

    public ShowController(ShowService showService) {
        this.showService = showService;
    }

    @GetMapping
    public String getLandingPage() {
        return "redirect:/api/form";
    }

    @GetMapping(path = "/api/form")
    public String getShowForm(Model model) {
        model.addAttribute("show", new Show());
        return "showForm";
    }

    @PostMapping(path = "/api/form")
    public String postShowForm(Show show, Model model) {
        List<Show> shows = showService.findShowsByName(show.getName());

        if (shows.isEmpty())
            return "showNotFound";

        model.addAttribute("shows", shows);
        return "details";
    }
}
