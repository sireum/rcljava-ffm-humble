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
import org.sireum.project.ProjectUtil._
import org.sireum.project.Project

val homeDir = Os.slashDir.up.canon

val ros2 = moduleJvmPub(
  id = "ros2",
  baseDir = homeDir,
  jvmDeps = ISZ(),
  jvmIvyDeps = ISZ(),
  pubOpt = pub(
    desc = "ROS2 rcl and rclc Java FFM API",
    url = "github.com/sireum/rcljava-ffm-humble",
    licenses = ISZ(org.sireum.project.PublishInfo.License(
      name = "Apache 2.0",
      url = "https://github.com/sireum/rcljava-ffm-humble/blob/master/LICENSE",
      distribution = "repo"
    )),
    devs = ISZ(robby)
  )
)

val project = Project.empty + ros2

projectCli(Os.cliArgs, project)
