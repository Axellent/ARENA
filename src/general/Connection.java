package general;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * 
 * @author Axel Sigl
 *
 */
public class Connection {
	private Socket socket;
	private BufferedReader in;
	private PrintWriter out;

	/**
	 * 
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
			e.printStackTrace();
		}
	}

	/**
	 * 
	 * @author Axel Sigl
	 * @param cmd
	 */
	public void command(String cmd) {
		String output = "";

		try {
			out.println(cmd);
			
			output = in.readLine();
			System.out.println(output);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 
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