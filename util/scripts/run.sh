#!/bin/bash
chmod +x java_run.sh

nohup ./java_run.sh > site.log 2> site.errors.log < /dev/null &
PID=$!
echo $PID > site.pid