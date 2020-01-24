package com.dubbo.movie.repository;

import com.dubbo.common.entity.es.Movie;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface MovieRepository extends ElasticsearchRepository<Movie,String> {
}
