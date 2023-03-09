
- [Introducción](#introducción)
- [Prerequisito(s)](#prerequisitos)
- [Docker](#docker)

# Introducción

El repositorio contiene 2 proyectos, el cliente que genera un mensaje hacia el broker. El servidor procesa el mensaje ingresado en el broker.

# Prerequisito(s)

- Docker
- ActiveMQ

# Docker

Ejecutar el siguiente comando en docker.

```
    docker run -d --hostname localhost --name rabbitmq -p 5672:5672 -p 5673:5673 -p 15672:15672 rabbitmq:3-management
```

Consola administrativa: http://localhost:8161/console/auth/login \
user: admin \
password: admin \
Puerto petición cola: 61616
