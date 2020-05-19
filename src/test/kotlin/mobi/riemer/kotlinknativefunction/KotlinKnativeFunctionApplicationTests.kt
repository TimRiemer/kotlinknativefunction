package mobi.riemer.kotlinknativefunction

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class KotlinKnativeFunctionApplicationTests {

	@Test
	fun hello() {
		val hello: (String) -> String = KotlinKnativeFunctionApplication().hello()
		Assertions.assertThat(hello("World")).isEqualTo("Hello World!")
	}
}
