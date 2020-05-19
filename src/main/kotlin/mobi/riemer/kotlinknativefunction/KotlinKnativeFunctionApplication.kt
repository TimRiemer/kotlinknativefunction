package mobi.riemer.kotlinknativefunction

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class KotlinKnativeFunctionApplication {

    @Bean
    fun hello(): (String) -> String {
        return  { s: String -> "Hello $s!" }
    }
}

fun main(args: Array<String>) {
    runApplication<KotlinKnativeFunctionApplication>(*args)
}