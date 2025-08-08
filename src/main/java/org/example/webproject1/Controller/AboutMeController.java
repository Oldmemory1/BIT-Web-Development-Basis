package org.example.webproject1.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.time.Period;

@Controller
public class AboutMeController {
    public static String calculateAgeFromMinecraft1_7_10() {
        LocalDate startDate = LocalDate.of(2014, 5, 14);
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(startDate, currentDate);
        return String.format("Mincraft 1.7.10 is %d year%s %d month%s %d day%s old",
                period.getYears(), (period.getYears() == 1 ? "" : "s"),
                period.getMonths(), (period.getMonths() == 1 ? "" : "s"),
                period.getDays(), (period.getDays() == 1 ? "" : "s"));
    }

    @RequestMapping("/aboutMe")
    public String aboutMe(Model model) {
        model.addAttribute("howOldIsMinecraft1_7_10",calculateAgeFromMinecraft1_7_10());
        return "aboutMe";
    }
}
