package me.whiteship.demowebmvc;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(
        produces = MediaType.APPLICATION_JSON_VALUE,
        consumes = MediaType.APPLICATION_JSON_VALUE)
public class EventUpdateController {
    @PutMapping("/events")
    @ResponseBody
    public String updateEvents() {
        return "event";
    }

    @PostMapping("/events")
    @ResponseBody
    public String createEvents() {
        return "event";
    }
}
