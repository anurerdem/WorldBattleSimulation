package wbSimulationTask.processes;

import java.util.Collections;
import java.util.Map;

import wbSimulationTask.commonFeatures.Common;
import wbSimulationTask.io.WriteTxtFile;

public class CalculationProcesses {

	static WriteTxtFile writeFile = new WriteTxtFile();

	public void remainingDistanceCalculation(Common[] survivorsArray, Map<String, Integer> positions, int distance) {

		writeFile.cleanLogFile();
		writeFile.writeOperationToFile("Hero started journey with " + survivorsArray[0].getHealth() + "HP!");

		boolean checkHealthPoint = true;
		while (checkHealthPoint) {

			if (survivorsArray[0].getHealth() <= 0) {
				writeFile.writeOperationToFile("Hero is dead!! Last seen at position " + distance + "!!");
				checkHealthPoint = false;

			} else {

				if (distance > 0) {
					String key = Collections.min(positions.entrySet(), Map.Entry.comparingByValue()).getKey();
					distance -= positions.get(key);
					checkMonsterIsLive(key.toUpperCase().split("/"), positions.get(key), survivorsArray);
					positions.remove(key);
				} else {
					writeFile.writeOperationToFile("Hero Survived!");
					checkHealthPoint = false;
				}
			}

		}

	}

	private static void checkMonsterIsLive(String[] key, Integer value, Common[] survivorsArray) {
		switch (key[0]) {
		case "BUG":
			if (survivorsArray[1].isAlive()) {
				survivorsArray[0].health(survivorsArray[1].getAttackPoint());
				survivorsArray[1].health(survivorsArray[0].getAttackPoint());
				writeFile.writeOperationToFile(
						"Hero defeated Bug with " + survivorsArray[0].getHealth() + " HP remaining.");
			}
			break;
		case "ZOMBÝE":
			if (survivorsArray[2].isAlive()) {
				survivorsArray[0].health(survivorsArray[2].getAttackPoint());
				survivorsArray[2].health(survivorsArray[0].getAttackPoint());
				writeFile.writeOperationToFile(
						"Hero defeated Zombie with " + survivorsArray[0].getHealth() + " HP remaining.");
			}
			break;

		case "ZOMBÝEDOG":
			if (survivorsArray[3].isAlive()) {
				survivorsArray[0].health(survivorsArray[3].getAttackPoint());
				survivorsArray[3].health(survivorsArray[0].getAttackPoint());
				writeFile.writeOperationToFile(
						"Hero defeated ZombieDog with " + survivorsArray[0].getHealth() + " HP remaining.");
			}
			break;

		case "LÝON":
			if (survivorsArray[4].isAlive()) {
				survivorsArray[0].health(survivorsArray[4].getAttackPoint());
				survivorsArray[4].health(survivorsArray[0].getAttackPoint());
				writeFile.writeOperationToFile(
						"Hero defeated Lion with " + survivorsArray[0].getHealth() + " HP remaining.");
			}
			break;

		case "MUTANT":
			if (survivorsArray[5].isAlive()) {
				survivorsArray[0].health(survivorsArray[5].getAttackPoint());
				survivorsArray[5].health(survivorsArray[0].getAttackPoint());
				writeFile.writeOperationToFile(
						"Hero defeated Mutant with " + survivorsArray[0].getHealth() + " HP remaining.");
			}
			break;

		default:
			break;
		}
	}

}
