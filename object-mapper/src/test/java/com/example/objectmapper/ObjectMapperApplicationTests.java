package com.example.objectmapper;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ObjectMapperApplicationTests {

    @Test
    void contextLoads() throws JsonProcessingException {
        System.out.println("------------------");
        // Text Json -> object
        // Object -> Text Json

        // controller req json(text) => object
        // response object => json(text)

        var objectMapper = new ObjectMapper();

        // Obj -> Text
        // ObjectMapper가 getter를 활용
        // 따라서 ObjectMapper가 활용하는 method에는 get으로 시작하는 다른 method를 넣지 않도록
        var user = new User("steve", 10, "010-1234-5678");
        var text = objectMapper.writeValueAsString(user);
        System.out.println(text);

        // text -> Object
        // default 생성자가 필요
        var objectUser = objectMapper.readValue(text, User.class);
        System.out.println(objectUser);
    }

}
