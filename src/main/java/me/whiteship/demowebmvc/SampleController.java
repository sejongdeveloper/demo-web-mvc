package me.whiteship.demowebmvc;

import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SampleController {

    @GetMapping(value = "/hello", headers = "!" + HttpHeaders.FROM)
    @ResponseBody
    public String hello() {
        return "hello";
    }
}
