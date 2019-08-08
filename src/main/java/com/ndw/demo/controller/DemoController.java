package com.ndw.demo.controller;

import com.ndw.demo.entity.DemoModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @GetMapping("/getDemo")
    public DemoModel getDemo(){
        DemoModel dm=new DemoModel();
        dm.setId(1);
        dm.setName("王大年");
        dm.setMoble("13126796948");
        dm.setAddress("宿松");
        dm.setSex("男");
        return dm;
    }

}
