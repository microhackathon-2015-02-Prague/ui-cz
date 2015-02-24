package com.ofg.ui.controller
import com.wordnik.swagger.annotations.Api
import com.wordnik.swagger.annotations.ApiOperation
import groovy.util.logging.Slf4j
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

import javax.validation.constraints.NotNull

import static org.springframework.web.bind.annotation.RequestMethod.POST

@Slf4j
@RestController
@RequestMapping('/ui')
@Api(value = "ui", description = "Entry point for clients")
class UiCzController {

    @RequestMapping(
            value = '/loan/apply/{firstName}/{lastName}/{amount}',
            method = POST,
            consumes = 'application/vnd.com.ofg.ui-cz.v1+json',
            produces = 'application/vnd.com.ofg.ui-cz.v1+json')
    @ApiOperation(value = "Apply for loan",
            notes = "The code handles loan application via UI")
    String applyForLoan(@PathVariable("firstName") @NotNull String firstName, 
                        @PathVariable("lastName") @NotNull String lastName,
                        @PathVariable("amount") @NotNull BigDecimal amount) {

        log.info("First Name: ${firstName}, Last Name: ${lastName}, amount: ${amount}")
        
        return Optional.<String>of(new String("Something will be happening..."))
    }
}