package br.com.Lotek_lock.backend.boot.arch.cqrs.controllers;

import br.com.Lotek_lock.backend.boot.arch.cqrs.commands.CreateDomainXptoCommand;
import br.com.Lotek_lock.backend.boot.arch.cqrs.model.DomainXptoRestModel;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/domain-xptos")
public class DomainXptoController {

    private CommandGateway commandGateway;

    public DomainXptoController(CommandGateway commandGateway) {
        this.commandGateway = commandGateway;
    }

    @PostMapping
    public String addDomainXpto(@RequestBody DomainXptoRestModel domainXptoRestModel) {

        CreateDomainXptoCommand createDomainXptoCommand =
                CreateDomainXptoCommand.builder()
                    .domainXptoId(UUID.randomUUID().toString())
                    .fieldString1(domainXptoRestModel.getFieldString1())
                    .fieldBigDecimal(domainXptoRestModel.getFieldBigDecimal())
                    .fieldInteger(domainXptoRestModel.getFieldInteger())
                    .build();
        return commandGateway.sendAndWait(createDomainXptoCommand);
    }
}
