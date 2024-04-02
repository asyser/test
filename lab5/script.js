document.addEventListener('DOMContentLoaded', function() {
    const inputField = document.getElementById('inputField');
    const checkButton = document.getElementById('checkButton');
    const res1 = document.getElementById('res1');
    const res2 = document.getElementById('res2');

    checkButton.addEventListener('click', function() {
        const inputValue = inputField.value;

        const regex1 = /^abcdefghijklmnopqrstuv5320736$/;
        const regex2 = /^\{?[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}\}?$/i;

        if (regex1.test(inputValue)) {
            res1.textContent = 'Строка соответствует "abcdefghijklmnopqrstuv5320736"';
        } else {
            res1.textContent = 'Строка не соответствует "abcdefghijklmnopqrstuv5320736"';
        }

        if (regex2.test(inputValue)) {
            res2.textContent = 'Строка является GUID';
        } else {
            res2.textContent = 'Строка не является GUID';
        }
    });
});