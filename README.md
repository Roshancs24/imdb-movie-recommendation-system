# 🎬 IMDb Movie Recommendation System

A full-stack IMDb-style Movie Recommendation System built using Spring Boot, Java, MySQL, HTML, CSS, and JavaScript.

This application allows users to browse movies, search by title, filter by genre, view movie posters and ratings, and receive recommendations based on genre and rating similarity.

---

## 🚀 Features

### 🎥 Movie Catalog
- Browse movies in an IMDb-style interface
- View posters, ratings, genres, and languages
- Responsive card-based design

### 🔍 Search Functionality
- Search movies by title
- Instant movie filtering

### 🎭 Genre Filtering
Supports multiple genres:
- Action
- Adventure
- Comedy
- Crime
- Drama
- Fantasy
- Horror
- Romance
- Sci-Fi
- Thriller

### ⭐ Recommendation Engine
- Content-based recommendation system
- Recommends movies using:
  - Genre similarity
  - Rating similarity

### 🔥 Vijay Movies Section
- Dedicated section for Vijay movies
- Displays posters, ratings, and genres

### 🌐 REST APIs
- Fetch all movies
- Search movies
- Filter by genre
- Get recommendations

---

## 🛠️ Tech Stack

### Backend
- Java 17
- Spring Boot
- Spring Data JPA
- Hibernate
- Maven

### Database
- MySQL

### Frontend
- HTML5
- CSS3
- JavaScript

### Tools
- IntelliJ IDEA
- VS Code
- Git
- GitHub
- Postman

---

## 📂 Project Structure

```text
movie-recommendation-system
│
├── backend
│   ├── src/main/java/com/movie/imdb
│   │   ├── controller
│   │   ├── model
│   │   ├── repository
│   │   ├── service
│   │   └── ImdbApplication.java
│   │
│   └── src/main/resources
│
├── frontend
│   ├── index.html
│   ├── style.css
│   └── script.js
│
└── README.md
```

---

## 📡 API Endpoints

### Get All Movies

```http
GET /movies
```

### Search Movies

```http
GET /movies/search?query=leo
```

### Filter By Genre

```http
GET /movies/genre/Action
```

### Vijay Movies

```http
GET /movies/actor/Vijay
```

### Get Recommendations

```http
GET /movies/recommend/1
```

---

## ⚙️ Installation & Setup

### Clone Repository

```bash
git clone https://github.com/Roshancs24/imdb-movie-recommendation-system.git
```

### Navigate to Backend

```bash
cd backend
```

### Run Spring Boot Application

```bash
mvn spring-boot:run
```

Backend Server:

```text
http://localhost:8080
```

### Open Frontend

Open:

```text
frontend/index.html
```

using Live Server or any web browser.

---

## 🎯 Key Highlights

✅ Full-Stack Application

✅ REST API Development

✅ Spring Boot & JPA Integration

✅ MySQL Database Connectivity

✅ IMDb-Style User Interface

✅ Genre-Based Recommendations

✅ Movie Search & Filtering

✅ Responsive Design

---

## 📚 Learning Outcomes

Through this project, I gained practical experience in:

- Spring Boot Development
- REST API Design
- Hibernate & JPA
- MySQL Database Management
- Recommendation System Logic
- Frontend Development
- Git & GitHub Version Control

---

## 👨‍💻 Author

**Roshan C S**

GitHub: https://github.com/Roshancs24

---

## 🚀 Future Enhancements

- User Authentication
- Watchlist Feature
- Movie Reviews & Ratings
- TMDB API Integration
- Collaborative Filtering
- Admin Dashboard
- Netflix-Style Carousel UI

---
