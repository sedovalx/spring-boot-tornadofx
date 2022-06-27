FROM openjdk:11

ENV LANG=C.UTF-8

MAINTAINER Alexander Sedov <alexander.sedov@jetbrains.com>

# Support various rvm, nvm etc stuff which requires executing profile scripts (-l)
SHELL ["/bin/bash", "-lc"]
CMD ["/bin/bash", "-l"]

# Set debconf to run non-interactively
RUN echo 'debconf debconf/frontend select Noninteractive' | debconf-set-selections

RUN apt-get update && apt-get install -y apt-utils apt-transport-https

RUN apt-get install -y git
