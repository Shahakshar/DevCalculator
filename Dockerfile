FROM ubuntu:latest
COPY calculator.sh calculator.sh
RUN chmod u+x calculator.sh
CMD ["/bin/bash", "./calculator.sh"]

