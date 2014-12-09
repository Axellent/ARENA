package general;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

import league.Tournament;

/**
 * A socket connection to the ARENA server.
 * @author Axel Sigl
 *
 */
public class Connection {
	private Socket socket;
	private BufferedReader inputReader;
	private PrintWriter outputWriter;
	private ObjectInputStream objectInputStream;
	private ObjectOutputStream objectOutputStream;

	/**
	 * Initializes socket and IO streams for the connection.
	 * @autor Axel Sigl
	 */
	public Connection() {
		try {
			socket = new Socket("localhost", 12345);

			inputReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			outputWriter = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()), true);

		} catch (IOException e) {
			System.out.println("Could not connect to the ARENA server");
		}
	}

	/**
	 * Sends a command to the server to parse.
	 * Syntax: COMMAND [ARGUMENTS]
	 * Example: login yourAccountName yourPassword
	 * See "help" command for more information.
	 * @author Axel Sigl
	 * @param cmd
	 * @return
	 */
	public String command(String cmd) {
		String output = "";

		try {
			outputWriter.println(cmd);
			
			while(!(output = inputReader.readLine()).equals(null)){
				return output;
			}

		} catch (IOException e) {
			System.out.println("Connection to the ARENA server interuppted");
		}
		return "";
	}
	
	/**
	 * 
	 * @author Axel Sigl
	 * @param name
	 * @return
	 */
	public Tournament requestTournament(String name){
		
		outputWriter.println("-tournament " + name);
		
		try {
			objectInputStream = new ObjectInputStream(socket.getInputStream());
			return (Tournament) objectInputStream.readObject();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	/**
	 * Closes the socket connected to the server.
	 * @author Axel Sigl
	 */
	public void closeConnection(){
		try {
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
