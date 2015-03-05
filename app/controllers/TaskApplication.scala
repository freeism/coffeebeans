package controllers

import models._
import play.api.data.Forms._
import play.api.data._
import play.api.mvc._

/**
 * @author freeism
 * @since 15. 3. 3.
 */
object TaskApplication extends Controller {
	val taskForm = Form(
		"label" -> nonEmptyText
	)

	def tasks = Action {
		Ok(views.html.task(Task.all, taskForm))
	}

	def newTask = Action { implicit request =>
		taskForm.bindFromRequest().fold(
		    errors => BadRequest(views.html.task(Task.all, errors)),
		    label => {
			    Task.create(label)
			    Redirect(routes.TaskApplication.tasks)
		    }
		)
	}

	def deleteTask(id: Long) = Action {
		Task.delete(id)
		Redirect(routes.TaskApplication.tasks)
	}
}
