package com.nnkcy.hr.api.v1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class BannerController {
    // MVC
    @GetMapping("/test")
    @ResponseBody
    public String test(){
//        response.getWriter().write("temp");
        return "test, 七七七七七";
    }
}
