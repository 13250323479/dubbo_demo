package com.dubbo.movie.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dubbo.common.entity.es.Movie;
import com.dubbo.common.req.base.ReqPage;
import com.dubbo.common.resp.base.RespPage;
import com.dubbo.movie.service.MovieService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/dubbo/movie")
public class MovieController {

    @Reference
    private MovieService movieService;


    @RequestMapping("/list/all")
    public List<Movie> findAll(){
        return movieService.findAll();
    }

    @RequestMapping("/list")
    public RespPage<Movie> findPage(@RequestBody ReqPage req){
        return movieService.findPage(req);
    }


}
