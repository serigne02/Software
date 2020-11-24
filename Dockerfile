FROM debian:9

RUN apt-get update -yq \
    && apt-get install curl gnupg -yg \
    && curl -sL https://deb.nodesource.com/setup_10.x | bash \
    && apt-get install nodejs -yq \
    && apt-get clean -y
ADD ./app/

WORKDIR /app

RUN npm install

CMD npm run start

EXPOSE 2368
VOLUME /app/logs