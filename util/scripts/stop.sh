if [ ! -f site.pid ]; then
   exit 0
fi

kill -9 "$(cat site.pid)"
