#!/usr/bin/env bash

if [[ -d ./src/main/g8 ]]; then

    if ! command -v g8 &> /dev/null
    then
        echo "[ERROR] g8 command cannot be found, please install g8 following http://www.foundweekends.org/giter8/setup.html"
        exit -1
    fi

    export TEMPLATE=`pwd | xargs basename`

    echo "Creating new project target/sandbox/cross-scala from the ${TEMPLATE} template ..."
    
    mkdir -p target/sandbox
    cd target/sandbox
    find . -not -name .git -delete

    g8 file://../../../${TEMPLATE} --libraryName="Hello World" --githubUser="Artur Opala" --githubEmail="foo@gmail.com" --package="com.github" -o cross-scala "$@"

    if [[ -d ./cross-scala ]]; then
        cd cross-scala
        git init
	git add .
	git commit -m start
        sbt +test
        echo "Done, created new project in target/sandbox/cross-scala"
        exit 0
    else
        echo "[ERROR] something went wrong, project has not been created in target/sandbox/cross-scala"
        exit -1
    fi

else

    echo "[ERROR] run the script ./test.sh in the template's root folder"
    exit -1

fi