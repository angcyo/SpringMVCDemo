package com.angcyo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by angcyo on 2016-09-22.
 */
@Controller
@RequestMapping("api")
public class Controller1 {

    @RequestMapping("demo.form")
    @ResponseBody
    public String demo() {
        System.out.println("demo...");
        return "{\"Demo\":\"1\"}";
    }

    @RequestMapping("vc/de")
    @ResponseBody
    public String demo2(HttpServletRequest request) {
        System.out.println("demo..." + request.getMethod() + "  body" + request.getMethod());
        return "{\"Demo2222222\":\"1222222222222222\"}";
    }

    @RequestMapping("/{arg}")
    @ResponseBody
    public String demo3(@PathVariable String arg) {
        System.out.println("arg... demo..." + arg);
        return "{\"demo3\":\"1222222222222222\"}";
    }

    @RequestMapping("/arg")
    @ResponseBody
    public String demo4(@RequestParam String a, @RequestParam String b) {
        System.out.println("arg... demo..." + a + " --> " + b);
        return "{\"demo4\":\"----aaa--bb\"}";
    }

    @RequestMapping("/arg2")
    @ResponseBody
    public String demo5(HttpServletRequest request, @RequestBody String body) {
        System.out.println(request.getMethod() + " --> " + " demo5..." + body);
        return request.getMethod() + " --> " + body;
    }
}

