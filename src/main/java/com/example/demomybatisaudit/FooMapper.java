package com.example.demomybatisaudit;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FooMapper {
    List<Foo> findAll();

    void insert(Foo foo);
}
