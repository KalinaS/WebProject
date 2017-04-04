package com.kalina.main;

import java.io.File;
import java.util.Scanner;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import com.kalina.executor.FileScannerExecutor;
import com.kalina.walkdirectory.WalkDirectory;

public class MainClass {

	private static final Logger log = Logger.getLogger(FileScannerExecutor.class);

	public static void main(String[] args) {

		BasicConfigurator.configure();

		Scanner input = new Scanner(System.in);
		log.info("Enter path of the begining file: ");
		String path = input.nextLine();
		File[] files = new File(path).listFiles();

		WalkDirectory.showFiles(files);

	}
}
