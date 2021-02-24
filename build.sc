// http://www.lihaoyi.com/mill/page/configuring-mill.html
import mill._, scalalib._
import \$ivy.`com.lihaoyi::mill-contrib-bloop:\$MILL_VERSION`

object $project01$ extends ScalaModule {
  def scalaVersion = "$scalaVersion$"
}

