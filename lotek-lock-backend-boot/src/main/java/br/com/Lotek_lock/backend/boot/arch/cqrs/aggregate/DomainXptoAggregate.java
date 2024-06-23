package br.com.Lotek_lock.backend.boot.arch.cqrs.aggregate;

import br.com.Lotek_lock.backend.boot.arch.cqrs.commands.CreateDomainXptoCommand;
import br.com.Lotek_lock.backend.boot.arch.cqrs.events.DomainXptoCreatedEvent;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.eventsourcing.EventSourcingHandler;
import org.axonframework.modelling.command.AggregateIdentifier;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.axonframework.spring.stereotype.Aggregate;
import org.springframework.beans.BeanUtils;

import java.math.BigDecimal;

@Aggregate
public class DomainXptoAggregate {

    @AggregateIdentifier
    private String domainXptoId;
    private String fieldString1;
    private BigDecimal fieldBigDecimal;
    private Integer fieldInteger;

    @CommandHandler
    public DomainXptoAggregate(CreateDomainXptoCommand createDomainXptoCommand) {
        //You can perform all the validations
        DomainXptoCreatedEvent DomainXptoCreatedEvent =
                new DomainXptoCreatedEvent();

        BeanUtils.copyProperties(createDomainXptoCommand,DomainXptoCreatedEvent);

        AggregateLifecycle.apply(DomainXptoCreatedEvent);
    }

    public DomainXptoAggregate() {}

    @EventSourcingHandler
    public void on(DomainXptoCreatedEvent domainXptoCreatedEvent) {
        this.fieldInteger = domainXptoCreatedEvent.getFieldInteger();
        this.domainXptoId = domainXptoCreatedEvent.getDomainXptoId();
        this.fieldBigDecimal = domainXptoCreatedEvent.getFieldBigDecimal();
        this.fieldString1 = domainXptoCreatedEvent.getFieldString1();
    }
}
