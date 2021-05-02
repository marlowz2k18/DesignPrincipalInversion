package ie.gmit.exercise;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.Normalizer;

public class MainMessageApp {

	public static void main(String[] args) throws IOException {

		//Formatter formatter = new JSONFormatter();
		Formatter formatter = new TextFormatter();
		//PrintWriter writer = new PrintWriter(new FileWriter("test_msg.txt"));
		PrintWriter writer = new PrintWriter(System.out);

		Message msg = new Message("This is a message to the Prime Minister...lockdown over please");
		MessagePrinter printer = new MessagePrinter();
		printer.writeMessage(msg,formatter,writer);
	}

}
