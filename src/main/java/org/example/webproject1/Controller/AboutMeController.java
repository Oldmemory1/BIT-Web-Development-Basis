package org.example.webproject1.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AboutMeController {
    @RequestMapping("/aboutMe")
    public String aboutMe(){
        return "aboutMe";
    }
}
