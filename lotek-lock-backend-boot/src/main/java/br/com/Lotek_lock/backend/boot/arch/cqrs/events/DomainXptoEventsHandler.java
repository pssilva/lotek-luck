package br.com.Lotek_lock.backend.boot.arch.cqrs.events;

import br.com.Lotek_lock.backend.boot.arch.cqrs.entities.DomainXpto;
import br.com.Lotek_lock.backend.boot.arch.cqrs.entities.DomainXptoRepository;
import org.axonframework.config.ProcessingGroup;
import org.axonframework.eventhandling.EventHandler;
import org.axonframework.messaging.interceptors.ExceptionHandler;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
@ProcessingGroup("domain-xpto")
public class DomainXptoEventsHandler {

    private final DomainXptoRepository domainXptoRepository;

    public DomainXptoEventsHandler(DomainXptoRepository domainXptoRepository) {
        this.domainXptoRepository = domainXptoRepository;
    }

    @EventHandler
    public void on(DomainXptoCreatedEvent event) throws Exception {
        DomainXpto domainXpto =
                new DomainXpto();
        BeanUtils.copyProperties(event,domainXpto);
        domainXptoRepository.save(domainXpto);
        throw new Exception("Exception Occurred");
    }

    @ExceptionHandler
    public void handle(Exception exception) throws Exception {
        throw exception;
    }
}
