#!/bin/bash

set -xe

cd git-assets/boot-sample
mvn package
cp target/concourse-demo-*.jar ../../app-output/concourse-demo.jar
