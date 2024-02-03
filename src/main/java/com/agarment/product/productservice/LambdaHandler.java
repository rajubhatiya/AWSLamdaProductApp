package com.agarment.product.productservice;

import com.amazonaws.serverless.exceptions.ContainerInitializationException;
import com.amazonaws.serverless.proxy.model.AwsProxyRequest;
import com.amazonaws.serverless.proxy.model.AwsProxyResponse;
import com.amazonaws.serverless.proxy.spring.SpringBootLambdaContainerHandler;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import javax.ws.rs.core.Application;

public class LambdaHandler implements RequestHandler<AwsProxyRequest, AwsProxyResponse> {
    private static SpringBootLambdaContainerHandler<AwsProxyRequest, AwsProxyResponse> handler;

    static {
        try {
            System.out.println("Handler going to assign...................................");
            handler = SpringBootLambdaContainerHandler.getAwsProxyHandler(ProductserviceApplication.class);
            System.out.println("Handler assigned...................................");
        }
        catch (ContainerInitializationException ex){
            ex.printStackTrace();
            throw new RuntimeException("Unable to load spring boot application",ex); }
    }

    @Override
    public AwsProxyResponse handleRequest(AwsProxyRequest input, Context context) {
        if(null!=input && null!=input.getBody()) {
            System.out.println("Value of input body: "+input.getBody());
        }
        if(null!=input && null!=input.getPath()) {
            System.out.println("Value of input : "+input.getPath());
        }
        return handler.proxy(input, context);
    }
}