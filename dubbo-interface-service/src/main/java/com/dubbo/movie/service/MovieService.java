package com.dubbo.movie.service;

import com.dubbo.common.entity.es.Movie;
import com.dubbo.common.req.base.ReqPage;
import com.dubbo.common.resp.base.RespPage;

import java.util.List;

public interface MovieService {
    List<Movie> findAll();

    RespPage<Movie> findPage(ReqPage req);
}
