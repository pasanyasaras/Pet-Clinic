package pasanyasara.projects.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/owners")
public class OwnerController {

    @RequestMapping({"/","/index","/owner_index.html",""})
    public String listOwners()
    {
        return "owners/owner_index";
    }
}
