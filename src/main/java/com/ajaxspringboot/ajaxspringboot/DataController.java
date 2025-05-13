package com.ajaxspringboot.ajaxspringboot;

import java.util.Random;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class DataController {    

    
     @RequestMapping(value = "/gettable", method = RequestMethod.GET, produces= "text/html")
     public String getTable(@RequestParam(value = "width", defaultValue = "5") String width, @RequestParam(value = "height", defaultValue = "5") String height) {
        Random random = new Random();
        int widthint = Integer.parseInt(width);
        int heightint = Integer.parseInt(height);
        String records = "<tbody> ";
        
        for(int i = 1; i <= heightint; i++) {
            records+="<tr data-row='" + i + "'> ";
            for(int j = 1; j <= widthint; j++) {
                int x = random.nextInt(-100, 100);
                records+="<td>" + x + "</td> ";
            }
            records+="</tr>";
        }
        records+="</tbody>";
        return records;
     }
 }