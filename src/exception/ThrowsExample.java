package exception;

import java.io.IOException;

public class ThrowsExample {
	public static void main(String[] args) {
        CustomFileReader reader = new CustomFileReader();

        try {
            reader.readFile("sample.txt");
        } catch (IOException e) {
            System.out.println("IOException: " + e.getMessage());
        }
    }
}


