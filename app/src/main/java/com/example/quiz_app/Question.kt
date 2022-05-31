package com.example.quiz_app

data class Question(
    val id: Int,
    val text: String,
    val option1: String,
    val option2: String,
    val option3: String,
    val option4: String,
    val correctAnswer: String
)


fun getQuestions(selected: Int): ArrayList<Question> {
    val data = mapOf(
        1 to arrayListOf(
            Question(
                0,
                "Сколько будет 2 + 2",
                "4",
                "5",
                "3",
                "322",
                "4"
            ),
            Question(
                1,
                "Где мы находимся?",
                "5",
                "Да",
                "Марс",
                "Земля",
                "Земля"
            ),
            Question(
                2,
                "Что такое рекурсия?",
                "Не тот ответ",
                "Что такое рекурсия?",
                "Неправильно",
                "ых",
                "Что такое рекурсия?"
            ),
            Question(
                3,
                "Сколько месяцев в году?",
                "12",
                "Араб",
                "да",
                "11",
                "12"
            ),
            Question(
                4,
                "3*3",
                "9",
                "No",
                "8",
                "3",
                "9"
            ),
        ),
        2 to arrayListOf(
            Question(
                0,
                "Нажми 1",
                "111",
                "11",
                "1",
                "2",
                "1"
            ),
            Question(
                1,
                "Нажми 8",
                "8",
                "1",
                "18",
                "123",
                "8"
            ),

            Question(
                2,
                "Нажми 5",
                "5",
                "4",
                "3",
                "2",
                "5"
            ),
        ),
        3 to arrayListOf(
            Question(
                0,
                "Самая крупная планета солнечной системы",
                "Юпитер",
                "Плутон",
                "Земля",
                "Сатурн",
                "Юпитер"
            ),
            Question(
                1,
                "Сколько планет в солнечной системе",
                "8",
                "50",
                "30",
                "11",
                "8"
            ),
            Question(
                2,
                "Какой по счёту от солнца является земля",
                "6",
                "4",
                "5",
                "3",
                "3"
            ),
        ),
        4 to arrayListOf(
            Question(
                0,
                "Выбери наудачу",
                "1",
                "666",
                "53",
                "122",
                "53"
            ),
            Question(
                1,
                "первые 3 буквы алфавита",
                "абв",
                "123",
                "где",
                "пук",
                "абв"
            ),
            Question(
                2,
                "Найди букву в",
                "бббббббббббббб",
                "бббббббббббббб",
                "бббббббббббббб",
                "ббббббббвббббб",
                "ббббббббвббббб"
            ),
        ),
    )

    return data[selected]!!

}