package web.service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import web.model.entity.TestEntity;
import web.model.repository.TestEntityRepository;


import java.util.List;

@RequiredArgsConstructor
@Transactional
@Service
public class RestTestService {

    private final TestEntityRepository testEntityRepository;


    // 2. DB ( RDS ) REST
    public List<TestEntity> test2( String content){
        testEntityRepository.save( TestEntity.builder().content( content ).build() );
        return testEntityRepository.findAll();
    }

}
