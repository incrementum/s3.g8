# s3.g8

Mill-based scala3 project template. Includes a starter package, main method and worksheet under the ```src``` directory.

#### Usage in VS Code

To create a new project from this template:

From the left sidebar, select ```Metals -> New Project -> Custom (template)``` and enter ```incrementum/s3.g8``` or the full url to the repository. After a few seconds, VS Code will prompt for the project properties and whether to open a new editor window. Select "yes" and the project will start to build. Open Main.scala to initate the editor build. After a little while the worksheet should resolve its errors and run the starter code.

#### Add libraries

```scala
import mill._, scalalib._
import $ivy.`com.lihaoyi::mill-contrib-bloop:$MILL_VERSION`

object p01 extends ScalaModule {
  def scalaVersion = "3.1.0"
  def ivyDeps = Agg(
    ivy"com.lihaoyi::os-lib:0.7.8"
  )  
}
```

#### Run a Console on the Project

```scala
mill-i p01.console
```
