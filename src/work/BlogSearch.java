package work;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class BlogSearch {

    public static void main(String[] args) {
        // List of topics to search for
        List<String> topics = List.of(
                "free online tools", "orchestration tools in devops", "responsive testing tools",
                "automated ui testing tools", "qa testing tools", "mainframe automation tools",
                "uat testing tools", "regression testing tools", "agile testing tools",
                "cross browser testing tools", "black box testing tools", "test tool",
                "web testing tools", "test management tools", "orchestration tools",
                "front end testing tools", "ai testing tools", "rest api testing tools",
                "programming testing tools", "manual testing tools", "api automation tools",
                "debugging tools for windows", "api security testing tools",
                "software functional testing tools", "gui automation tools", "tools for testing",
                "web application testing tools", "cloud computing testing tools",
                "tosca automation tool", "mobile app automation testing tools",
                "responsive web design tools", "free testing tools for api testing",
                "desktop automation tools", "debug tools", "automation tools",
                "automated api testing tools", "ui test automation tools",
                "api performance testing tools", "automated test tools",
                "quality assurance automation tools", "automation of regression test tools",
                "mobile testing tools", "program testing tools", "web service testing tool",
                "responsive site testing tool", "etl automation testing tools",
                "chaos testing tools", "sha256 fingerprint to base64 online tool",
                "api test tool", "web based testing tool", "uft testing tool",
                "open source testing tools", "ai test automation tools",
                "mobile test automation tools", "testing tools list in software testing",
                "mobile performance testing tools", "open source test automation tools",
                "responsive website testing tool", "tester tool", "debugger tool",
                "mobile application testing tools", "cloud testing tools",
                "insomnia tool", "salesforce testing tools",
                "automation testing tools without coding", "ada testing tools",
                "cloud orchestration tools", "windows automation tools",
                "best mobile testing tools", "sw testing tools"
        );


        // Base URL of the blog
        String blogUrl = "https://apidog.com/blog/";

        // Search for each topic in the blog
        for (String topic : topics) {
            try {
                searchBlog(blogUrl, topic);
            } catch (Exception e) {
                System.out.println("Error searching for topic: " + topic);
                e.printStackTrace();
            }
        }
    }

    public static void searchBlog(String blogUrl, String topic) throws Exception {
        // Create a search URL by appending the topic to the blog search URL
        String searchUrl = blogUrl + "?s=" + topic.replace(" ", "+");
        HttpURLConnection conn = (HttpURLConnection) new URL(searchUrl).openConnection();
        conn.setRequestMethod("GET");

        // Read the response from the search URL
        BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String inputLine;
        StringBuilder content = new StringBuilder();

        while ((inputLine = in.readLine()) != null) {
            content.append(inputLine);
        }
        in.close();

        // Check if the topic is found in the page content
        if (content.toString().toLowerCase().contains(topic.toLowerCase())) {
            System.out.println("Published: " + topic);
            System.out.println("Link: " + searchUrl);
        } else {
            System.out.println("Not yet: " + topic);
        }
    }
}
