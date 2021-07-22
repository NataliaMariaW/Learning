package pl.nataliawojtkowiak.learning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class JavaBasicsController {

	@GetMapping("/helloworld")
	private String getHelloWorld() {

		return "Hello World!";
	}

}
