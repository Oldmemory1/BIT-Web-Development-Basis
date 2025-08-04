package org.example.webproject1.Controller;

import lombok.extern.java.Log;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Log
@Controller
public class PaperController {
    @RequestMapping("/paper")
    public String openPaper(Model model){
        return "paper";
    }
    @PostMapping("/api/submit_answer")
    public ResponseEntity<?> submitAnswer(@RequestBody List<String> answers){
        log.info(answers.toString());
        return ResponseEntity.ok(Map.of(
                "status", "success",
                "message", "问卷提交成功",
                "data", answers
        ));
    }



}
