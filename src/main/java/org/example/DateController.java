package org.example;

import org.joda.time.DateTime;
import org.joda.time.Days;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DateController {

        @GetMapping("/")
        public String home() {
            return "index";
        }

   /* @GetMapping("/greetings")
    public String index() {
        return "Greetings from Spring Boot!";
        }*/

        @GetMapping("/newyear")
        public String daysToNewYear(Model model) {

            DateTime now = new DateTime();
            DateTime newYear = new DateTime(now.getYear() + 1, 1, 1, 0, 0);

            int days = Days.daysBetween(now.toLocalDate(), newYear.toLocalDate()).getDays();

            model.addAttribute("daysRemaining", days);

            return "newyear";
        }
    }
