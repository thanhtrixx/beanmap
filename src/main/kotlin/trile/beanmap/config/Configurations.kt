package trile.beanmap.config

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Configuration

const val DEFAULT_KEY = "default"
fun Map<String, Any>.getOrDefaultKey(key: String, defaultKey: String) = this[key] ?: this[defaultKey]

@Configuration
@ConfigurationProperties(prefix = "animal")
data class AnimalConfigs(
  var configMap: Map<String, AnimalConfig> = emptyMap()
)

data class AnimalConfig(
  val numberLeg: Int = 0,
  val canFly: Boolean = false,
  val canSwim: Boolean = false
)

