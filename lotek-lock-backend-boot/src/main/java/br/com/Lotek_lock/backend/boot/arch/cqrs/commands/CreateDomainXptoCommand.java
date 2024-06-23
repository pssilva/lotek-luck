package br.com.Lotek_lock.backend.boot.arch.cqrs.commands;

import lombok.Builder;
import lombok.Data;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

import java.math.BigDecimal;

@Data
@Builder
public class CreateDomainXptoCommand {
    @TargetAggregateIdentifier
    private String domainXptoId;
    private String fieldString1;
    private BigDecimal fieldBigDecimal;
    private Integer fieldInteger;
}
