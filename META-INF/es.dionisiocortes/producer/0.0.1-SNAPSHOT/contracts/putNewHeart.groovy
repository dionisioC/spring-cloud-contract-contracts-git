package contracts

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    name = "Put new heart"
    description = "Patient will get a new heart"
    priority = 1
    ignored = false
    request {
        urlPath('/body')
        method PUT()
        headers {
            contentType applicationJson()
        }
        body (
                part: "heart",
                kind: "A good one",
        )
    }

    response {
        status OK()
        body (
                success: "Ou yeah",
        )
        headers {
            contentLocation: "Chest"
        }
    }
}