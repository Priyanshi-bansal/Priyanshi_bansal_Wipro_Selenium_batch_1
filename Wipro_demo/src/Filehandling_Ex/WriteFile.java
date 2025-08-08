package Filehandling_Ex;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter("Text.txt"));
			bw.write("hello Learners");
			bw.newLine();
			System.out.println("Successfully Written to File");
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(bw != null) {
					bw.close();
				}
			}catch(IOException err) {
				System.out.println("Error while closing the writer: " +err.getMessage());
			}
		}

	}

}
