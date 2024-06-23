package br.com.Lotek_lock.backend.boot.arch.cqrs.entities;

import lombok.Data;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.math.BigDecimal;

@Data
@Entity
public class DomainXpto {

    @Id
    private String domainXptoId;
    private String fieldString1;
    private BigDecimal fieldBigDecimal;
    private Integer fieldInteger;
}
