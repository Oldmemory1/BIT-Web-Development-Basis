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
        String name = answers.get("studentName");
        log.info(answers.toString());
        Set<String> elements = answers.keySet();
        log.info(elements.toString());
        int score= 0;
        if(answers.get("question1").equals("A")){
            score++;//第1题答案为A
        }
        if(answers.get("question2").equals("B")){
            score++;//第2题答案为B
        }
        if(answers.get("question3").equals("C")){
            score++;//第3题答案为C
        }
        if(answers.get("question4").equals("D")){
            score++;//第4题答案为D
        }
        if(answers.get("question5").equals("A")){
            score++;//第5题答案为A
        }
        if(answers.get("question6").equals("B")){
            score++;//第6题答案为B
        }
        if(answers.get("question7").equals("C")){
            score++;//第7题答案为C
        }
        if(answers.get("question8").equals("D")){
            score++;//第8题答案为D
        }
        if(answers.get("question9").equals("A")){
            score++;//第9题答案为A
        }
        if(answers.get("question10").equals("B")){
            score++;//第10题答案为B
        }
        if(answers.get("question11").equals("AB")){
            score++;//第11题答案为B
        }
        if(answers.get("question12").equals("CD")){
            score++;//第12题答案为B
        }
        if(answers.get("question13").equals("1")){
            score++;//第13题答案为B
        }
        if(answers.get("question14").equals("2")){
            score++;//第14题答案为B
        }
        if(answers.get("question15").equals("3")){
            score++;//第15题答案为B
        }



        if(answersIsValid){
            scoreMapper.insertScoreEntity(name,score);
            return ResponseEntity.ok(Map.of(
                    "status", "OK",
                    "message", "问卷提交成功",
                    "data", score

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
    public List<score> getAllScores(){
        return scoreMapper.getAllScore();
    }
    @RequestMapping("/api/deleteAllScores")
    public ResponseEntity<?>  deleteAllScores(){
        scoreMapper.deleteAllScore();
        return ResponseEntity.ok(Map.of(
                "status", "OK",
                "message", "数据库中表项删除成功"
        ));
    }

    @RequestMapping("/delete")
    public String delete(){
        return "delete_scores";
    }





}
