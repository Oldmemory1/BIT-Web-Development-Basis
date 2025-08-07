package org.example.webproject1.Controller;

import jakarta.annotation.Resource;
import lombok.extern.java.Log;
import org.example.webproject1.Entity.score;
import org.example.webproject1.Mapper.ScoreMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;

@Log
@Controller
public class PaperController {
    @Resource
    ScoreMapper scoreMapper;

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
    @RequestMapping("/api/getAllScores")
    @ResponseBody
    public String getAllScores(){
        List<score> scoreList= scoreMapper.getAllScore();
        StringBuilder builder=new StringBuilder();
        for(score s:scoreList){
            builder.append(s.toString());
        }
        return builder.toString();

    }

}
