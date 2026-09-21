package demoapp.controller;

import demoapp.service.NumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
public class NumberControllerForm {

    @Autowired
    private NumberService numberService;

    @GetMapping("/numberform")
    public String numberForm(NumberData numberData) { return "formNumber"; }

    @PostMapping("/numberform")
    public String checkNumber(@ModelAttribute @Valid NumberData numberData, BindingResult bindingResult, Model model)
    {
        if (bindingResult.hasErrors())
        {
            return "formNumber";
        }
        model.addAttribute("evenResponse", numberService.evenResponse(numberData.getNumber()));
        return "evenCheck";
    }
}
