package edu.eci.tdse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class MathController {

    @Autowired
    private MathService mathService;
    @GetMapping("/pellsequence")
    public ArrayList<Integer> CalculatePellSequence(@RequestParam(value = "value") int n) {
        return mathService.pellSequence(n);
    }
}