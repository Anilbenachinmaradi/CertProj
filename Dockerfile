FROM ubuntu:16.04
MAINTAINER anilanimax@gmail.com
RUN apt-get update -y && apt-get upgrade -y
RUN apt-get install -y apache2
RUN apt-get update && apt-get upgrade -y
RUN apt-get install php -y
RUN apt-get install php libapache2-mod-php
RUN a2enmod mpm_prefork && a2enmod php7.0
COPY website /var/www/html/
EXPOSE 80
CMD ["apache2ctl", "-D", "FOREGROUND"]