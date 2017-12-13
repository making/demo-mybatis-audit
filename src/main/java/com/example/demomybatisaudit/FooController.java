package com.example.demomybatisaudit;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FooController {
    private final FooMapper fooMapper;

    public FooController(FooMapper fooMapper) {
        this.fooMapper = fooMapper;
    }

    @GetMapping("/")
    public List<Foo> getFoos() {
        return this.fooMapper.findAll();
    }

    @PostMapping("/")
    public void postFoos(@RequestBody Foo foo) {
        this.fooMapper.insert(foo);
    }
}
