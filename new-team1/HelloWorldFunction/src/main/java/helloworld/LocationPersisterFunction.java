package helloworld;

import java.util.*;
import java.io.*;

//com.example.persister.LocationPersisterFunction
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClient;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyResponseEvent;

//defines the handleRequest function which is executed when the Lambda function is triggered. The handleRequest function takes two parameters: the input (which is of DeviceLocation type and is passed-in when the function is invoked Context object).

public class LocationPersisterFunction {

    public APIGatewayProxyResponseEvent handleRequest() {

        // final AmazonDynamoDBClient client = new AmazonDynamoDBClient(new
        // EnvironmentVariableCredentialsProvider());
        // client.withRegion(Regions.EU_WEST_1); // specify the region you created the
        // table in.
        // DynamoDB dynamoDB = new DynamoDB(client);
        // Table table = dynamoDB.getTable("DeviceLocation");
        // final Item item = new Item()
        // .withPrimaryKey("id", UUID.randomUUID().toString()) // Every item gets a
        // unique id
        // .withString("deviceId", input.getDeviceId())
        // .withDouble("lat", input.getLat())
        // .withDouble("lng", input.getLng());
        // table.putItem(item);

        return null;
    }

}
