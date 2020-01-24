package com.dubbo.common.entity.es;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.io.Serializable;
import java.util.List;

@Data
@Document(indexName = "movie",type = "docs")
public class Movie implements Serializable {

    @Id
    private String id; //电影的id

    @Field(type = FieldType.Text)
    private List<String> directors;//导演
    @Field(type = FieldType.Text)
    private String title;//标题
    @Field(type = FieldType.Text)
    private String cover;//封面
    @Field(type = FieldType.Double)
    private String rate;//评分
    @Field(type = FieldType.Text)
    private List<String> casts;//演员

}