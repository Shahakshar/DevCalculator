FROM ubuntu:latest
RUN apt-get update && apt-get install -y dos2unix
COPY calculator.sh calculator.sh
RUN dos2unix /calculator.sh
RUN chmod +x calculator.sh
CMD ["bash", "/calculator.sh"]
