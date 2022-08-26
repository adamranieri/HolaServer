package dev.ranieri.app;

import io.javalin.Javalin;

public class App {

    public static void main(String[] args) {
        Javalin app = Javalin.create();

        app.get("/hola", ctx -> {
            ctx.result("Hola " + System.getenv("SOMETHING"));
        });

        app.get("wassup",ctx -> ctx.result("cool"));

        app.start();
    }
}
