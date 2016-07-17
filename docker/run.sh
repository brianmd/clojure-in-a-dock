#!/bin/sh
# note: must be run from the docker directory
mkdir -p m2
mkdir -p lein
docker run -ti --rm -p 127.0.0.1:7894:7894 -v $(pwd -P)/..:/root/docker -v $(pwd -P)/m2:/root/.m2 -v $(pwd -P)/lein:/root/.lein clojure:latest /bin/bash
