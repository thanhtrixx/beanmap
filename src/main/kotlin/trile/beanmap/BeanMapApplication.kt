package trile.beanmap

import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.ApplicationContext
import trile.beanmap.bean.Animal

@SpringBootApplication
class BeanMapApplication(
  private val appContext: ApplicationContext
) : CommandLineRunner {

  override fun run(vararg args: String?) {
    appContext.getBeansOfType(Animal::class.java)
      .forEach { it.value.sayInfo() }

  }
}

fun main(args: Array<String>) {
  runApplication<BeanMapApplication>(*args)
}
