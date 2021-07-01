package org.launchcode.codingevents.controllers;

import org.launchcode.codingevents.data.TagRepository;
import org.launchcode.codingevents.models.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("tag")
public class TagController {

    @Autowired
    private TagRepository tagRepository;

    @GetMapping
    public String renderTagList(Model model) {
        model.addAttribute("title", "Event Tags");
        model.addAttribute("tags", tagRepository.findAll());
        return "tag/index";
    }

    @GetMapping("create")
    public String renderTagCreateForm(Model model) {
        model.addAttribute("title", "Create Event Tag");
        model.addAttribute(new Tag());
        return "tag/create";
    }

    @PostMapping("create")
    public String processTagCreateForm(@ModelAttribute @Valid Tag newTag, Model model, Errors errors) {
        if (errors.hasErrors()) {
            model.addAttribute("title", "Create Event Tag");
            model.addAttribute(new Tag());
            return "tag/create";
        }
        tagRepository.save(newTag);
        return "redirect:";
    }
}
