#!/bin/sh
docker run -ti --rm -v $(pwd -P)/..:/root/docker clojure:latest /bin/bash
