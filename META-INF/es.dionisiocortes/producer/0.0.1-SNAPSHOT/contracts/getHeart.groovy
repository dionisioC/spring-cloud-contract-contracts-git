package contracts

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    name = "Get heart"
    description = "Get heart status"
    priority = 2
    ignored = false
    request {
        urlPath('/body') {
            queryParameters {
                parameter 'part': 'heart'
            }
        }

        method GET()
    }

    response {
        status OK()
        body (
                status: "on",
        )
    }
}