package org.example.webproject1.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.*;

@Controller
public class TestController {
    @RequestMapping("/test")
    public String test(){
        return "temp_page";
    }
    @GetMapping("/api/test")
    public ResponseEntity<?> getContent(){
        return ResponseEntity.ok(Map.of(
                "status", "success",
                "message", "测试信息",
                "data", "内容1"
        ));
    }
}
