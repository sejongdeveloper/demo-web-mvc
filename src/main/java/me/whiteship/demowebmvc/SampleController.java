package me.whiteship.demowebmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/hello")
public class SampleController {

    @GetMapping("/keesun")
    @ResponseBody
    public String helloKeesun() {
        return "hello keesun";
    }
}
