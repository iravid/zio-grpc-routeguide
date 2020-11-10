FROM adoptopenjdk/openjdk11:debian-slim
RUN set -eux; \
      apt-get update && \
      apt-get -y install --no-install-recommends curl jq && \
      apt-get clean && \
      rm -rf /var/lib/apt/lists/*
WORKDIR /app
COPY ./target/universal/stage ./
ENTRYPOINT ["/app/bin/zio-grpc-example"]
EXPOSE 8980
STOPSIGNAL SIGTERM
