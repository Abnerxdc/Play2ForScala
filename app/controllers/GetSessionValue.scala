package controllers



import play.api.mvc.{Action, AnyContent, Controller}

/**
  * Created by Administrator on 2017/6/28.
  */
object GetSessionValue extends Controller{

  def show (id : String)= Action {
    request =>
    request.session.get("username").map { user =>
      Ok("Hello session value : " + user+"  with the id : "+id)
    }.getOrElse {
      Unauthorized("Oops, you are not connected")
    }
  }
  def demo = Action {
    request =>
      request.session.get("username").map { user =>
        Ok("Hello session value : " + user+"  I don't have id  ")
      }.getOrElse {
        Unauthorized("Oops, you are not connected")
      }
  }

  def download = Action{
    Ok.sendFile(
      content = new java.io.File("./tmp/scala.txt"),
      fileName = _ => "tempDownLoad.txt"
    )
  }
}
