package controllers

import play.api.mvc._


/**
 * @author Venice
 * @since 15. 3. 2.
 */
object CoffeeBeans extends Controller {

  def index = Action {
    Ok(views.html.index)
  }

  def open = Action {
    Ok(<h1>test</h1>).as(HTML)
  }

  def bet = TODO


}
