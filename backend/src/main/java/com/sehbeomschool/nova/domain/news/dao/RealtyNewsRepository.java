package com.sehbeomschool.nova.domain.news.dao;

import com.sehbeomschool.nova.domain.news.domain.Prediction;
import com.sehbeomschool.nova.domain.news.domain.RealtyNews;
import io.lettuce.core.dynamic.annotation.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface RealtyNewsRepository extends JpaRepository<RealtyNews, Long> {

    @Query(value = "SELECT * FROM REALTY_NEWS rn WHERE rn.REALTY_ID = :realtyId AND rn.PREDICTION = :prediction ORDER BY RAND() LIMIT 1", nativeQuery = true)
    RealtyNews findRealtyNewsByRandom(@Param("realtyId") Long realtyId,
        @Param("prediction") Prediction prediction);
}
