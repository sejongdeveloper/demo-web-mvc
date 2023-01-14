package me.whiteship.demowebmvc;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
public class SampleController {

    @GetMapping("/events")
    @ResponseBody
    public String events() {
        return "events";
    }

    @GetMapping("/events/{id}")
    @ResponseBody
    public String getAnEvents(@PathVariable int id) {
        return "event";
    }

    @DeleteMapping("/events/{id}")
    @ResponseBody
    public String removeAnEvents(@PathVariable int id) {
        return "event";
    }

    @GetHelloMapping
    @ResponseBody
    public String hello() {
        return "hello";
    }

}
