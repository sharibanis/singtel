package singtel;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class AppRestController {
	@RequestMapping("/animalSays")
    public String result (@RequestParam(value="animalName", defaultValue="Rooster") String name) {
		String result = "";
		if (name.equalsIgnoreCase("Rooster")) {
			Rooster rooster = new Rooster();
			result = rooster.says();
		} else if (name.equalsIgnoreCase("Bird")) {
			Bird bird = new Bird();
			result = bird.sing();
		} else if (name.equalsIgnoreCase("Duck")) {
			Duck duck = new Duck();
			result = duck.says();
		} else if (name.equalsIgnoreCase("Chicken")) {
			Chicken chicken = new Chicken();
			result = chicken.says();
		} else if (name.equalsIgnoreCase("Parrot")) {
			Parrot parrot = new Parrot();
			result = parrot.sing();
		} else {}
				
		return result;
    }
}
