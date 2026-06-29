package com.axsos.display;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class DateController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/date")
    public String date(Model model) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE, MMM dd, yyyy");
        String date = dateFormat.format(new Date());
        model.addAttribute("date", date);
        return "date";
    }

    @RequestMapping("/time")
    public String time(Model model) {
        SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm a");
        String time = timeFormat.format(new Date());
        model.addAttribute("time", time);
        return "time";
    }
}