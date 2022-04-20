package wbSimulationTask.processes;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import wbSimulationTask.commonFeatures.Common;
import wbSimulationTask.survivors.Bug;
import wbSimulationTask.survivors.Hero;
import wbSimulationTask.survivors.Lion;
import wbSimulationTask.survivors.Mutant;
import wbSimulationTask.survivors.Zombie;
import wbSimulationTask.survivors.ZombieDog;

public class GenerateMonsters {

	public static int distance;
	public static Map<String, Integer> heroMap = new LinkedHashMap<String, Integer>();
	public static Map<String, Integer> bugMap = new LinkedHashMap<String, Integer>();
	public static Map<String, Integer> lionMap = new LinkedHashMap<String, Integer>();
	public static Map<String, Integer> zombieMap = new LinkedHashMap<String, Integer>();
	public static Map<String, Integer> zombieDogMap = new LinkedHashMap<String, Integer>();
	public static Map<String, Integer> mutantMap = new LinkedHashMap<String, Integer>();
	public static Map<String, Integer> positions = new LinkedHashMap<String, Integer>();
	public static int counter = 0;

	public static void getSurvivorsInfo(String survivorsInfo) {
		String[] array = survivorsInfo.toUpperCase().split(" ");
		Set<String> set = new HashSet<String>(Arrays.asList(array));

		if (set.contains("RESOURCES") || set.contains("RESOURCE")) {
			distance = Integer.valueOf(array[2]);

		} else if (set.contains("HERO")) {
			if (set.contains("HP")) {
				heroMap.put("healthPoint", Integer.valueOf(array[2]));
			} else if (set.contains("ATTACK") || set.contains("ATTACKS")) {
				heroMap.put("attackPoint", Integer.valueOf(array[3]));
			} else if (set.contains("POSITION") || set.contains("POSÝTÝON")) {
				positions.put("Hero" + "/" + counter, Integer.valueOf(array[6]));
				counter++;
			}

		} else if (set.contains("BUG")) {

			if (set.contains("HP")) {
				bugMap.put("healthPoint", Integer.valueOf(array[2]));
			} else if (set.contains("ATTACK") || set.contains("ATTACKS")) {
				bugMap.put("attackPoint", Integer.valueOf(array[3]));
			} else if (set.contains("POSITION") || set.contains("POSÝTÝON")) {
				positions.put("Bug" + "/" + counter, Integer.valueOf(array[6]));
				counter++;
			}

		} else if (set.contains("LION") || set.contains("LÝON")) {

			if (set.contains("HP")) {
				lionMap.put("healthPoint", Integer.valueOf(array[2]));
			} else if (set.contains("ATTACK") || set.contains("ATTACKS")) {
				lionMap.put("attackPoint", Integer.valueOf(array[3]));
			} else if (set.contains("POSITION") || set.contains("POSÝTÝON")) {
				positions.put("Lion" + "/" + counter, Integer.valueOf(array[6]));
				counter++;
			}

		} else if (set.contains("ZOMBIE") || set.contains("ZOMBÝE")) {

			if (set.contains("HP")) {
				zombieMap.put("healthPoint", Integer.valueOf(array[2]));
			} else if (set.contains("ATTACK") || set.contains("ATTACKS")) {
				zombieMap.put("attackPoint", Integer.valueOf(array[3]));
			} else if (set.contains("POSITION") || set.contains("POSÝTÝON")) {
				positions.put("Zombie" + "/" + counter, Integer.valueOf(array[6]));
				counter++;
			}

		} else if (set.contains("ZOMBIEDOG") || set.contains("DOGZOMBIE") || set.contains("ZOMBÝEDOG")
				|| set.contains("DOGZOMBÝE")) {

			if (set.contains("HP")) {
				zombieDogMap.put("healthPoint", Integer.valueOf(array[2]));
			} else if (set.contains("ATTACK") || set.contains("ATTACKS")) {
				zombieDogMap.put("attackPoint", Integer.valueOf(array[3]));
			} else if (set.contains("POSITION") || set.contains("POSÝTÝON")) {
				positions.put("ZombieDog" + "/" + counter, Integer.valueOf(array[6]));
				counter++;
			}

		} else if (set.contains("MUTANT")) {

			if (set.contains("HP")) {
				mutantMap.put("healthPoint", Integer.valueOf(array[2]));
			} else if (set.contains("ATTACK") || set.contains("ATTACKS")) {
				mutantMap.put("attackPoint", Integer.valueOf(array[3]));
			} else if (set.contains("POSITION") || set.contains("POSÝTÝON")) {
				positions.put("Mutant" + "/" + counter, Integer.valueOf(array[6]));
				counter++;
			}

		}
	}

	public static Common[] setSurvivorsInfo() {
		Common[] survivorsArray = new Common[10];
		Hero hero = new Hero(heroMap.get("healthPoint"), heroMap.get("attackPoint"));
		survivorsArray[0] = hero;
		if (!bugMap.isEmpty()) {
			Bug bug = new Bug(bugMap.get("healthPoint"), bugMap.get("attackPoint"));
			survivorsArray[1] = bug;
		}
		if (!zombieMap.isEmpty()) {
			Zombie zombie = new Zombie(zombieMap.get("healthPoint"), zombieMap.get("attackPoint"));
			survivorsArray[2] = zombie;
		}
		if (!zombieDogMap.isEmpty()) {
			ZombieDog zombieDog = new ZombieDog(zombieDogMap.get("healthPoint"), zombieDogMap.get("attackPoint"));
			survivorsArray[3] = zombieDog;
		}
		if (!lionMap.isEmpty()) {
			Lion lion = new Lion(lionMap.get("healthPoint"), lionMap.get("attackPoint"));
			survivorsArray[4] = lion;
		}
		if (!mutantMap.isEmpty()) {
			Mutant mutant = new Mutant(mutantMap.get("healthPoint"), mutantMap.get("attackPoint"));
			survivorsArray[5] = mutant;
		}

		return survivorsArray;
	}

}
