import zhttp.service.Server
import zio._
import com.assembly.talk.endpoint.GreeterEndPoint

package com.assembly.talk.main:
  object MainApp extends ZIOAppDefault {
  
    def run =
      Server.start(
        port = 8999,
        http = GreeterEndPoint()
      ).provide(
        ZLayer.fromZIO(Ref.make(0)),
      )
  
  }