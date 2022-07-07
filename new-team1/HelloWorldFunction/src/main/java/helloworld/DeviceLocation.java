package helloworld;

// class com.example.persister.DeviceLocation
import java.io.*;
import java.util.*;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyResponseEvent;

public class DeviceLocation {

    private double lat;
    private double lng;
    private String deviceId;

    public double getLat() {
        return lat;
    }

    public void setLat(double newLat) {
        this.lat = newLat;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double newLng) {
        this.lng = newLng;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String newDeviceId) {
        this.deviceId = newDeviceId;
    }

}
