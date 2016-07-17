#!/bin/sh
docker run -ti --rm -p 127.0.0.1:7894:7894 -v $(pwd -P)/..:/root/docker clojure:latest /bin/bash
