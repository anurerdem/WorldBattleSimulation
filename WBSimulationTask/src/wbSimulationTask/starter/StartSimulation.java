package wbSimulationTask.starter;

import wbSimulationTask.commonFeatures.Common;
import wbSimulationTask.io.ReadTxtFile;
import wbSimulationTask.processes.CalculationProcesses;
import wbSimulationTask.processes.GenerateMonsters;

public class StartSimulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// read the file
		ReadTxtFile readTheFile = new ReadTxtFile();
		Common[] survivorsInfo = readTheFile.readTextFile();

		CalculationProcesses calculateHpAndDistance = new CalculationProcesses();
		calculateHpAndDistance.remainingDistanceCalculation(survivorsInfo, GenerateMonsters.positions, GenerateMonsters.distance);

	}

}
