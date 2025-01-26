package se.kth.iv1201.group4.recruitment.recruitmentapp.application;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/v1/mountain")
public class MountainController {

    @GetMapping("/test")
    public String getMountain() {
        return "index"; // This is the html found in resources
    }
}
