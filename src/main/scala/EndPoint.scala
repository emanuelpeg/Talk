import zhttp.http._

package com.assembly.talk.endpoint:

  object GreeterEndPoint {

    def apply(): Http[Any, Nothing, Request, Response] =
      Http.collect[Request] {

        // GET /greet?name=:name
        case req@(Method.GET -> !! / "greet") if (req.url.queryParams.nonEmpty) =>
          Response.text(s"Hi ${(req.url.queryParams("name").mkString(","))}")
        case req@(Method.GET -> !! / "greet") if (!req.url.queryParams.nonEmpty) =>
          Response.text(s"Hi")

      }


  }
