package br.com.Lotek_lock.backend.boot.arch.cqrs.events;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DomainXptoCreatedEvent {
    private String DomainXptoId;
    private String fieldString1;
    private BigDecimal fieldBigDecimal;
    private Integer fieldInteger;

}
