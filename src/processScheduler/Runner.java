package processScheduler;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class Runner {

	public static void main(String[] args) {

		// initilise scanner
		Scanner console = new Scanner(System.in);
		int amtProcess;
		int burstTime;
		String proName;
		int choice;
		int quantum;

		System.out.println("Process Scheduler");
		System.out.println("=================");
		System.out.println("Enter amount of processes :");
		amtProcess = console.nextInt();

		// array of processes
		Process[] myProcess = new Process[amtProcess];
		// loop for amount of processes
		for (int i = 0; i < amtProcess; i++) {

			System.out.println("Enter the process name " + (i + 1) + ":");
			proName = console.next();
			System.out.println("Enter Burst time for process " + (i + 1));
																		
			burstTime = console.nextInt();
			
			//assign  values to Process Array
			myProcess[i]= new Process(proName,burstTime);

		} // for

		for(int j= 0;j<myProcess.length;j++){
			System.out.println(myProcess[j].toString());
		}
		System.out.println(
				"Choose process algorithim \n========================= \n 1.Round Robin\n 2.First Come First Serve\n 3.Shortest Job first\n 4.Exit");
		choice = console.nextInt();

		switch (choice) {
		case 1:
			System.out.println("Enter Quantum time :");
			console.nextInt();
			// run round robin
			break;
		case 2:
			// run First come first serve
			break;
		case 3:
			// run shortest job first
			break;
		case 4:
			System.out.println("Program Exited");
			break;
		// exit

		}// switch(choice)

	}// main

}
