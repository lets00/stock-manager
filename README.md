# stock-manager

This project implements the stock-manager service passed as challenge by Inatel.

## How to run

First, you must have installed on your machine docker and docker-compose. After that, executes:

```sh
$ docker-compose up -d
or
# docker-compose up -d
```

## Routes

### GET
* http://localhost:8080/stock
Returns all stocks on-memmory stored on server

### POST
* http://localhost:8080/stock
Add a new stock

* http://localhost:8080/notification
Add a new server info to notificate
