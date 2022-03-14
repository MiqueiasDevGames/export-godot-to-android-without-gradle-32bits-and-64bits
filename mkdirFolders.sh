#!/bin/bash


> .gdignore


rm -rf Notification/res
echo "creating Notification/res"
mkdir Notification/res
mkdir Notification/res/values


rm -rf ICONES
echo "creating ICONES"
mkdir ICONES

rm -rf My_Build/APKs
echo "creating My_Build/APKs/"
mkdir My_Build/APKs

rm -rf My_Build/AAB
echo "creating My_Build/AAB/"
mkdir My_Build/AAB

rm -rf My_Build/gen
echo "creating My_Build/gen/"
mkdir My_Build/gen

rm -rf My_Build/build
echo "creating My_Build/build/"
mkdir My_Build/build


rm -rf My_Build/compiled_resources
echo "creating My_Build/compiled_resources"
mkdir My_Build/compiled_resources

rm -rf My_Build/compiled_resources_dependency
echo "creating My_Build/compiled_resources_dependency"
mkdir My_Build/compiled_resources_dependency
