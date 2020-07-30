package com.nnkcy.hr.api.v1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
@RequestMapping("/v1/banner")
public class BannerController {
    // MVC
//    @RequestMapping(value = "/test", method = {RequestMethod.GET})
//    @ResponseBody
    @GetMapping()
    public String banner(){
//        response.getWriter().write("temp");
        return "banner, 无所谓";
    }
}
