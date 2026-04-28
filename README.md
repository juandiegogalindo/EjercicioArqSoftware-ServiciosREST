# Muebles de los Alpes - Servicios REST

Proyecto académico desarrollado en **Java EE** con **NetBeans 8.2** y **GlassFish 4.1**, basado en el laboratorio de Servicios REST.  
El objetivo es exponer la lógica de negocio de la aplicación **Muebles de los Alpes** a través de servicios web RESTful, utilizando objetos *mock* para simular la persistencia.

---

## Objetivos del laboratorio
- Utilizar REST para exponer servicios de lógica de una aplicación implementada con JEE.
- Implementar objetos *mock* para facilitar las pruebas de los servicios REST.
- Probar los servicios con herramientas como **Postman**.

---

## Arquitectura del proyecto
El proyecto se organiza en tres módulos principales:

- **mueblesdelosalpes.backend**  
  Contiene la lógica de negocio y la persistencia simulada (*mock*).  
  - `ServicioPersistenciaMock`  
  - `ServicioCatalogoMock`  
  - `ServicioVendedoresMock`  

- **mueblesdelosalpes.servicios**  
  Expone los servicios REST que interactúan con el backend.  
  - `CatalogoService`  
  - `VendedoresService`  
  - `OfertaService` (implementación solicitada en el laboratorio)  

- **mueblesdelosalpes.interfaz**  
  Módulo de interfaz web (no utilizado en este laboratorio).

---

## Configuración
1. Clonar el repositorio en NetBeans.  
2. Realizar **Clean and Build** de los módulos `backend` y `servicios`.  
3. Desplegar únicamente el módulo `mueblesdelosalpes.servicios` en GlassFish 4.1.  
4. Acceder a los servicios REST en la ruta: http://localhost:8080/mueblesdelosalpes.servicios/webresources/

---

## Pruebas con Postman
- Se recomienda usar **Postman** para probar los endpoints.  
- Ejemplos de pruebas incluidas en el entregable:  
- Pantallazo de creación de un vendedor.  
- Pantallazo de eliminación de un vendedor.  
- Pantallazo de creación de una oferta.  
- Pantallazo de listado de ofertas.

---

## Entregables
- Código fuente modificado con los servicios REST.  
- Evidencias en Postman: creación y visualización de vendedores y ofertas.  
- README con instrucciones de ejecución y pruebas.
