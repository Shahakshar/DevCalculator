FROM ubuntu:latest
COPY calculator.sh /calculator.sh
RUN chmod +x /calculator.sh
CMD ["/bin/bash", "/calculator.sh"]

