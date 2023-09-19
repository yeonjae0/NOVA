package com.sehbeomschool.nova.domain.realty.domain;

import com.sehbeomschool.nova.global.entity.BaseEntity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Loan extends BaseEntity {

    @Id
    @GeneratedValue
    @Column(name = "LONA_ID")
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "REALTY_ID")
    private Realty realty;

    private Long principal;

    @Builder
    public Loan(Long id, Realty realty, Long principal) {
        this.id = id;
        this.realty = realty;
        this.principal = principal;
    }
}
