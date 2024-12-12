package com.bth3.product_api.middleware;

import org.apache.catalina.connector.Request;
import org.apache.catalina.connector.Response;

public interface Middleware {
	void handle(Request request, Response response);
}
