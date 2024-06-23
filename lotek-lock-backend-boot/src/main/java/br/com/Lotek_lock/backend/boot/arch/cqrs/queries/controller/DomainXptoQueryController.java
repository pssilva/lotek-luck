package br.com.Lotek_lock.backend.boot.arch.cqrs.queries.controller;

import br.com.Lotek_lock.backend.boot.arch.cqrs.model.DomainXptoRestModel;
import br.com.Lotek_lock.backend.boot.arch.cqrs.queries.queries.GetDomainXptosQuery;
import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/domainXptos")
public class DomainXptoQueryController {

    private QueryGateway queryGateway;

    public DomainXptoQueryController(QueryGateway queryGateway) {
        this.queryGateway = queryGateway;
    }

    @GetMapping
    public List<DomainXptoRestModel> getAllDomainXptos() {
        GetDomainXptosQuery getDomainXptosQuery =
                new GetDomainXptosQuery();

        List<DomainXptoRestModel> domainXptoRestModels =
        queryGateway.query(getDomainXptosQuery,
                ResponseTypes.multipleInstancesOf(DomainXptoRestModel.class))
                .join();

        return domainXptoRestModels;
    }
}
