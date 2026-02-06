const API = "http://localhost:8080/api/movies";

fetch(API).then(r => r.json()).then(d => render(d, "movies"));
fetch(API + "/vijay").then(r => r.json()).then(d => render(d, "vijay"));

function loadRecommended() {
    fetch(API + "/recommend?genre=Action&rating=8")
        .then(r => r.json())
        .then(d => render(d, "recommended"));
}

document.getElementById("search").addEventListener("keyup", e => {
    fetch(API + "/search?q=" + e.target.value)
        .then(r => r.json())
        .then(d => render(d, "movies"));
});

function render(list, id) {
    const box = document.getElementById(id);
    box.innerHTML = "";
    list.forEach(m => {
        box.innerHTML += `
      <div class="movie">
        <img src="${m.posterUrl}">
        <p>${m.title}</p>
        <small>${m.genre} • ⭐ ${m.rating}</small>
      </div>`;
    });
}
