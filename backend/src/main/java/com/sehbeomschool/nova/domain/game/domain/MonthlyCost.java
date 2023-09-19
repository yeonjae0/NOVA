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
public class MonthlyCost extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MONTHLY_COST_ID")
    private Long id;

    private Integer livingCost;

    private Integer monthlyRentCost;

    private Integer IRPCost;

    private Integer childCost;

    private Integer loansCost;

    private Integer installmentSavingCost;

    @Builder
    public MonthlyCost(Long id, Integer livingCost, Integer monthlyRentCost, Integer IRPCost,
        Integer childCost, Integer loansCost, Integer installmentSavingCost) {
        this.id = id;
        this.livingCost = livingCost;
        this.monthlyRentCost = monthlyRentCost;
        this.IRPCost = IRPCost;
        this.childCost = childCost;
        this.loansCost = loansCost;
        this.installmentSavingCost = installmentSavingCost;
    }
}