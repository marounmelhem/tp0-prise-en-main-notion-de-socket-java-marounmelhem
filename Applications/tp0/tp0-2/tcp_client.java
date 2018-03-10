/**
 *
 * @package  Accov tp0-2
 * @src tp0-2_tcp_client
 * @version  1.0
 * @developer  Maroun Melhem <http://maroun.me>
 *
 */
package tp0-2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class tcp_client {
     private static BufferedReader getInput(Socket p) throws IOException {
        return new BufferedReader(new InputStreamReader(p.getInputStream()));
    }
    
    private static PrintWriter getoutput(Socket p) throws IOException{
        return new PrintWriter (new OutputStreamWriter(p.getOutputStream()));
    }
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        Socket l = new Socket("localhost",2000);
        System.out.println(l.getLocalSocketAddress());
        BufferedReader ir = getInput(l);
        PrintWriter reply = getoutput(l);
        //Sending Chain
        reply.printf("Hello\n");reply.flush();
        //Print Message
        System.out.println(ir.readLine());
    }
}
