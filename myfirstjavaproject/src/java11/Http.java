package java11;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Http {
	    public static void main(String[] args) {
	       
	        HttpClient httpClient = HttpClient.newHttpClient();  										
	        String url = "https://httpbin.org/get";//  URL to send the GET request to
	        HttpRequest request = HttpRequest.newBuilder() // HttpRequest with the GET method
	                .uri(URI.create(url))
	                .GET()
	                .build();

	        try {
	            // Send the GET request and receive the response
	            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
	            System.out.println("Response Headers:");
	            response.headers().map().forEach((key, value) -> System.out.println(key + ":" + value));
	            System.out.println("Response Status Code: " + response.statusCode());
	            System.out.println("Response Body:");
	            System.out.println(response.body());
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	}

