#!/bin/bash

set -xe

cd git-assets/
mvn package
cp target/concourse-demo-*.jar ../app-output/concourse-demo.jar
