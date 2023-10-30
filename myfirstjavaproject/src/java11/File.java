package java11;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

public class File {

		    public static void main(String[] args) {
		        Path filePath = Path.of("StudentList.txt");
		        
		        try {
		            List<String> studentLines = Files.lines(filePath)
		                .map(String::trim)
		                .filter(line -> !line.isEmpty())
		                .collect(Collectors.toList());
		            
		            int studentCount = studentLines.size();
		            
		            System.out.println("Total Students: " + studentCount);
		            
		            if (studentCount > 0) {
		                System.out.println("Student Names:");
		                studentLines.forEach(System.out::println);
		            }
		        } catch (IOException e) {
		            System.err.println("Error reading the file: " + e.getMessage());
		        }
		    }


	}

