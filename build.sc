// https://scalacenter.github.io/bloop/docs/build-tools/mill#install-the-plugin
// https://scalacenter.github.io/bloop/docs/build-tools/mill#export-your-build
//   mill mill.contrib.Bloop/install
import mill._, scalalib._
import \$ivy.`com.lihaoyi::mill-contrib-bloop:\$MILL_VERSION`

object $project01$ extends ScalaModule {
  def scalaVersion = "$scalaVersion$"
}

