fun main() {
    val student:Student? = null

    val unit = student?.let { st -> //работает с объектом через it, не возвращает выходного значения
        st.hi()
        st.bye()
        st.name = "Kolya"

    }
    println(student?.name)

    val student2 = student?.apply { //работает с параметрами объекта, не возвращает выходного значения, но отдает структуру всегда
        hi()
        bye()
        name = "LolKek"
    }
    println(student?.name)
    println(student2?.name)

    val ageStudent = Student().run {
        hi()
        bye()
        name="Peppa"
        age = 10
        age
    }
    println(ageStudent)
    val ageStudent2 = with(Student()) { //аналог run
        hi()
        bye()
        age=15
        age
    }
//    println(ageStudent2)

    val student4 = Student().also { st ->
        st.bye()
        st.hi()
        st.name = "Masha"
    }

}