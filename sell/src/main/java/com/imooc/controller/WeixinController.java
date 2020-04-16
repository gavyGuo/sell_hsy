package com.imooc.controller;

import com.imooc.config.WechatAccountConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: 郭师兄
 * @Date: 2020/3/29 16:23
 */
@RestController
@RequestMapping("/weixin")
@Slf4j
public class WeixinController {



    @GetMapping("/auth")
    public void auth(@RequestParam("code") String code){
        log.info("进入auth方法。。。");
        log.info("code={}",code);

        String url = "";
        RestTemplate restTemplate = new RestTemplate();
        String response = restTemplate.getForObject(url, String.class);
        log.info("response={}",response);
    }
}
