#!/bin/bash
nohup java -jar ../executable/site.jar > site.log 2> site.errors.log < /dev/null &
PID=$!
echo $PID > site.pid
