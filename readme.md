# ROS2 rcl and rclc Java FFM API
[![](https://jitpack.io/v/org.sireum/rcljava-ffm-humble.svg)](https://jitpack.io/#org.sireum/rcljava-ffm-humble)
[![](https://img.shields.io/badge/license-Apache_2.0-brightgreen.svg)](https://github.com/sireum/rcljava-ffm-humble/blob/master/LICENSE)

This repository holds the generated [jextract](https://github.com/openjdk/jextract) Java FFM binding from ROS2 header files.

## Setup

```
sireum proyek ive --javac "-source,22,-target,22,-encoding,utf8,-XDignore.symbol.file,-Xlint:-options,-Xlint:deprecation,-proc:none" --scalac "-release,22,-deprecation,-Yrangepos,-Ydelambdafy:method,-feature,-unchecked,-Xfatal-warnings,-language:postfixOps" .
```

## Compile

```
sireum proyek compile --javac "-source,22,-target,22,-encoding,utf8,-XDignore.symbol.file,-Xlint:-options,-Xlint:deprecation,-proc:none" --scalac "-release,22,-deprecation,-Yrangepos,-Ydelambdafy:method,-feature,-unchecked,-Xfatal-warnings,-language:postfixOps" .
```
