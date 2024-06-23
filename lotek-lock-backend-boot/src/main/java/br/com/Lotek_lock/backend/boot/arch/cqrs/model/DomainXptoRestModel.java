package br.com.Lotek_lock.backend.boot.arch.cqrs.model;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class DomainXptoRestModel {
    private String fieldString1;
    private BigDecimal fieldBigDecimal;
    private Integer fieldInteger;
}
