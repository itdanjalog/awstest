package web.controller;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import web.model.entity.TestEntity;
import web.service.RestTestService;

import java.util.List;

@RestController
@RequestMapping("/test")
@RequiredArgsConstructor
public class RestTestController {

    private final RestTestService restTestService;

    // http://spring-env.eba-pynxe7sz.ap-northeast-2.elasticbeanstalk.com/test/rest
    // 1. 일반 REST
    @GetMapping("/rest") // [GET] http://localhost:8080/test/rest
    public String test1(){
        return "Hello Rest";
    }

    //
    // 2. DB ( RDS ) REST
    @PostMapping("/rds") // [POST] http://localhost:8080/test/rds?content=클라우드테스트
    public List<TestEntity> test2(@RequestParam String content){
        return restTestService.test2( content );
    }

}
