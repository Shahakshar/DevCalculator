FROM ubuntu:latest
COPY calculator.sh calculator.sh
RUN chmod +x calculator.sh
CMD ["bash", "./calculator.sh"]
