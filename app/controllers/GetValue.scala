package controllers

import play.api.mvc.{Action, AnyContent, Controller}

/**
  * Created by Administrator on 2017/6/28.
  */
object GetValue extends Controller{
  //制定一个正文解析器
  def index = Action(parse.tolerantText) {
      request =>
      //Ok("Got request [" + request +"-----"+ request.body + "           "+request.body.asFormUrlEncoded.toString+"         ]")
      //获取http提交回来的值，搜索  Play2 for Scala中文文档 – 5.Http正文解析器 http://www.tuicool.com/articles/aYZ7v2
      //val body: AnyContent = request.body
       // val textBody: Option[String] = body.asText

        // Expecting text body
       // textBody.map { text =>
        //展示从上个页面获取的值，设置session
        //关于session和flash的使用http://www.tuicool.com/articles/aUrAZr
        //  Ok("Got: " + request.body).withSession("username"->"Abner")
        //}.getOrElse {
       //   BadRequest("Expecting text/plain request body")
       // }
      Ok(views.html.value(request.body)).withSession("username"->"Abner")
  }
}
