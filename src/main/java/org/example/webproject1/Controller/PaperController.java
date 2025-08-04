package org.example.webproject1.Controller;

import lombok.extern.java.Log;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.*;

@Log
@Controller
public class PaperController {
    @RequestMapping("/paper")
    public String openPaper(Model model){
        return "paper";
    }
    @PostMapping("/api/submit_answer")
    public ResponseEntity<?> submitAnswer(@RequestBody List<String> answers){
        boolean answersIsValid = true;
        String[] validAnswersArray={"A","B","C","D"};
        List<String> validAnswersList=new ArrayList<>();
        Collections.addAll(validAnswersList,validAnswersArray);
        log.info(answers.toString());
        for(String answer : answers){
            if (!validAnswersList.contains(answer)) {
                answersIsValid = false;
                break;
            }
        }
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
