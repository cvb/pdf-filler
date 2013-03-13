#!/bin/sh

# set absolute pathes
FONT=font/LiberationMono-Regular.ttf
JAR=target/scala-2.10/pdf-filler_2.10-0.0.1-one-jar.jar

java -jar $JAR $FONT "$1" "$2"
