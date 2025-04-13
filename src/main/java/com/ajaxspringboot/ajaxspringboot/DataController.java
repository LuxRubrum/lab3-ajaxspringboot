package com.ajaxspringboot.ajaxspringboot;

import java.util.Random;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class DataController {    

    
     @RequestMapping(value = "/gettable", method = RequestMethod.GET, produces= "text/html")
     public String getTable() {
        Random random = new Random();
        String records = "<tbody> ";
        
        for(int i = 1; i <= 5; i++) {
            records+="<tr data-row='" + i + "'> ";
            for(int j = 1; j <= 3; j++) {
                int x = random.nextInt(-100, 100);
                records+="<td>" + x + "</td> ";
            }
            records+="</tr>";
        }
        records+="</tbody>";
        return records;
     }
 }