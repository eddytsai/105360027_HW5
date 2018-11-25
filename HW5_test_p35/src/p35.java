import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class p35 {
	public static void main(String[]args)
	{
		
		try
		{
			FileWriter fw  = new FileWriter("test1.txt");
			PrintWriter pw = new PrintWriter(new BufferedWriter(fw));
			
			pw.println("Hello");
			pw.println("Goodbye");		
			
			pw.close();
			
			System.out.println("已寫入檔案");
		}
		catch(IOException e) {
			System.out.println("輸入輸出有誤");
		}
	}
}
