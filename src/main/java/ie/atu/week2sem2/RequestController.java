package ie.atu.week2sem2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController
public class RequestController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello";
    }
}
