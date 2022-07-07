package helloworld;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import com.amazonaws.auth.EnvironmentVariableCredentialsProvider;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClient;
import com.amazonaws.services.dynamodbv2.document.DynamoDB;
import com.amazonaws.services.dynamodbv2.document.Item;
import com.amazonaws.services.dynamodbv2.document.Table;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyResponseEvent;

/**
 * Handler for requests to Lambda function.
 */
public class App implements RequestHandler<APIGatewayProxyRequestEvent, APIGatewayProxyResponseEvent> {

    public APIGatewayProxyResponseEvent handleRequest(final APIGatewayProxyRequestEvent input, final Context context) {

        DynamoDB dynamoDb;
        Regions REGION = Regions.US_WEST_1;

        AmazonDynamoDBClient client = new AmazonDynamoDBClient();
        client.setRegion(Region.getRegion(REGION));
        dynamoDb = new DynamoDB(client);

        Table table = dynamoDb.getTable("Booking");
        final Item item = new Item()
                .withPrimaryKey("BookingID", 1002) // Every item gets a unique id
                .withString("DateCreated", "01-07-2022")
                .withInt("MemberID", 2);
        table.putItem(item);

        return null;

        // Map<String, String> headers = new HashMap<>();
        // headers.put("Content-Type", "application/json");
        // headers.put("X-Custom-Header", "application/json");

        // APIGatewayProxyResponseEvent response = new APIGatewayProxyResponseEvent()
        // .withHeaders(headers);
        // try {
        // final String pageContents =
        // this.getPageContents("https://checkip.amazonaws.com");
        // String output = String.format("{ \"message\": \"hello world\", \"location\":
        // \"%s\" }", pageContents);

        // return response
        // .withStatusCode(200)
        // .withBody(output);
        // } catch (IOException e) {
        // return response
        // .withBody("{}")
        // .withStatusCode(500);
        // }
    }

    // private String getPageContents(String address) throws IOException {
    // URL url = new URL(address);
    // try (BufferedReader br = new BufferedReader(new
    // InputStreamReader(url.openStream()))) {
    // return br.lines().collect(Collectors.joining(System.lineSeparator()));
    // }
    // }
}
