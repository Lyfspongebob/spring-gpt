package com.example.spring_gpt.repository;

import com.example.spring_gpt.entity.Mask;
import org.springframework.data.repository.CrudRepository;

public interface MaskRepository extends CrudRepository<Mask, String> {
    //<Mask,String>  //左边处理的是数据类型，右边处理的是数据类型的主键.
}
