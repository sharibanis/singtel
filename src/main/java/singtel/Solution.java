package singtel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Solution {

	public static void main(String[] args) {
		Bird bird = new Bird();
		bird.walk();
		bird.fly();
		bird.sing();

		Animal[] animals = new Animal[] {
				new Bird(),
				new Duck(),
				new Chicken(),
				new Rooster(),
				new Parrot(),
				new Fish(),
				new Shark(),
				new Clownfish(),
				new Dolphin(),
				new Butterfly(),
		};
		
		int numFly = 0, numWalk = 0, numSing = 0, numSwim = 0;
		
		for (int i = 0; i < animals.length; i++) {
			Animal animal = animals[i];
			if ((animal instanceof Bird) || (animal instanceof Parrot) || (animal instanceof Butterfly) || (animal instanceof Duck)) {
				numFly++;
				if ((animal instanceof Bird) || (animal instanceof Parrot) || (animal instanceof Duck) 
						|| (animal instanceof Chicken) || (animal instanceof Rooster)) {
					numWalk++;
					if ((animal instanceof Bird) || (animal instanceof Parrot)) {
						numSing++;
						if ((animal instanceof Fish) || (animal instanceof Shark) || (animal instanceof Clownfish) || (animal instanceof Dolphin)) {
							numSwim++;
						}
					}
				}
			}
		}

		System.out.println(numFly + " animals can fly");
		System.out.println(numWalk + " animals can walk");
		System.out.println(numSing + " animals can sing");
		System.out.println(numSwim + " animals can swim");
		SpringApplication.run(Solution.class, args);
	}
}
