package general;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
	private BufferedReader in;
	private PrintWriter out;

	/**
	 * Initializes socket and IO streams for the connection.
	 * @autor Axel Sigl
	 */
	public Connection() {
		try {
			socket = new Socket("localhost", 12345);

			in = new BufferedReader(new InputStreamReader(
					socket.getInputStream()));
			out = new PrintWriter(new OutputStreamWriter(
					socket.getOutputStream()), true);

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
	 */
	public void command(String cmd) {
		String output = "";

		try {
			out.println(cmd);
			
			while(!(output = in.readLine()).equals(null)){
				System.out.println(output);
			}

		} catch (IOException e) {
			System.out.println("Connection to the ARENA server interuppted");
		}
	}
	
	/**
	 * 
	 * @author Axel Sigl
	 * @param name
	 * @return
	 */
	public Tournament requestTournament(String name){
		
		out.println("-tournament " + name);
		
		//return tournament from server
		
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
