FROM ubuntu:14.04

WORKDIR /app

ADD . /app

RUN sudo apt-get update && \
    sudo apt-get install -y gcc && \
    sudo apt-get install -y wget python && \
    wget https://bootstrap.pypa.io/get-pip.py && sudo python get-pip.py && \
    pip install mxnet && \
    sudo apt-get install -y graphviz && \
    pip install graphviz 

EXPOSE 22

CMD python app.py
