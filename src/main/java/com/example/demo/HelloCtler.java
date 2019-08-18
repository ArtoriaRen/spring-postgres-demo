package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * Author: liuyangren
 * Date:
 * Time:
 */
@RestController
@RequestMapping("/hello")
public class HelloCtler {

    @Autowired
    LogRepo logRepo;

    @RequestMapping("/s")
    public String fooo(){
        return "<html><head></head><body><div>oqooq</div></body></html>";
    }

    @RequestMapping("/save/{name}")
    public String ctl(@PathVariable("name") String name){
        logRepo.save(new LogItem(name));
        return name;
    }

    @RequestMapping("/query/{naid}")
    public String naid(@PathVariable("naid") Integer naid){
        Optional<LogItem> naidRow = logRepo.findById(naid);
        return naidRow.get() == null? null : naidRow.get().getName();
    }





}
