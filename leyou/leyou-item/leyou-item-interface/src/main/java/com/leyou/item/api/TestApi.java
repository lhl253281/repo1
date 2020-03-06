package com.leyou.item.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public interface TestApi {

    @GetMapping("/test")
    @ResponseBody
    public String Test();


}
