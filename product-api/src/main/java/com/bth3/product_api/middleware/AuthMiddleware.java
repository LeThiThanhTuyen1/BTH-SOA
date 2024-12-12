package com.bth3.product_api.middleware;

public class AuthMiddleware implements Middleware {
    @Override
    public void handle(Request request, Response response) {
        String token = request.header("Authorization");
        if (token == null || !token.startsWith("Bearer ")) {
            response.status(401).text("Unauthorized");
            return;
        }

        token = token.replace("Bearer ", "");
        try {
            JWT.require(Algorithm.HMAC256("your-secret-key"))
                    .withIssuer("auth-service")
                    .build()
                    .verify(token);
        } catch (JWTVerificationException e) {
            response.status(401).text("Invalid token");
        }
    }
}
