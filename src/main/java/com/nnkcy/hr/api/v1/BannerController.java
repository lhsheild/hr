package com.nnkcy.hr.api.v1;

import com.nnkcy.hr.sample.hero.Diana;
import com.nnkcy.hr.service.BannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
@RequestMapping("/v1/banner")
public class BannerController {
    // MVC
    // @RequestMapping(value = "/test", method = {RequestMethod.GET})
    // @ResponseBody
    private final Diana diana;

    private final BannerService bannerService;

    public BannerController(Diana diana, BannerService bannerService) {
        this.diana = diana;
        this.bannerService = bannerService;
    }

    @GetMapping()
    public String banner() {
        //  response.getWriter().write("temp");
        diana.r();
        return "banner, 无所谓";
    }
}
