package controllers

import play.api.mvc._

object Application extends Controller {
    def index = Action {
//        Ok(views.html.index("Your new application is ready."))
	    Redirect(routes.TaskApplication.tasks)
    }

    def test = Action {
        Ok(views.html.test("Hello World!!!!!"))
    }

    def echo = Action { request =>
        Ok("Got request [" + request + "]")
    }
}