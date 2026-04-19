# Práctica 4 - Sistema de Gestión de Envíos

## ¿Qué es?

Es una aplicación web simple construida con **Spring Boot** que gestiona solicitudes de envío. Permite listar todas las peticiones de envío que están registradas en la base de datos.

## Qué se usó

### Tecnologías principales:
- **Spring Boot 3.5.13** - Framework principal para la aplicación
- **Java 17** - Lenguaje de programación
- **Spring Data JPA** - Para acceder y manipular datos en la base de datos
- **Spring Validation** - Para validar que los datos sean correctos
- **Maven** - Herramienta para gestionar dependencias y construir el proyecto
- **Lombok** - Herramienta para creación de métodos, cohstructores y funcionalidades básicas

### Base de datos:
- **H2** - Base de datos en memoria para desarrollo (us: sa; ps: password)
- Usa **SQL scripts** (`schema.sql` (omitido al ser la tabla igual que la entidad) y `data.sql`) para crear tablas e insertar datos

## Funcionalidades

- **Listar envíos**: Accede a `/api/listar` para obtener todas las solicitudes de envío registradas
- **DTOs**: Convierte datos entre la base de datos y la API de forma automática
- **Mappers**: Traduce entidades de base de datos a DTOs listos para usar

## Estructura del proyecto

```
src/
├── main/
│   ├── java/com/gregorio/practica4/
│   │   ├── controller/      → Endpoints REST
│   │   ├── service/         → Lógica de negocio
│   │   ├── entity/          → Modelos de base de datos
│   │   ├── dto/             → Objetos de transferencia
│   │   ├── mapper/          → Conversión de datos
│   │   └── repository/      → Acceso a datos
│   └── resources/
│       ├── schema.sql       → Estructura de la BD
│       └── data.sql         → Datos iniciales
└── test/                    → Pruebas unitarias
```

## Donde encontrar:

La aplicación estará disponible en `http://localhost:8090`
La base de datos estará disponible en http://localhost:8090/h2-console/login.do

## Endpoints

| Método | URL | Descripción |
|--------|-----|-------------|
| GET | `/api/listar` | Obtiene todas las solicitudes de envío |

---

*Proyecto de práctica 4 - Gestión de envíos con Spring Boot*
