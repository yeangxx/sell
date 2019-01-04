package org.yx.sell.sell;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TsetForApplication {
    @RequestMapping("shit/sss")
    public String testMothed(){
        return "shit spring boot";
    }
}
