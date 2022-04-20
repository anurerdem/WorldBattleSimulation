package wbSimulationTask.io;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteTxtFile {

	public void writeOperationToFile(String line) {

		try (FileWriter writer = new FileWriter("Simulationlog.txt", true)) {
			writer.write(line + "\n");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("There was a problem opening the file.");
		}

	}

	public void cleanLogFile() {

		try (PrintWriter write = new PrintWriter("Simulationlog.txt")) {
			write.print("");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("There was a problem opening the file.");
		}
	}

}
