package com.dubbo.movie.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.dubbo.common.entity.es.Movie;
import com.dubbo.common.req.base.ReqPage;
import com.dubbo.common.resp.base.RespPage;
import com.dubbo.movie.repository.MovieRepository;
import com.dubbo.movie.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.ArrayList;
import java.util.List;


@Service(timeout = 50000)
public class MovieServiceImpl implements MovieService {

    @Autowired
    private MovieRepository movieRepository;

    @Override
    public List<Movie> findAll() {

        Iterable<Movie> all = movieRepository.findAll();

        List<Movie> movies = new ArrayList<>();
        all.forEach(movie -> movies.add(movie));

        return movies;
    }

    @Override
    public RespPage<Movie> findPage(ReqPage req) {

        PageRequest pageRequest = PageRequest.of(req.getPageIndex(),req.getPageSize());
        Page<Movie> all = movieRepository.findAll(pageRequest);
        return new RespPage(all.getContent(),pageRequest,all.getTotalElements());
    }
}
