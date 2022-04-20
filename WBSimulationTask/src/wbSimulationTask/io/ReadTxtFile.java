package wbSimulationTask.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import wbSimulationTask.commonFeatures.Common;
import wbSimulationTask.processes.GenerateMonsters;

public class ReadTxtFile {

	public Common[] readTextFile() {

		// Survivors survivorsModel = new Survivors();

		try (Scanner scanner = new Scanner(new FileReader("SimulationText.txt"))) {

			while (scanner.hasNextLine()) {
				String lineInfo = scanner.nextLine();
				GenerateMonsters.getSurvivorsInfo(lineInfo);
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("File not found.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("There was a problem opening the file.");
		}
		return GenerateMonsters.setSurvivorsInfo();
	}

}
