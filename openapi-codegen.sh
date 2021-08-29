#/bin/sh

CODEGEN_VERSION="0.0.53-SNAPSHOT"
CODEGEN_JAR=~/wutsi-codegen/wutsi-codegen-${CODEGEN_VERSION}.jar

API_NAME=wutsi-sms
API_URL=https://raw.githubusercontent.com/wutsi/wutsi-openapi/master/src/openapi/sms/v1/sms_api.yaml
GITHUB_USER=wutsi


echo "Generating code from ${API_URL}"
java -jar ${CODEGEN_JAR} sdk \
    -in ${API_URL} \
    -out . \
    -name ${API_NAME} \
    -package com.wutsi.platform.sms \
    -jdk 11 \
    -github_user ${GITHUB_USER} \
    -github_project ${API_NAME}-sdk-kotlin

if [ $? -eq 0 ]
then
    echo Code Cleanup...
    mvn antrun:run@ktlint-format
    mvn antrun:run@ktlint-format

else
    echo "FAILED"
    exit -1
fi
