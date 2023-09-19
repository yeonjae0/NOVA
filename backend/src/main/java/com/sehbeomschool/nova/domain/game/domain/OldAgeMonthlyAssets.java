package com.sehbeomschool.nova.domain.game.domain;

import com.sehbeomschool.nova.global.entity.BaseEntity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class OldAgeMonthlyAssets extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "OLD_AGE_MONTHLY_ASSET_ID")
    private Long id;

    private Integer monthlyAmount;

    private Integer childAllowance;

    private Integer realtyRentIncome;

    private Integer nationalPension;

    private Integer totalMonthlyAsset;

    @Builder
    public OldAgeMonthlyAssets(Long id, Integer monthlyAmount, Integer childAllowance,
        Integer realtyRentIncome, Integer nationalPension, Integer totalMonthlyAsset) {
        this.id = id;
        this.monthlyAmount = monthlyAmount;
        this.childAllowance = childAllowance;
        this.realtyRentIncome = realtyRentIncome;
        this.nationalPension = nationalPension;
        this.totalMonthlyAsset = totalMonthlyAsset;
    }
}
