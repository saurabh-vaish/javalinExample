package com.app;

import com.app.controller.EmployeeController;
import io.javalin.Javalin;
import io.javalin.apibuilder.ApiBuilder;

/***
 * @author saurabh vaish
 * @version 1.0
 * @since 27/01/20
 ***/
public class JavalinApplication {

    public static void main(String[] args) {

        Javalin app = Javalin.create().start(7070);
        EmployeeController controller = new EmployeeController();
//        app.get("/", ctx->ctx.result("hiii"));
        app.get("/all", ctx->{ctx.json(controller.getAllEmployees());});
//        app.post("/save", ctx->ctx.result("hiii"));
//        app.get("/get", ctx->ctx.result("hiii"));

    }
}
