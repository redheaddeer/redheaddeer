package red.head.deer.oracle.config

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.EnableConfigurationProperties

@ConfigurationProperties(prefix = "oracle", ignoreUnknownFields = true)
@EnableConfigurationProperties
class OracleProperties(
    val tarot: Boolean? = true,
    val runes: Boolean? = true
) {
}