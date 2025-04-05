package com.example.demo;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestController {
    @RequestMapping("/request")
    public String request(HttpServletRequest request) {
        String method = request.getMethod();
        System.out.println(method);
        String url = request.getRequestURL().toString();
        System.out.println(url);
        String uri = request.getRequestURI();
        System.out.println(uri);
        String protocol = request.getProtocol();
        System.out.println(protocol);
        String name = request.getParameter("name");
        System.out.println(name);
        String accept = request.getHeader("Accept");
        System.out.println(accept);

        return "ok";
    }
}
