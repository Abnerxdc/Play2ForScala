package controllers

import play.api.mvc.{Action, Controller}

/**
  * Created by Administrator on 2017/6/28.
  */
object User extends Controller{
  def index = Action {
    Ok(views.html.Userh("Hello Word!","天哪 值的传递这么方便 ！"))
    //可以在这里做一些http响应
//    val ok = Ok("Hello world!")
//    val notFound = NotFound
//    val pageNotFound = NotFound(<h1>Page not found</h1>)
//    val badRequest = BadRequest(views.html.form(formWithErrors))
//    val oops = InternalServerError("Oops")
//    val anyStatus = Status(488)("Strange response type")
    //可以在这里做一些重定向
//    Redirect("/user/home")
  }

  //获取Http的请求对象 (即play.api.mvc.Request)，可以使用如下的方法：
//   Action { request =>
//     Ok("Got request [" + request + "]")
//  }
}
