# 📦 Spring Boot Kafka Basic Implementation

This repository demonstrates a **basic Apache Kafka integration with Spring Boot**, showcasing how to create a simple **producer** and **consumer** setup. It serves as a beginner-friendly example for understanding Kafka's core messaging flow using Spring Boot.

---

## 🚀 Features

- 🔄 Kafka Producer & Consumer configuration
- 📨 Publish and consume plain text messages
- ✅ Simple REST API to trigger Kafka events
- 🧪 Logs message consumption in real-time
- 🧰 Uses Spring Kafka library

---

## 🧰 Tech Stack

- Java 17+
- Spring Boot 3+
- Apache Kafka
- Spring Kafka
- Maven

---

## 📦 Project Structure

```bash
kafka-springboot/
├── controller/          # REST endpoint to send messages
├── service/             # Kafka Producer logic
├── config/              # Kafka config (bootstrap servers, topics, etc.)
├── listener/            # Kafka Consumer listener
└── application.properties
