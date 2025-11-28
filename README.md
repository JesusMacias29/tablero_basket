🏀 Basketball Score App - Tarea Final 1º Trimestre

---

👤 Realizado por

JESÚS MACÍAS
---
---

Este proyecto es una aplicación Android diseñada para gestionar el marcador de un partido de baloncesto. La app permite gestionar puntuaciones en tiempo real, navegar entre pantallas y usar Data Binding para optimizar el acceso a las vistas. Además, tiene una interfaz amigable y una experiencia de usuario fluida. 😎

---

📜 Descripción General

La aplicación tiene dos pantallas principales:

MainActivity:
Permite gestionar el marcador del partido en tiempo real. Los botones permiten sumar 1 y 2 puntos a los equipos, y también restar puntos. Además, hay botones para resetear el marcador y ver los resultados finales. 🔄

ScoreActivity:
Muestra los resultados finales del partido, indicando quién ganó o si hubo un empate. 🏆

---

🔧 Requisitos Funcionales

Interfaz de usuario clara y legible utilizando LinearLayout y ConstraintLayout. 📱

Lógica de marcador:

Los botones +1, +2, y +3 permiten gestionar la puntuación.

Validación para evitar puntuaciones negativas. ❌

El botón de reset reinicia ambos marcadores a 0. 🔄

Navegación entre pantallas con Explicit Intents, pasando datos entre actividades con Intent.putExtra. 🚀

Resultados automáticos con mensaje indicando el ganador. 🎉

Uso de Data Binding para acceder a las vistas sin necesidad de findViewById. ⚡

---


🗂 Estructura del Proyecto
MainActivity:

Pantalla principal con los botones para sumar puntos a los equipos, restar puntos y resetear los marcadores.

Botón para navegar a ScoreActivity y mostrar los resultados. 📊

ScoreActivity:

Pantalla para mostrar el marcador final y el ganador. 🥇

Archivos Clave

activity_main.xml: Diseño de la pantalla principal con los controles de marcador.

activity_score.xml: Diseño de la pantalla de resultados finales.

MainActivity.java: Lógica para manejar la interfaz y las acciones del marcador.

ScoreActivity.java: Lógica para mostrar los resultados finales.

---

🛠 Buenas Prácticas Aplicadas

Nombres claros de variables y métodos para mejorar la legibilidad del código. ✍️

Comentarios explicativos en el código para aclarar las funciones críticas. 💬

Código limpio: Se eliminaron imports innecesarios y código redundante. ✂️

Uso de constantes: Se definieron constantes para evitar el uso de cadenas literales repetidas. 🔒

---

📚 Tecnologías Utilizadas

Android Studio: IDE utilizado para el desarrollo. 💻

Data Binding: Simplificación del código y mejora del acceso a las vistas. 📈

Intents explícitos: Para navegar entre actividades y pasar datos entre ellas. 🔄

Java: Lenguaje utilizado para desarrollar la lógica de la aplicación. 🖥

---

🚀 Mejoras Futuras

Internacionalización: Uso de strings.xml para gestionar textos en múltiples idiomas. 🌍

Validación de entrada de datos: Mejorar la validación de los botones para evitar errores. 🛑

Optimización de la UI: Mejorar el diseño visual y la fluidez de la interfaz. 🎨

---

Capturas de pantalla de ambas actividades mostrando la interfaz y las funcionalidades. 📸

---

LOGO DE MI APP
---
<img width="200" height="535" alt="image" src="https://github.com/user-attachments/assets/790c62ca-3e5e-451b-91e0-1fde95c3a5a4" />

---

<img width="239" height="532" alt="image" src="https://github.com/user-attachments/assets/52b76c11-2420-42b0-a1c6-89e0bfb469e6" />

---

<img width="229" height="493" alt="image" src="https://github.com/user-attachments/assets/19de5a23-6726-49b0-85ff-858023ba8155" />

---

<img width="229" height="65" alt="image" src="https://github.com/user-attachments/assets/7cd6ec67-066c-46ed-bdd4-dad87dfec9eb" />

---

<img width="219" height="59" alt="image" src="https://github.com/user-attachments/assets/313b5b36-af53-45bd-a5c7-2fa1ac7d8f03" />

---

🎯 Conclusión

Este proyecto muestra cómo implementar las funcionalidades esenciales de una aplicación de marcador de baloncesto utilizando buenas prácticas en Android. Desde el uso de Data Binding para simplificar el código, hasta la navegación eficiente entre actividades y la correcta gestión del estado de la aplicación. 🏀💡

Instrucciones de Entrega 📥

Código fuente completo en un repositorio de GitHub. 📂

Archivo README.md con la descripción del proyecto. 📝

---






