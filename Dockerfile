FROM debian:9

RUN apt-get update -yq \
    && apt-get install curl gnupg -yg \
    && curl -sL https://deb.nodesource.com/setup_10.x | bash \
    && apt-get install nodejs -yq \
    && apt-get clean -y
ADD ./app/

WORKDIR /app

CMD npm run start