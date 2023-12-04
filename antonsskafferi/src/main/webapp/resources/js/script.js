document.addEventListener("DOMContentLoaded", function () {
    const calendar = document.getElementById("calendar");
    const popup = document.getElementById("popup");
    const textbox = document.getElementById("textbox");

    // Function to create calendar days
    function createCalendar() {
        for (let day = 1; day <= 31; day++) {
            const dayElement = document.createElement("div");
            dayElement.className = "day";
            dayElement.textContent = day;
            dayElement.addEventListener("click", function () {
                openPopup(day);
            });
            calendar.appendChild(dayElement);
        }
    }

    // Function to open popup with textbox
    function openPopup(day) {
        textbox.value = ""; // Clear previous input
        popup.classList.remove("hidden");
    }

    // Function to close popup
    window.closePopup = function () {
        popup.classList.add("hidden");
    };

    createCalendar();
});
