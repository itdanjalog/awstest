package web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
@RequiredArgsConstructor
public class RestTestController {
    // 1. 일반 REST
        // 1. GetMapping

    // 2. DB ( RDS ) REST
        // 1. insert
        // 2. select

    // 3. REDIS( 캐싱 ) REST
        // 1. insert
        // 2. select

    // 4. S3 (파일 업로드/삭제 ) REST
        // 1. upload
        // 2. delete
}
