package br.com.Lotek_lock.backend.boot.arch.cqrs.queries.projection;

import br.com.Lotek_lock.backend.boot.arch.cqrs.entities.DomainXpto;
import br.com.Lotek_lock.backend.boot.arch.cqrs.entities.DomainXptoRepository;
import br.com.Lotek_lock.backend.boot.arch.cqrs.model.DomainXptoRestModel;
import br.com.Lotek_lock.backend.boot.arch.cqrs.queries.queries.GetDomainXptosQuery;
import org.axonframework.queryhandling.QueryHandler;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class DomainXptoProjection {

    private DomainXptoRepository domainXptoRepository;

    public DomainXptoProjection(DomainXptoRepository domainXptoRepository) {
        this.domainXptoRepository = domainXptoRepository;
    }

    @QueryHandler
    public List<DomainXptoRestModel> handle(GetDomainXptosQuery getDomainXptosQuery) {
        List<DomainXpto> domainXptos =
                domainXptoRepository.findAll();

        List<DomainXptoRestModel> domainXptoRestModels =
                domainXptos.stream()
                        .map(domainXpto -> DomainXptoRestModel
                                .builder()
                                .fieldInteger(domainXpto.getFieldInteger())
                                .fieldString1(domainXpto.getFieldString1())
                                .fieldBigDecimal(domainXpto.getFieldBigDecimal())
                                .build())
                        .collect(Collectors.toList());

        return domainXptoRestModels;
    }
}
