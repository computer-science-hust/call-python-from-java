package main;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CmdCall {
    public void call(){
        try{
            String command = "python3 /home/trannguyenhan/Code/eclipse-workspace/CallPythonWithJava/src/python/main.py ";
            Process proc = Runtime.getRuntime().exec(command);

            // Read the output
            System.out.println("Reading the output");
            BufferedReader reader = new BufferedReader(new InputStreamReader(proc.getInputStream()));

            String line = "";
            while((line = reader.readLine()) != null) {
                System.out.print(line + "\n");
            }

            proc.waitFor();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
		new CmdCall().call();
	}
}
