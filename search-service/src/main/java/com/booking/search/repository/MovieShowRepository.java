package com.booking.search.repository;

import com.booking.search.entity.MovieShow;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface MovieShowRepository extends ElasticsearchRepository<MovieShow, String> {
}
