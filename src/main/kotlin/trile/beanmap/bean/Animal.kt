package trile.beanmap.bean

import org.springframework.stereotype.Component
import tri.le.statemachine.uti.Log
import trile.beanmap.config.AnimalConfigs
import trile.beanmap.config.DEFAULT_KEY
import trile.beanmap.config.getOrDefaultKey


abstract class Animal(animalConfigs: AnimalConfigs) : Log {

  abstract val name: String
  private val config = animalConfigs.configMap.getOrDefaultKey(name, DEFAULT_KEY)

  fun sayInfo() {
    l.info { "Name: $name | Info: $config" }
  }
}

@Component
class Dog(animalConfigs: AnimalConfigs) : Animal(animalConfigs) {
  override val name
    get() = "dog"
}

@Component
class Duck(animalConfigs: AnimalConfigs) : Animal(animalConfigs) {
  override val name
    get() = "duck"
}

@Component
class Tiger(animalConfigs: AnimalConfigs) : Animal(animalConfigs) {
  override val name
    get() = "tiger"
}
