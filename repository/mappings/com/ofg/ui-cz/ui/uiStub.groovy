io.coderate.accurest.dsl.GroovyDsl.make {
    request {
        method 'PUT'
        url '/ui/loan/apply/cey/hun/333'
        headers {
            header 'Content-Type': 'application/vnd.com.ofg.ui-cz.v1+json'
        }
        body '''\
    [{
        "created_at": "Sat Jul 26 09:38:57 +0000 2014",
        "id": 492967299297845248,
        "result": "Loan successfully applied"
    }]
'''
    }
    response {
        status 200
    }
}