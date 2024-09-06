::/*#! 2> /dev/null                                 #
@ 2>/dev/null # 2>nul & echo off & goto BOF         #
if [ -z ${SIREUM_HOME} ]; then                      #
  echo "Please set SIREUM_HOME env var"             #
  exit -1                                           #
fi                                                  #
exec ${SIREUM_HOME}/bin/sireum slang run "$0" "$@"  #
:BOF
setlocal
if not defined SIREUM_HOME (
  echo Please set SIREUM_HOME env var
  exit /B -1
)
%SIREUM_HOME%\bin\sireum.bat slang run "%0" %*
exit /B %errorlevel%
::!#*/
// #Sireum

import org.sireum._

if (Os.cliArgs.size > 1) {
  println("Usage: [ <ros2-dir> ]")
  Os.exit(0)
}

val ros = Os.path(if (Os.cliArgs.size > 0) Os.cliArgs(0) else "/opt/ros")
if (~ros.exists) {
  eprintln(s"$ros does not exist")
  Os.exit(-1)
}
val home = Os.slashDir.up.canon

def gen(p: Os.Path): Unit = {
  val include = p / "include"
  if (~include.exists) {
    eprintln(s"$include does not exist")
    Os.exit(-1)
  }

  var commands = ISZ[String]("jextract", "-I", include.string)
  for (d <- include.list) {
    commands = commands :+ "-I"
    commands = commands :+ d.string
  }
  commands = commands :+ "--output"
  commands = commands :+ (home / "jvm" / "src" / "main" / "java").string
  commands = commands :+ "--target-package"
  commands = commands :+ s"org.sireum.ffm.ros.${p.name}"
  commands = commands :+ (home / "bin" / "gen.h").string

  Os.proc(commands).echo.console.runCheck()
}

for (d <- ros.list if d.name == "humble") {
  println(s"Generating FFM for ${d.name} ...")
  gen(d)
  println("done!")
  println()
}