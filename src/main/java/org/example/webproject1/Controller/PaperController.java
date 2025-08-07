package org.example.webproject1.Controller;

import lombok.extern.java.Log;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.*;

@Log
@Controller
public class PaperController {
    @RequestMapping("/onlinetest")
    public String openPaper(){
        return "onlinetest";
    }
    @PostMapping("/api/submit_answer")
    public ResponseEntity<?> submitAnswer(@RequestBody Map<String, String> answers){
        boolean answersIsValid = true;
        log.info(answers.toString());
        Set<String> elements = answers.keySet();
        log.info(elements.toString());



        if(answersIsValid){
            return ResponseEntity.ok(Map.of(
                    "status", "success",
                    "message", "问卷提交成功",
                    "data", answers
            ));
        }else{
            return ResponseEntity.badRequest().body(Map.of(
                    "status", "fail",
                    "message", "问卷提交失败",
                    "data", answers
            ));
        }



    }

}
