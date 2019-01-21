# Fescar Home ENV Config

## DB deploy by docker

 docker run --name fescar-account -e MYSQL_ROOT_PASSWORD=lotus -d -p 3316:3306 -v /data/var/mysql-fescar/fescar-account:/var/lib/mysql-fescar-account mysql:latest
 docker run --name fescar-order   -e MYSQL_ROOT_PASSWORD=lotus -d -p 3326:3306 -v /data/var/mysql-fescar/fescar-order:/var/lib/mysql-fescar-order  mysql:latest
 docker run --name fescar-storage -e MYSQL_ROOT_PASSWORD=lotus -d -p 3336:3306 -v /data/var/mysql-fescar/fescar-storage:/var/lib/mysql-fescar-storage mysql:latest

  

## Ubuntu Server:

Server.192.168.1.6

fescar-server package: /home/jinghe/Software/fescar-server-0.1.1.tar.gz
deploy location: /home/jinghe/Software/fescar-server/

start server: 
sh fescar-server.sh 8091 /home/jinghe/fescar/data

## how to deploy it to Docker