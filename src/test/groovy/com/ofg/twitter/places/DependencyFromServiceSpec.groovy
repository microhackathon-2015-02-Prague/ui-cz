package com.ofg.twitter.places

import com.ofg.base.MicroserviceMvcWiremockSpec
import com.ofg.twitter.place.extractor.ColleratorClient
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.IntegrationTest
import spock.lang.Ignore

@IntegrationTest("stubrunner.use-microservice-definitions:true")
class DependencyFromServiceSpec extends MicroserviceMvcWiremockSpec {

    @Autowired
    ColleratorClient client;

    @Ignore
    def "Should not fail on run when downloading stubs per project"() {
        when:
            client.populatePlaces(1, "nothing")
        then:
            noExceptionThrown()

    }
}