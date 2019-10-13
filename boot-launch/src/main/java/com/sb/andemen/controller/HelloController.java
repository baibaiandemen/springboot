package com.sb.andemen.controller;
import com.sb.andemen.model.Article;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @PackageName: com.sb.andemen.controller
 * @ClassName: HelloController
 * @Description:
 * @author: xjj
 * @date: 2019/10/13 10:18
 */
@Slf4j
@RestController
public class HelloController {
//    private static final org.slf4j.Logger log= LoggerFactory.getLogger(HelloController.class);
    @RequestMapping("/hello")
    public Article hello(){
        Article article=new Article(1L,"XUEJUANJUAN");
        Article  xuejuanjuan = Article.builder().id(3L).anthor("xuejuanjuan").build();
        log.info("ceshi:"+xuejuanjuan);

        return xuejuanjuan;
    }

}
