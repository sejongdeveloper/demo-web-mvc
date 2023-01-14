package me.whiteship.demowebmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SampleController {

    @GetMapping("/hello/?")
    @ResponseBody
    public String hello() {
        return "hello";
    }
}
