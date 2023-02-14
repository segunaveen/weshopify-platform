# base image
FROM openjdk:11

ARG WORKING_DIR=/opt/weshopify-backend-app
ARG ARTIFACT_NAME=weshopify-platform-backend.jar
ARG SERVICE_PORT=8082

ENV ARTIFACT_NAME_ENV=${ARTIFACT_NAME}
# create the a directory
RUN mkdir ${WORKING_DIR}

# make it as a working directory
WORKDIR ${WORKING_DIR}

COPY target/${ARTIFACT_NAME} ${WORKING_DIR}

EXPOSE ${SERVICE_PORT}
#the artifact name we are supplying to CMD should be an environment variable
# when an environment variable has been supplied we must have to take the bash as 
# an cmd argument to take the artifact name as command line arguement.
#CMD ["bash", "-c"]
#ENTRYPOINT ["bash","-c", "java -jar ${ARTIFACT_NAME_ENV}" ]
CMD ["bash","-c", "java -jar ${ARTIFACT_NAME_ENV}" ]

