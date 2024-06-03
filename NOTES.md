# Graphql-Quarkus

Implementing Api with Java, Quarkus, GraphQL and Docker.

### Project description

🚀 This project aims to create an application with microservices architecture by applying the Saga(Orchestration) pattern
with Quarkus and Kafka for all development. Dockerfile files are available for virtualization of microservices.

## Installation and  Technologies

The following technologies were used to carry out the project and it is necessary to install some items:

- Java 21
- Docker
- Maven
- Quarkus
- GraphQL

### Quarkus

Quarkus is a native Java framework in Kubernetes, it was developed for Java virtual machines (JVMs) and native
compilation. It optimizes this language specifically for containers, making this technology an effective platform for
serverless, cloud, and Kubernetes environments.

### Features of Quarkus

- Container first(Fast startup, low memory consumption and work with small images or containers)
- Low memory consumption
- Fast Startup

### For Containers

Whether the application resides in the public cloud or on an internally hosted Kubernetes cluster, features such as fast
startup and low memory consumption are important to keep overall hosting costs down.
Quarkus was built on the philosophy of container prioritization. This means it is optimized for reduced memory usage and
faster boot times in the following ways:

- Advanced Graal/SubstrateVM Compatibility
- Compile-time metadata processing
- Reduction in the use of reflection
- Preboot native images

### GraphQL

GraphQL is a query language for APIs and a runtime for fulfilling those queries with your existing data. GraphQL
provides a complete and understandable description of the data in your API, gives clients the power to ask for exactly
what they need and nothing more, makes it easier to evolve APIs over time, and enables powerful developer tools.

Endpoint: http://localhost:8080/q/graphql-ui/

You will use below Json to run command to create data:

```shell script
mutation CREATE {
      createBank(bank:
        {
        name: "GraphQL Bank", country:"USA"}) {
        id
        name
        country
        }
    }
```

Now you will use the json to query the data entered in the previous json

```shell script

{
  banks{
   id
   name
   country
  }
}
```

Here we finish a Project implementing GraphQL with Quarkus.
