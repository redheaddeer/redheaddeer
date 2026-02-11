package red.head.deer.oracle.config

import org.springframework.context.annotation.Configuration

@Configuration(proxyBeanMethods = false)
class WebConfig(
    private val oracleProperties: OracleProperties
)