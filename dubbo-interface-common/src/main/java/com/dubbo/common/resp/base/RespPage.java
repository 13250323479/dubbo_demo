package com.dubbo.common.resp.base;

import org.elasticsearch.search.aggregations.Aggregations;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.core.aggregation.impl.AggregatedPageImpl;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;


public class RespPage<T> extends AggregatedPageImpl<T> implements Page<T>, Serializable {

    public RespPage() {
        super(Collections.emptyList());
    }

    public RespPage(List<T> content) {
        super(content);
    }

    public RespPage(List<T> content, float maxScore) {
        super(content,maxScore);
    }

    public RespPage(List<T> content, String scrollId) {
        super(content,scrollId);
    }

    public RespPage(List<T> content, String scrollId, float maxScore) {
        super(content, scrollId,maxScore);
    }

    public RespPage(List<T> content, Pageable pageable, long total) {
        super(content, pageable, total);
    }

    public RespPage(List<T> content, Pageable pageable, long total, float maxScore) {
        super(content, pageable, total,maxScore);
    }

    public RespPage(List<T> content, Pageable pageable, long total, String scrollId) {
        super(content, pageable, total,scrollId);
    }

    public RespPage(List<T> content, Pageable pageable, long total, String scrollId, float maxScore) {
        super(content, pageable, total, scrollId,maxScore);
    }

    public RespPage(List<T> content, Pageable pageable, long total, Aggregations aggregations) {
        super(content, pageable, total,aggregations);
    }

    public RespPage(List<T> content, Pageable pageable, long total, Aggregations aggregations, float maxScore) {
        super(content, pageable, total, aggregations,maxScore);
    }

    public RespPage(List<T> content, Pageable pageable, long total, Aggregations aggregations, String scrollId) {
        super(content, pageable, total, aggregations,scrollId);
    }

    public RespPage(List<T> content, Pageable pageable, long total, Aggregations aggregations, String scrollId, float maxScore) {
        super(content, pageable, total, aggregations, scrollId,maxScore);
    }
}
