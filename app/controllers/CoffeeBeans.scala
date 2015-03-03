package controllers

import play.api.mvc._


/**
 * @author freeism
 * @since 15. 3. 2.
 */
object CoffeeBeans extends Controller {
	def open = Action {
        Ok(<h1>test</h1>).as(HTML)
    }

    def bet = TODO
}
